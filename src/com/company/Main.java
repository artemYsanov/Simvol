package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scan.nextLine();
        int i = text.indexOf(".");
        System.out.println("Символов до точки:" + i);

        int spaceCount = 0;
        for (char c : text.toCharArray()) { //toCharArray - возвращает значение
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов:" + spaceCount);
    }
}
