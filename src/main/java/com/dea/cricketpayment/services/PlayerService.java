package com.dea.cricketpayment.services;

import com.dea.cricketpayment.Dto.PaymentDto;
import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.model.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getPlayerById(Player player);

}
