package Stocks;

import java.util.*;

public class StocksPortfolio {
    private String name;
    private IStockMarket market;;
    private ArrayList<Stock> stocks = new ArrayList<>();

    public IStockMarket getMarketService(){
        return this.market;
    }

    public void setMarketService(IStockMarket market){
        this.market = market;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getTotalValue(){
        double total = 0;

        for(Stock s : this.stocks){
            total += (this.market.getPrice(s.getName()) * s.getQuantity());
        }

        return total;
    }

    public void addStock(Stock stock){
        this.stocks.add(stock);
    }


}