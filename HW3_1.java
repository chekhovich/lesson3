  package Lesson3;
    public class HW3_1 {
        public static void main(String[] args) {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println("arr.length: " + arr.length);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            for (int i = 0; i < arr.length; i++)
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else arr[i] = 1;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i + "-" + arr[i] + " ");
            }
        }
    }
