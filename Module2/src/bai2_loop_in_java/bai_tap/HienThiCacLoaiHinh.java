package bai2_loop_in_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Tam giac can");
        System.out.println("5.Exit");
        System.out.println("Enter your choice");
        int input = sc.nextInt();
        switch (input) {
            case 1: {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            break;
            case 2:{
                for (int j = 7; j >=1; j--) {
                    for (int k = 1; k <= 5; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            break;
            case 3:{
                for(int m=0;m<6;m++){
                    for(int n=0;n<=m;n++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            break;
            case 4:
                for(int i=0;i<6;i++){
                    for (int j=5;j>i;j--){
                        System.out.print(" ");
                    }
                    for (int k=0;k<=i;k++){
                        System.out.print(" *");
                    }
                    System.out.println();
                }
            case 5:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }
}
