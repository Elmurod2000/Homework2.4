package com.company;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //#ДЗ 4-й урок
        //        //7)  (Дэдлайн 3 дня)
        //        //a) Используйте цикл или итератор
        //        //b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
        //        //c)  Затем программа должна отобразить этот список
        //        //d)  Потом программа считывает еще 5 строк, которые вводит юзер и
        //        // помещает их в Список Б. После также отображает его в консоли
        //        //e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        //        //f)  После объединения отобразить в консоли список С
        //        //g)   В конце отсортировать элементы списка С по длине слова, сначала идут
        //        // String-и с наименьшим количеством символов, и распечатать отсортированный список С

        ArrayList<String> contentA = new ArrayList<>();
        java.util.Scanner word = new java.util.Scanner(System.in);
        System.out.println("Вводите 5 слов:");
        while (contentA.size() < 5) {
            String s1 = word.nextLine();
            contentA.add(s1);
        }
        info(contentA);
        System.out.println("_________");


        ArrayList<String> contentB = new ArrayList<>();
        java.util.Scanner word1 = new Scanner(System.in);
        System.out.println("Теперь вводите 5 имен:");
        while (contentB.size() < 5) {
            String s1 = word1.nextLine();
            contentB.add(s1);
        }
        info(contentB);
        System.out.println("__________");

        ArrayList<String> contentC = new ArrayList<>();
        Collections.reverse(contentB);
        Iterator<String> iterator = contentB.iterator();

        while (iterator.hasNext()) {

            Iterator<String> iterator1 = contentA.iterator();

            while (iterator1.hasNext()) {
                contentC.add(iterator1.next());
                iterator1.remove();
                break;
            }
            contentC.add(iterator.next());
        }
        System.out.println(contentC);
        System.out.println("сортировка");

        contentC.sort(Comparator.comparing(String::length));

        System.out.println(contentC);
        System.out.println("_________");


    }

    public static void info(ArrayList<String> arrayList) {
        System.out.println("_________");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
