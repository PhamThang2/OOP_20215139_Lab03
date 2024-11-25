package ex6_5;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng, N = ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }
  
        for (int i = 0; i < arrayLength - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arrayLength - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    swapped = true;  
                }
            }
            if (!swapped) {
                break;  
            }
        }

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arrayLength;

        System.out.println("Mảng sau khi sắp xếp là:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  

        System.out.println("Tổng các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình của các phần tử trong mảng: " + average);

        scanner.close(); 
    }
}
