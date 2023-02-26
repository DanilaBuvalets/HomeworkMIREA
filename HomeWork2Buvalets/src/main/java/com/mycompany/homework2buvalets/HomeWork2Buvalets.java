/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework2buvalets;

import java.util.Scanner;

/**
 *
 * @author danil
 */
public class HomeWork2Buvalets {

    public static void main(String[] args) {
        System.out.println("Вариант 5  РИБО-02-21  Бувалец Данила Александрович");
        Store basicStore = new Store();
        basicStore.setNameStore();
        basicStore.setNameStreet();
        basicStore.setAreaStore();
        basicStore.setNumberOfFloorsOfStore();
        System.out.println(basicStore.toString());
        GameStore gameStore = new GameStore();
        System.out.println(gameStore.toString());
    }
}
