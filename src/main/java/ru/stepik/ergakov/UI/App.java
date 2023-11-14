package ru.stepik.ergakov.UI;

import ru.stepik.ergakov.HW1.Homework1;
import ru.stepik.ergakov.HW2.HW2Menu;

public class App {
    ConsoleView cv = new ConsoleView();

    public void buttonClick() {
        System.out.println("Введите номер урока: ");
        switch (cv.inputValue()) {
            // ДЗ № 1:
            case 1 -> new Homework1().task1();
            // ДЗ № 2:
            case 2 -> new HW2Menu().menu();
        }


    }
}
