package com.example.stockstream.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Stocks")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StockId;

    @Column(name = "StockName")
    private String StockName;
    @Column(name = "StockOriginalBuy")
    private int StockOriginalBuy;
    @Column(name = "StockOriginalSell")
    private int StockOriginalSell;
    @Column(name = "StockRateDay")
    private int StockRateDay;
    @Column(name = "StockRateWeek")
    private int StockRateWeek;
    @Column(name = "StockRateMonth")
    private int StockRateMonth;
    @Column(name = "StockRateYear")
    private int StockRateYear;

    public Long getStockId() {return StockId;}
    public void setStockId(Long stockId) {StockId = stockId;}public String getStockName() {return StockName;}
    public void setStockName(String stockName) {StockName = stockName;}public int getStockOriginalBuy() {return StockOriginalBuy;}
    public void setStockOriginalBuy(int stockOriginalBuy) {StockOriginalBuy = stockOriginalBuy;}
    public int getStockOriginalSell() {return StockOriginalSell;}
    public void setStockOriginalSell(int stockOriginalSell) {StockOriginalSell = stockOriginalSell;}
    public int getStockRateDay() {return StockRateDay;}
    public void setStockRateDay(int stockRateDay) {StockRateDay = stockRateDay;}
    public int getStockRateWeek() {return StockRateWeek;}
    public void setStockRateWeek(int stockRateWeek) {StockRateWeek = stockRateWeek;}
    public int getStockRateMonth() {return StockRateMonth;}
    public void setStockRateMonth(int stockRateMonth) {StockRateMonth = stockRateMonth;}
    public int getStockRateYear() {return StockRateYear;}
    public void setStockRateYear(int stockRateYear) {StockRateYear = stockRateYear;}

    public Stock() {
    }
    public Stock(String stockName, int stockOriginalBuy, int stockOriginalSell, int stockRateDay, int stockRateWeek, int stockRateMonth, int stockRateYear) {
        StockName = stockName;
        StockOriginalBuy = stockOriginalBuy;
        StockOriginalSell = stockOriginalSell;
        StockRateDay = stockRateDay;
        StockRateWeek = stockRateWeek;
        StockRateMonth = stockRateMonth;
        StockRateYear = stockRateYear;
    }
}
