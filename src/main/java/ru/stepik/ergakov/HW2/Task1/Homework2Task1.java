package ru.stepik.ergakov.HW2.Task1;

public class Homework2Task1 {
    public void homework2Task1() {
        NumberSystems ns = new NumberSystems();
        Byte numByte = 12;
        System.out.println(numByte.getClass().toString() +
                new Numbers<>(numByte, ns.decimalToBinary(numByte), ns.decimalToOctal(numByte), ns.decimalToHex(numByte)));

        Short numShort = 1300;
        System.out.println(numByte.getClass().toString() +
                new Numbers<>(numShort, ns.decimalToBinary(numShort), ns.decimalToOctal(numShort), ns.decimalToHex(numShort)));

        Integer numInt = 0;
        System.out.println(numInt.getClass().toString() +
                new Numbers<>(numInt, ns.decimalToBinary(numInt), ns.decimalToOctal(numInt), ns.decimalToHex(numInt)));

        Long numLong = 123456789L;
        System.out.println(numLong.getClass().toString() +
                new Numbers<>(numLong, ns.decimalToBinary(numLong), ns.decimalToOctal(numLong), ns.decimalToHex(numLong)));

    }
}
