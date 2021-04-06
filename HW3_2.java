package Lesson3;
public class HW3_2 {
    public static void main(String[] args) {
        int[] arr = new int[101];
        for (int i = 0; i < 101; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int[] ar = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("ar.length: " + ar.length);
        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + " ");
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] < 6)
                ar[j] = ar[j] * 2;
        }
        for (int j = 0; j < ar.length; j++) {
            System.out.print(j + "-" + ar[j] + " ");
        }
    }
}
