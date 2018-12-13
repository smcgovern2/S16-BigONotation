package edu.wctc.advjava.comparebigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number under 100: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int wholeNumber = Integer.parseInt(input);
        System.out.println("Enter an integer between 2 and 10");
        input = keyboard.nextLine();
        int c = Integer.parseInt(input);
        if(c>10 || c< 2){
            throw new Exception("dont do that");
        }


        System.out.printf("%9s     %12s     %9s     %9s     %9s     %9s     %9s     %9s     %7s\n",
                "O(1)","O(log(log n))","O(log n)","O(n)","O(n2)","O(nc)", "O(2n)","O(cn)", "O(n!)");
        System.out.printf("%9s     %12s     %9s     %9s     %9s     %9s     %9s     %9s     %8s\n",
                "--------","--------","--------","--------","--------", "--------","--------", "--------", "--------");
        for (int i=0; i<=wholeNumber; i++) {
            System.out.printf("%9d     %12.2f     %9.2f    %9d     %9d     %9d     %9d     %9d     %9d\n",
                    getO1(i),getOloglogn(i),getlogn(i),getOn(i),getOn2(i),getOnc(i,c),getO2n(i),getOcn(i, c),getOnfac(i));
        }
    }
    private static int getO1(int i){
        return 1;
    }

    private static double getlogn(int i){
        return Math.log(i);
    }

    private static int getOn(int i){
        return i;
    }

    private static int getOn2(int i){
        return i*i;
    }

    private static int getOnc(int i, int c){
        int number = i;
        for(int j = 0; j < c-1; j++){
            number = number*i;
        }
        return number;
    }

    private static int getO2n(int i){
        int number = 1;
        for (int j=0; j < i; j++){
            number = number*2;
        }
        return number;
    }

    private static int getOcn(int i, int c){
        int number = 1;
        for (int j=0; j < i; j++){
            number = number*c;
        }
        return number;
    }

    private static int getOnfac(int i){
        int n = i;
        if(n == 0)
            return 1;

        return n*getOnfac(n-1);
    }

    private static double getOloglogn(int i){
        return Math.log(Math.log(i));
    }


}


