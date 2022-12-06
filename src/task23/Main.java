package task23;

import java.util.*;

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


        System.out.println("Array       : " + Arrays.toString(array));
        sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ArrayList       : " + arrayList);
        sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("LinkedList       : " + linkedList);
        sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);

    }

    public static void sort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
    }

    public static void sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

}
