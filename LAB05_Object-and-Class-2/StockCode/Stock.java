package StockCode;
class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }

    public double setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
        return previousClosingPrice;
    }

    public double setCurrentPrice(double price) {
        this.currentPrice = price;
        return currentPrice;
    }
}