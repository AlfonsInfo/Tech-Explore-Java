package com.example.demo.designpattern.behavioral.observer.notifsaham;


import java.util.ArrayList;
import java.util.List;

// Subject
class Stock {
    private String symbol;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

// Observer
interface Observer {
    void update(double price);
}

// Concrete Observer
class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Hey " + name + ", the stock price is now: " + price);
    }
}

class OrangBiasa implements Observer{
    private String name;

    public OrangBiasa(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Hey " + name + ", Infooo : " + price);
    }
}
public class NotifSahamDemo {
    public static void main(String[] args) {
        //* Productnya
        Stock appleStock = new Stock("AAPL", 150.00);

        //* Investor sebagai observer
        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Jane");
        OrangBiasa orangBiasa = new OrangBiasa("bambang");


        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);
        appleStock.addObserver(orangBiasa);

        appleStock.setPrice(155.00); // Notify all investors about the price change



    }
}
