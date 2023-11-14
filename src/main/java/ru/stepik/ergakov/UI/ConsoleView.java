package ru.stepik.ergakov.UI;

import java.util.Scanner;

public class ConsoleView {
    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    public int inputValue() {
        return in.nextInt();
//        try(Scanner input = new Scanner(System.in)){
//            return input.nextInt();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
