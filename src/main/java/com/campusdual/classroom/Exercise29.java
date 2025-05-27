package com.campusdual.classroom;

public class Exercise29 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(posArray(arr, 3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("La última posición del array es: " + (arr.length - 1));
        }
    }

    public static int posArray(int[] array, int pos) throws ArrayIndexOutOfBoundsException {
        return array[pos];
    }
}
