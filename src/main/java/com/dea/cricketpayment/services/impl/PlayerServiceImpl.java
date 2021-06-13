package com.dea.cricketpayment.services.impl;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.model.Player;
import com.dea.cricketpayment.repository.PaymentHistoryRepository;
import com.dea.cricketpayment.repository.PlayerRepository;
import com.dea.cricketpayment.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerRepository playerRepository;


    @Override
    public List<Player> getPlayerById(Player player){

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX::");


        return null;

    }

}
