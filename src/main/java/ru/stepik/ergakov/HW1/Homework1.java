package ru.stepik.ergakov.HW1;


import org.apache.commons.lang3.StringUtils;

public class Homework1 {



    public void task1 (){
        String head = "РУБАИ";
        String str1 = "Много лет размышлял я над жизнью земной.";
        String str2 = "Непонятного нет для меня под луной.";
        String str3 = "Мне известно, что мне ничего не известно,";
        String str4 = "Вот последний секрет из постигнутых мной.";
        String foot = "О. Хайам";

        String[] poem = new String[] {head, str1, str2, str3, str4, foot};
        int width = maxString(poem);

        System.out.println("Выполнение задания с помощью StringUtils от Apache Commons:\n");
        for (int i = 0; i < poem.length; i++) {
            if (i == 0) System.out.println(StringUtils.center(poem[i], width));
            else if (i == poem.length -1) System.out.println(StringUtils.leftPad(poem[i], width));
            else System.out.println(StringUtils.rightPad(poem[i], width));
        }
        System.out.println();

        System.out.println("Выполнение задания с помощью String.format():\n");
        for (int i = 0; i < poem.length; i++) {
            if (i == 0) {
                int padding = (width - poem[i].length()) / 2;
                System.out.printf("%" + (padding + poem[i].length()) + "s%n", poem[i]);
//                System.out.println(String.format("%" + (padding + poem[i].length()) + "s", poem[i]));
            } else if (i == poem.length -1) {
                System.out.printf("%" + width + "s%n", poem[i]);
//                System.out.println(String.format("%" + width + "s", poem[i]));
            } else {
                System.out.printf("%-" + width + "s%n", poem[i]);
//                System.out.println(String.format("%-" + width + "s", poem[i]));
            }
        }
    }

    private int maxString (String[] poem){
        int max = 0;
        for (String str: poem) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        return max;
    }
}
