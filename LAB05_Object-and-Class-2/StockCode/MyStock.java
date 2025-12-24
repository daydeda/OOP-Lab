package StockCode;

public class MyStock {
    public static void main(String[] args) {
        Stock stock = new Stock("NVDA", "Nvidia Corporation");
        stock.setPreviousClosingPrice(183.69);
        stock.setCurrentPrice(189.21);
        System.out.println("Stock: " + stock.name);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
        System.out.println("Price Change: " + stock.getChangePercent() + "%");
    }
}