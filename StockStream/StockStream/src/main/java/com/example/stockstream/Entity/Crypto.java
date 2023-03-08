package com.example.stockstream.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Cryptos")
public class Crypto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CryptoId;

    @Column(name = "CryptoName")
    private String CryptoName;
    @Column(name = "CryptoOriginalBuy")
    private int CryptoOriginalBuy;
    @Column(name = "CryptoOriginalSell")
    private int CryptoOriginalSell;
    @Column(name = "CryptoRateDay")
    private int CryptoRateDay;
    @Column(name = "CryptoRateWeek")
    private int CryptoRateWeek;
    @Column(name = "CryptoRateMonth")
    private int CryptoRateMonth;
    @Column(name = "CryptoRateYear")
    private int CryptoRateYear;

    public Long getCryptoId() {return CryptoId;}
    public void setCryptoId(Long cryptoId) {CryptoId = cryptoId;}
    public String getCryptoName() {return CryptoName;}
    public void setCryptoName(String cryptoName) {CryptoName = cryptoName;}
    public int getCryptoOriginalBuy() {return CryptoOriginalBuy;}
    public void setCryptoOriginalBuy(int cryptoOriginalBuy) {CryptoOriginalBuy = cryptoOriginalBuy;}
    public int getCryptoOriginalSell() {return CryptoOriginalSell;}
    public void setCryptoOriginalSell(int cryptoOriginalSell) {CryptoOriginalSell = cryptoOriginalSell;}
    public int getCryptoRateDay() {return CryptoRateDay;}
    public void setCryptoRateDay(int cryptoRateDay) {CryptoRateDay = cryptoRateDay;}
    public int getCryptoRateWeek() {return CryptoRateWeek;}
    public void setCryptoRateWeek(int cryptoRateWeek) {CryptoRateWeek = cryptoRateWeek;}
    public int getCryptoRateMonth() {return CryptoRateMonth;}
    public void setCryptoRateMonth(int cryptoRateMonth) {CryptoRateMonth = cryptoRateMonth;}
    public int getCryptoRateYear() {return CryptoRateYear;}
    public void setCryptoRateYear(int cryptoRateYear) {CryptoRateYear = cryptoRateYear;}

    public Crypto() {
    }

    public Crypto(String cryptoName, int cryptoOriginalBuy, int cryptoOriginalSell, int cryptoRateDay, int cryptoRateWeek, int cryptoRateMonth, int cryptoRateYear) {
        CryptoName = cryptoName;
        CryptoOriginalBuy = cryptoOriginalBuy;
        CryptoOriginalSell = cryptoOriginalSell;
        CryptoRateDay = cryptoRateDay;
        CryptoRateWeek = cryptoRateWeek;
        CryptoRateMonth = cryptoRateMonth;
        CryptoRateYear = cryptoRateYear;
    }
}
