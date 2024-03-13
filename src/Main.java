public class Main {
    public static void main(String[] args) {
        String [][] seatingChart = {
            {"Abby", "Don", "George", "Kim"},
            {"Brian", "Elenor", "Harry", "Lenny"},
            {"Cathy", "Fred", "Jill", "Matt"}
        };

        for (String[] arr : seatingChart) {
            for (String str : arr) {
                System.out.print(str +" ");
            }
            System.out.println();
        }

        // replace harry with paul
        System.out.println();
        seatingChart[1][2] = "Paul";

        for (String[] arr : seatingChart) {
            for (String str : arr) {
                System.out.print(str +" ");
            }
            System.out.println();
        }

        // swap matt and abby
        System.out.println();
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        for (String[] arr : seatingChart) {
            for (String str : arr) {
                System.out.print(str +" ");
            }
            System.out.println();
        }

        // swap first and second rows
        System.out.println();
        String [] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for (String[] arr : seatingChart) {
            for (String str : arr) {
                System.out.print(str +" ");
            }
            System.out.println();
        }

        // next
        System.out.println();
        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];

        for (int[] arr : arr1) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] arr : arr2) {
            for (String str : arr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;


    }
}