package com.example.stockstream.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Wallets")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long WalletId;

    @Column(name = "Balance")
    private int Balance;
    @Column(name = "AllTimeMade")
    private int AllTimeMade;
    @Column(name = "AllTimeLost")
    private int AllTimeLost;
    @Column(name = "MaxProfit")
    private int MaxProfit;
    @Column(name = "MinProfit")
    private int MinProfit;

    public Long getWalletId() {return WalletId;}
    public void setWalletId(Long walletId) {WalletId = walletId;}
    public int getBalance() {return Balance;}
    public void setBalance(int balance) {Balance = balance;}
    public int getAllTimeMade() {return AllTimeMade;}
    public void setAllTimeMade(int allTimeMade) {AllTimeMade = allTimeMade;}
    public int getAllTimeLost() {return AllTimeLost;}
    public void setAllTimeLost(int allTimeLost) {AllTimeLost = allTimeLost;}
    public int getMaxProfit() {return MaxProfit;}
    public void setMaxProfit(int maxProfit) {MaxProfit = maxProfit;}
    public int getMinProfit() {return MinProfit;}
    public void setMinProfit(int minProfit) {MinProfit = minProfit;}

    public Wallet() {
        Balance = 100;
        AllTimeMade = 0;
        AllTimeLost = 0;
        MaxProfit = 0;
        MinProfit = 0;
    }
    public Wallet(int balance, int allTimeMade, int allTimeLost, int maxProfit, int minProfit) {
        Balance = balance;
        AllTimeMade = allTimeMade;
        AllTimeLost = allTimeLost;
        MaxProfit = maxProfit;
        MinProfit = minProfit;
    }
}
