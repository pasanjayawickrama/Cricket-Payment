package com.dea.cricketpayment.Dto;

public class PaymentDto {

    private boolean manOfTheMatch;
    private boolean manOfTheSeries;
    private int playerId;
    private boolean trophyWin;
    private String winPosition;
    private double price;

    public PaymentDto(boolean manOfTheMatch, boolean manOfTheSeries, int playerId) {
        this.manOfTheMatch = manOfTheMatch;
        this.manOfTheSeries = manOfTheSeries;
        this.playerId = playerId;
    }

    public PaymentDto(){}

    public boolean isTrophyWin() {
        return trophyWin;
    }

    public void setTrophyWin(boolean trophyWin) {
        this.trophyWin = trophyWin;
    }

    public String getWinPosition() {
        return winPosition;
    }

    public void setWinPosition(String winPosition) {
        this.winPosition = winPosition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isManOfTheMatch() {
        return manOfTheMatch;
    }

    public void setManOfTheMatch(boolean manOfTheMatch) {
        this.manOfTheMatch = manOfTheMatch;
    }

    public boolean isManOfTheSeries() {
        return manOfTheSeries;
    }

    public void setManOfTheSeries(boolean manOfTheSeries) {
        this.manOfTheSeries = manOfTheSeries;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
