package com.dea.cricketpayment.repository;

import com.dea.cricketpayment.model.PaymentHistory;
import com.dea.cricketpayment.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Integer> {

    @Query(value = "SELECT SUM(bonus) FROM payment_history WHERE player_id = ?1", nativeQuery = true)
    int getBonusByPlayerId(int player);

    boolean existsPaymentHistoryByPlayer(Player player);
}
