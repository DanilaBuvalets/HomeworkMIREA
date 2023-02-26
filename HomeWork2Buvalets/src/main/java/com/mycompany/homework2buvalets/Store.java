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
public class Store {
    String nameStore;
    private String nameStreet;
    private int areaStore;
    private int numberOfFloorsOfStore;

    public Store(String nameStore, String nameStreet, int areaStore, int numberOfFloorsOfStore) {
        this.nameStore = nameStore;
        this.nameStreet = nameStreet;
        this.areaStore = areaStore;
        this.numberOfFloorsOfStore = numberOfFloorsOfStore;
    }

    public Store() {
    }

    public void setNameStore() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Введите имя магазина - ");
        this.nameStore = discriptionStore.next();
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStreet() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Введите название улицы - ");
        this.nameStreet = discriptionStore.next();
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setAreaStore() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Введите площадь магазина - ");
        this.areaStore = discriptionStore.nextInt();
    }

    public void setNumberOfFloorsOfStore() {
        Scanner discriptionStore = new Scanner(System.in);
        System.out.println("Введите кол-во этажей - ");
        this.numberOfFloorsOfStore = discriptionStore.nextInt();
    }
    
    public void employeesWorking(){
        System.out.println("Магазин работает");
    }
      
    public void employeesNotWorking(){
        System.out.println("Магазин не работает");
    }
    
    public void visitors(){
        Scanner discriptionStore = new Scanner (System.in);
        int quantityVisitors = discriptionStore.nextInt();
        System.out.println("Посетилей за день " + quantityVisitors);    
    }
    
    @Override
    public String toString() {
        return "Название нашего магазина " + nameStore + ", Магазин находиться на улице " + nameStreet + ", Площадь магазина "+ areaStore + " квадратных метров" + ", Наш магазин включает в себя " + numberOfFloorsOfStore + " этажа";
    }
}
