/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2buvalets;

import java.util.Scanner;
/**
 *
 * @author danil
 */
public class GameStore extends Store {
    private String bestGame;
    private int quantityGame;
    private int averagePrice;
    private int minimumProfit;

    public GameStore(String nameStore, String nameStreet, int areaStore, int numberOfFloorsOfStore) {
        super(nameStore, nameStreet, areaStore, numberOfFloorsOfStore);
    }

    public GameStore(String bestGame, int quantityGame, int averagePrice, int minimumProfit, String nameStore, String nameStreet, int areaStore, int numberOfFloorsOfStore) {
        super(nameStore, nameStreet, areaStore, numberOfFloorsOfStore);
        this.bestGame = bestGame;
        this.quantityGame = quantityGame;
        this.averagePrice = averagePrice;
        this.minimumProfit = minimumProfit;
    }

    public GameStore() {
    }

    public int getAveragePrice() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Средняя цена игры - ");
        return this.averagePrice = discriptionStore.nextInt();
    }
    
    public String getBestGame() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Самая продаваемая игра - ");
        return this.bestGame = discriptionStore.next();
    }

    public int getMinimumProfit() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Минимальная прибыль магазина - ");
        return this.minimumProfit = discriptionStore.nextInt();
    }

    public int getQuantityGame() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Игр в наличии - ");
        return this.quantityGame = discriptionStore.nextInt();
    }
    
    public void inStockShooter(){
        System.out.println("Различные шутеры в наличии");
    }
    
    public void inStockMMORPG(){
        System.out.println("Различные ММО РПГ в наличии");
    }
    
    public void inStockStrategies(){
        System.out.println("Различные стратегии в наличии");
    } 
    
    
    @Override
    public String toString() {
        return "Хит продаж " + bestGame + ", В наличии более " + quantityGame + " игр" + ",  Средняя цена " + averagePrice + " рублей" + ", Минимальная прибыль с продаж " + minimumProfit + " рублей";
    }
    
    
} 
