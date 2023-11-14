package ru.stepik.ergakov.HW2;

import ru.stepik.ergakov.HW2.Task1.Homework2Task1;
import ru.stepik.ergakov.HW2.Task2.Homework2Task2;
import ru.stepik.ergakov.HW2.Task3.Homework2Task3;
import ru.stepik.ergakov.UI.ConsoleView;

public class HW2Menu {
    ConsoleView cv = new ConsoleView();

    public void menu() {
        System.out.println("Введите номер задания: ");

        switch (cv.inputValue()) {
            // ДЗ № 2 Задание 1:
            case 1 -> new Homework2Task1().homework2Task1();
            // ДЗ № 2 Задание 2:
            case 2 -> new Homework2Task2().homework2Task2();
            // ДЗ № 2 Задание 3:
            case 3 -> new Homework2Task3().homework2Task3();
        }
    }
}
