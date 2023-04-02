/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework10buvalets;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author danil
 */
public class Files {
    public File[] infFile(String path) throws FileNotFoundException, IOException{
            File fpath = new File(path);
            File[] files = fpath.listFiles(); //получение объектов-файлов в виде массива
            File[] dirs = new File(path).listFiles(File::isDirectory);//проверка на директорию

            for (File file : files) {
                if (file.isFile()) { //проверка является ли файлом
                    System.out.println(file + " " + file.length());//длина файла в байтах
                } 
                else {
                 System.out.println(file + " папка");
                }
            }
            if (dirs != null){
                for (File dir : dirs) {
                    path = dir.getPath(); //преобразование объекта к типу Path
                    infFile(path);
                }
            }
            return files;
        }
    }