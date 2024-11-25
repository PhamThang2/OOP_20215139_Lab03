package ex6_6;

import java.util.Scanner;

public class AddTwoMatrices {
    public static Scanner input = new Scanner(System.in);

    // Method to display a matrix
    public static void show(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to input a matrix manually
    public static void inputMatrix(int[][] arr, int n, int m, String matrixName) {
        System.out.print("Nhap Phan Tu " + matrixName + ": \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Chon loai dau vao:");
        System.out.println("1. Nhap ma tran bang tay");
        System.out.println("2. Su dung ma tran co dinh");
        System.out.print("Lua chon cua ban: ");
        int choice = input.nextInt();

        int[][] arr_1, arr_2, arr_3;
        int n, m;

        if (choice == 1) {
            // Manual input
            System.out.print("Nhap So Hang: ");
            n = input.nextInt();
            System.out.print("Nhap So Cot: ");
            m = input.nextInt();

            // Create matrices based on user input
            arr_1 = new int[n][m];
            arr_2 = new int[n][m];

            // Input matrices
            inputMatrix(arr_1, n, m, "Ma Tran 1");
            inputMatrix(arr_2, n, m, "Ma Tran 2");

        } else if (choice == 2) {
            // Predefined constant matrices
            arr_1 = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            arr_2 = new int[][] {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            // Set the size of predefined matrices
            n = arr_1.length;
            m = arr_1[0].length;
        } else {
            System.out.println("Lua chon khong hop le.");
            return; // Exit if the choice is invalid
        }

        // Initialize result matrix
        arr_3 = new int[n][m];

        // Add the two matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr_3[i][j] = arr_1[i][j] + arr_2[i][j];
            }
        }

        // Display matrices
        System.out.println("Ma Tran 1: ");
        show(arr_1);
        System.out.println("Ma Tran 2: ");
        show(arr_2);
        System.out.println("Tong 2 ma tran: ");
        show(arr_3);

        // Close the Scanner
        input.close();
    }
}
