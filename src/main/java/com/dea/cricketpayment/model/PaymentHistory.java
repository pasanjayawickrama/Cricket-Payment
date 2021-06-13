package com.dea.cricketpayment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "payment_history")
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_no")
    private int payment_no;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    private Player player;

    @Column(name = "wage")
    private int wage;

    @Column(name = "bonus")
    private double bonus;

    @Column(name = "trophy_bonus")
    private double trophy_bonus;

    @Column(name = "total_payment")
    private double total_payment;

    @Column(name = "man_of_the_match")
    private boolean man_of_the_match;

    @Column(name = "man_of_the_series")
    private boolean man_of_the_series;

    public int getPayment_no() {
        return payment_no;
    }

    public void setPayment_no(int payment_no) {
        this.payment_no = payment_no;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTrophy_bonus() {
        return trophy_bonus;
    }

    public void setTrophy_bonus(double trophy_bonus) {
        this.trophy_bonus = trophy_bonus;
    }

    public double getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(double total_payment) {
        this.total_payment = total_payment;
    }

    public boolean isMan_of_the_match() {
        return man_of_the_match;
    }

    public void setMan_of_the_match(boolean man_of_the_match) {
        this.man_of_the_match = man_of_the_match;
    }

    public boolean isMan_of_the_series() {
        return man_of_the_series;
    }

    public void setMan_of_the_series(boolean man_of_the_series) {
        this.man_of_the_series = man_of_the_series;
    }

    public PaymentHistory() {

    }

    public PaymentHistory(Player player, int wage, double bonus, double trophy_bonus, double total_payment) {
        this.player = player;
        this.wage = wage;
        this.bonus = bonus;
        this.trophy_bonus = trophy_bonus;
        this.total_payment = total_payment;
    }

    @Override
    public String toString() {
        return "PaymentHistory{" +
                "payment_no=" + payment_no +
                ", player=" + player +
                ", wage=" + wage +
                ", bonus=" + bonus +
                ", trophy_bonus=" + trophy_bonus +
                ", total_payment=" + total_payment +
                '}';
    }
}
