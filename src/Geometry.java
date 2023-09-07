import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
//        int choice = -1;
//        Scanner input = new Scanner(System.in);
//        while (choice != 0) {
//
//
//            System.out.println("Menu");
//            System.out.println("1 : Draw the triangle");
//            System.out.println("2: Draw the square");
//            System.out.println("3 : Draw the rectangle");
//            System.out.println("4 :Exit");
//            System.out.println("Enter your choice : ");
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    for (int i = 1; i <= 5; i++) {
//                        for (int j = 0; j < i; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
//
//                break;
//                case 2:
//                    for (int i = 0; i < 6; i++) {
//                        System.out.print("* ");
//                        for (int j = 0; j < 10; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//
//                case 3:
//                    for (int i = 0; i < 3; i++) {
//                        System.out.print("* ");
//                        for (int j = 0; j < 15; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 4:
//                    System.exit(4);
//
//                default:
//                    System.out.println("not find");
//            }
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 1 so");
        int number = input.nextInt();


        String  result  =  "";
        int unit = number % 10;
        int chuc = (number / 10) % 10;
        int tram = number / 100;

        if (tram!=0){
            result = result+ getString(tram);
            result = result + " Trăm ";
        }

        if (chuc != 0) {
            if (chuc==1){
                result = result + " Mười ";
            }
            else {
                result = result + getString(chuc);
                result = result + " Mươi ";
            }
        }
        if (unit!=0&&unit!=1){
            result = result + getString(unit);
        }
        if (chuc!=1&&unit==1){
            result=result+ "Mốt ";
        }
        System.out.println("Số bạn nhập đọc là : "+result);



    }


    public static String getString(int number) {
        switch (number) {
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            default:
                return null;
        }
    }
}

