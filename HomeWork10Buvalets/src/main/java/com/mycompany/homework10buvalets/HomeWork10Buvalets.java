/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework10buvalets;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author danil
 */
public class HomeWork10Buvalets {

    public static void main(String[] args) {
        System.out.println("РИБО-02-21 Бувалец Данила Александрович 5 вариант");
        Files fl = new Files();
        Scanner sn = new Scanner(System.in);
        System.out.println("Укажите путь: ");
        String path = sn.next(); //Вводим путь с клавиатуры
        try {
            System.out.println(Arrays.toString(fl.infFile(path))); //Вывод информации о нашем каталоге
        } 
        catch (IOException ex){
            System.out.println("При указании пути возникла ошибка: "+ex.getMessage()); //Вывод ошибки, если путь не найден
        }
    }
}