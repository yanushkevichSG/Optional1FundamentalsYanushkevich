package by.javatr.service;

public class GetCharsFromIntMassive {
    public static int[] getCharsFromIntMassive(int[] values) {
        int[] numOfChars = new int[values.length];
        int i = 0;
        for (int value : values) {
            numOfChars[i] = getCountsOfDigits(value);
            i++;
        }
        return numOfChars;
    }

    private static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
