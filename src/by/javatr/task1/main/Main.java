package by.javatr.task1.main;
import by.javatr.scanner.Input;
import by.javatr.service.BubbleSort;
import by.javatr.service.GetCharsFromIntMassive;
import by.javatr.service.MassiveIntInput;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        int [] arr = MassiveIntInput.getMassiveIntFromIn();
        BubbleSort.bubbleSort(arr);
        BubbleSort.bubbleSort(GetCharsFromIntMassive.getCharsFromIntMassive(arr));
        System.out.println("max value = " + arr[arr.length - 1] + " num of chars " + GetCharsFromIntMassive.
                getCharsFromIntMassive(arr)[GetCharsFromIntMassive.getCharsFromIntMassive(arr).length - 1]);
        System.out.println("min value = " + arr[0] + " num of chars " + GetCharsFromIntMassive.getCharsFromIntMassive(arr)[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}