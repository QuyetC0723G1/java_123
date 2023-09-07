import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

//

        for (int i = 1; i <= 3; i++) {
            System.out.print("*");
            for (int j = 1; j <= 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j <i ; j++) {
//                System.out.print("* ");
//            }System.out.println();
//        }


//
//        for (int i = 0; i <5; i++) {
//            for (int j = 5; j >i ; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//
//        int count = 0;
//        int number = 2;
//        while (count < 20) {
//            if (isPrime(number)) {
//                System.out.print(number + " ");
//                count++;
//            }
//            number++;
//        }
//    }
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;


        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
//




//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = inputNumber.nextInt();
//        if (number < 2) {
//            System.out.println(number + " is not a prime");
//        } else {
//            int i = 2;
//            boolean check = true;
//            while (i <= Math.sqrt(number)) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check) {
//                System.out.println(number + " is a prime");
//            } else {
//                System.out.println(number + " is not a prime");
//            }
//        }


    }
}








