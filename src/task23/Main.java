package task23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[8];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 8; i++) {
            array[i] = random.nextInt(0,2);
            arrayList.add(random.nextInt(0,2));
            linkedList.add(random.nextInt(0,2));
        }


        int[] sortedArray = new int[array.length];
        sort(array, sortedArray);
        System.out.println("Array       : " + Arrays.toString(array));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        sort(arrayList, sortedArrayList);
        System.out.println("ArrayList       : " + arrayList);
        System.out.println("Sorted ArrayList: " + sortedArrayList);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        LinkedList<Integer> sortedLinkedList = new LinkedList<>();
        sort(linkedList, sortedLinkedList);
        System.out.println("LinkedList       : " + linkedList);
        System.out.println("Sorted LinkedList: " + sortedLinkedList);

    }

    public static void sort(LinkedList<Integer> linkedList, LinkedList<Integer> sortedLinkedList) {
        for (Integer integer : linkedList) {
            if (integer == 0){
                sortedLinkedList.add(integer);
            }
        }
        for (Integer integer : linkedList) {
            if (integer == 1){
                sortedLinkedList.add(integer);
            }
        }
    }

    public static void sort(ArrayList<Integer> arrayList, ArrayList<Integer> sortedArrayList) {
        for (Integer integer : arrayList) {
            if (integer == 0){
                sortedArrayList.add(integer);
            }
        }
        for (Integer integer : arrayList) {
            if (integer == 1){
                sortedArrayList.add(integer);
            }
        }
    }


    public static void sort(int[] array, int[] sortedArray) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                sortedArray[i] = array[i];
                a++;
            }
        }
        for (int j : array) {
            if (j == 1) {
                sortedArray[a++] = j;
            }
        }
    }
}
