import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {


        //Bài Đảo ngược mảng

//        int size;
//        int[] arr;
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.println("Nhập Size của mảng : ");
//            size = input.nextInt();
//            if (size > 20) {
//                System.out.println("Size của mảng nhỏ hơn 20");
//            }
//        }while (size>20);
//
//        arr = new int[size];
//        int i = 0;
//        while (i<size){
//            System.out.println("Enter element " +(i+1) +" : ");
//            arr[i]= input.nextInt();
//            i++;
//        }System.out.printf("%-20s","Element in Array is : ");


//        System.out.printf("%-20s","Element in Array is : ");
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr[j]+"\t");
//        }
//        for (int j = 0; j < size / 2; j++) {
//            int temp = arr[j];
//            arr[j] = arr[size - 1 - j];
//            arr[size -1 -j] = temp;
//        }
//        System.out.printf("\n%-20s", "Reverse Array is :");
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr[j] + "\t");
//        }


// Nhập 1 số rồi kiểm tra nếu có trong mảng thì xoá

//        int[] arr = {1,2,3,4,5,6,7,8,0};
//        int size = arr.length -1;
//        Scanner input = new Scanner(System.in);
//        System.out.printf("\n%-20s", "Enter the random number : ");
//        int number = input.nextInt();
//        boolean check = false;
//        for (int k = 0; k <= size; k++) {
//
//            if (arr[k] == number) {
//                if (arr[k]!=arr[arr.length-1]) {
//                    for (int j = k; j < size; j++) {
//                        arr[j] = arr[j + 1];
//                    }
//                    arr[arr.length - 1] = 0;
//                }
//                else {
//                    arr[k]=0;
//                }
////                size--;
//                check = true;
//                break;
//            }
//        }
//        if (check){
//            System.out.printf("\n%-20s","number "+number +" is in Array => Deleted");
//            System.out.printf("\n%-20s","the last Array is : ");
//            for (int k = 0; k <= size; k++) {
//                System.out.print(arr[k] + "\t");
//            }
//            System.out.println(Arrays.toString(arr));
//        }else {
//            System.out.println("number "+number +" not find in Array");
//        }




//  Gộp 2 mảng lại:

//        int[] arr = new int[4];
//        int[] arr1 = new int[5];
//        int[] arr3 = new int[arr.length+arr1.length];
//        inputArr(arr.length,arr);
//        inputArr(arr1.length,arr1);
//        int size = 0;
//        size = Arrplus(arr3,arr,size);
//        size = Arrplus(arr3,arr1,size);
//        System.out.println("\nArray3 is : "+Arrays.toString(arr3));
//    }
//    public static void inputArr(int size, int[] arr){
//
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter Element Thứ " + (i+1));
//            arr[i] = input.nextInt();
//        }
//        System.out.println("Array 1 is : ");
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr[j] + "\t");
//        }
//    }
//    public static int Arrplus (int[] arr , int[] arr2, int size){
//        for (int i = 0; i < arr2.length; i++) {
//            arr[size] = arr2[i];
//            size++;
//        }
//        return size;
//    }


        // Thêm, chèn 1 phần tử ở vị trí bất kỳ vào trong bảng
//        int[] arr = {4,5,6,7,8,9,0};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int number = input.nextInt();
//        System.out.println("Enter the index : ");
//        int index = input.nextInt();
//        int[] arr2 = new  int[arr.length+1];
//        for (int i = 0; i < arr.length; i++) {
//            if (i < index){
//                arr2[i]=arr[i];
//            } else if (i==index) {
//                arr2[i] = number;
//            }
//            else {
//                arr2[index+1]=arr[index];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(arr2));
//


        // Tìm min của mảng
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter element " +(i+1) +" : ");
//            arr[i]= input.nextInt();
//        }
//        int min = arr[0];
//        for (int i = 0; i < 5; i++) {
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Element min of Array is : " +min);




        //Tìm max của mảng 2 chiều

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][4];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array " + i + " is : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}