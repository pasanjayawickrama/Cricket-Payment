package com.dea.cricketpayment.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id")
    private int player_id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "tier")
    private String tier;

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Player(String name, int String, String tier) {
        this.name = name;
        this.category = category;
        this.tier = tier;
    }

    public Player(int player_id){
        this.player_id = player_id;
    }

    public Player() {

    }


    @Override
    public String toString() {
        return "Player{" +
                "id=" + player_id +
                ", name=" + name +
                ", category=" + category +
                ", tier=" + tier +
                '}';
    }
}
