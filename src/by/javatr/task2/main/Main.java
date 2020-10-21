package by.javatr.task2.main;

import by.javatr.scanner.Input;
import by.javatr.service.BubbleSort;
import by.javatr.service.MassiveIntInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        int [] arr = MassiveIntInput.getMassiveIntFromIn();
        BubbleSort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}