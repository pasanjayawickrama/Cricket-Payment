package com.dea.cricketpayment.controller;

import com.dea.cricketpayment.model.Player;
import com.dea.cricketpayment.model.Salary;
import com.dea.cricketpayment.services.PlayerService;
import com.dea.cricketpayment.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping("/get-by-id")
    List<Player> getPlayerById(@RequestBody Player player){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX::");
        return null;
    }
}
