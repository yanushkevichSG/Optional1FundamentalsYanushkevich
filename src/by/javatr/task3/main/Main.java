package by.javatr.task3.main;
import by.javatr.scanner.Input;
import by.javatr.service.GetCharsFromIntMassive;
import by.javatr.service.MassiveIntInput;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter amount of numbers: ");
        int [] arr = MassiveIntInput.getMassiveIntFromIn();
        int[] numOfChars = GetCharsFromIntMassive.getCharsFromIntMassive(arr);
        int sumOfChars = 0;
        int numOfValues = 0;

        for (int i = 0; i < numOfChars.length; i++) {
            sumOfChars += numOfChars[i];
            numOfValues++;
        }
        double averageOfChars = (double)sumOfChars / numOfValues;
        System.out.println(averageOfChars);
        for (int i = 0; i < numOfChars.length; i++) {
            if(numOfChars[i] < averageOfChars) {
                System.out.println("value =  " + arr[i] + " num of chars " + numOfChars[i]);
            }
        }
        for (int i = 0; i < numOfChars.length; i++) {
            if(numOfChars[i] > averageOfChars) {
                System.out.println(" value = " + arr[i] + " num of chars " + numOfChars[i]);
            }
        }
    }
}

