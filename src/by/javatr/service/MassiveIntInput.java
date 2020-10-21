package by.javatr.service;

import by.javatr.scanner.Input;

public class MassiveIntInput {
    public static int[] getMassiveIntFromIn() {
        int size = Input.getIntFromIn();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Input.getIntFromIn();
        }
        return arr;
    }
}
