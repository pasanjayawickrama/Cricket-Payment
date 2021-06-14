package com.dea.cricketpayment.services.impl;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.model.Player;
import com.dea.cricketpayment.model.Salary;
import com.dea.cricketpayment.repository.PaymentHistoryRepository;
import com.dea.cricketpayment.repository.PlayerRepository;
import com.dea.cricketpayment.repository.SalaryRepository;
import com.dea.cricketpayment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.HashMap;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentHistoryRepository paymentHistoryRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    SalaryRepository salaryRepository;


    @Override
    public HashMap<String, Double> doPayment(PaymentDto paymentDto){
        HashMap<String, Double> map = new HashMap<>();
        DecimalFormat df = new DecimalFormat("###.##");

        PaymentHistory paymentHistory = new PaymentHistory();
        Player player = new Player(paymentDto.getPlayerId());

        int wage = getWage(paymentDto.getPlayerId());
        System.out.println(" Wage : " + wage);
        double bonus = 0;
        double bonusLim = wage * 1.5;
        double newTotalBonus = 0;
        double totalPayment = 0;
        double trophyBonus = 0;
        int bonustotalHistory;

        boolean bonusaddition = true;

        if(paymentDto.isManOfTheMatch()){
            bonus = bonus + (wage * 0.1);
            System.out.println("Bonus after man of the match adding" + bonus);
        }
        if(paymentDto.isManOfTheSeries()){
            bonus = bonus + (wage * 0.25);
            System.out.println("Bonus after man of the Series adding" + bonus);
        }

        System.out.println("Bonus = " + bonus);

        if(paymentHistoryRepository.existsPaymentHistoryByPlayer(player)){

            bonustotalHistory = paymentHistoryRepository.getBonusByPlayerId(paymentDto.getPlayerId());
            System.out.println("Bonus Total History : " + bonustotalHistory);

        }else{

            bonustotalHistory = 0;
        }


        newTotalBonus = bonustotalHistory + bonus;
        System.out.println("New Total Bonus : " + newTotalBonus);

        System.out.println("bonusLim :: " + bonusLim);

        System.out.println("bonusaddition : " + bonusaddition);

        if(bonusLim == newTotalBonus){

            bonusaddition = false;
            bonus = 0;

        }else if(newTotalBonus > bonusLim){

            bonusaddition = true;
            bonus = bonusLim - bonustotalHistory;
            map.put("Approved bonus :" , bonus);

        }else{

            bonusaddition = true;
            map.put("Approved bonus :" , bonus);
        }

        if(paymentDto.isTrophyWin()){
            trophyBonus = paymentDto.getPrice() / 15;
            trophyBonus = Double.parseDouble(df.format(trophyBonus));
            map.put("Trophy bonus :" , trophyBonus);
        }

        totalPayment = wage + bonus + trophyBonus;
        totalPayment = Double.parseDouble(df.format(totalPayment));

        paymentHistory.setPlayer(player);
        paymentHistory.setBonus(bonus);
        paymentHistory.setWage(wage);
        paymentHistory.setTotal_payment(totalPayment);
        paymentHistory.setMan_of_the_match(paymentDto.isManOfTheMatch());
        paymentHistory.setMan_of_the_series(paymentDto.isManOfTheSeries());

        paymentHistoryRepository.save(paymentHistory);


        map.put("Basic Salary :" , (double) getWage(paymentDto.getPlayerId()));


        map.put("Total Payment :" , totalPayment);

        return map;

    }

    public int getWage(int playerId){

        int wage = 0;

        Player player = playerRepository.getById(playerId);

        Salary salary = salaryRepository.getSalaryByCategoryAndTier(player.getCategory(),player.getTier());

        wage = salary.getWage();

        return wage;
    }



}
