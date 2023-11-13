package ru.stepik.ergakov.HW2.Task1;

public class NumberSystems<T extends Number> {
    public String decimalToBinary(T num) {
        if (num instanceof Byte) return Integer.toBinaryString((byte) num);
        else if (num instanceof Short) return Integer.toBinaryString((short) num);
        else if (num instanceof Integer) return Integer.toBinaryString((Integer) num);
        else if (num instanceof Long) return Long.toBinaryString((Long) num);
        return null;
    }

    public String decimalToOctal(T num) {
        if (num instanceof Byte) return Integer.toOctalString((byte) num);
        else if (num instanceof Short) return Integer.toOctalString((short) num);
        else if (num instanceof Integer) return Integer.toOctalString((Integer) num);
        else if (num instanceof Long) return Long.toOctalString((Long) num);
        return null;
    }

    public String decimalToHex(T num) {
        if (num instanceof Byte) return Integer.toHexString((byte) num);
        else if (num instanceof Short) return Integer.toHexString((short) num);
        else if (num instanceof Integer) return Integer.toHexString((Integer) num);
        else if (num instanceof Long) return Long.toHexString((Long) num);
        return null;
    }

}
