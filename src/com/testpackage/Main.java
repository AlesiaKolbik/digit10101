package com.testpackage;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner inputDigit = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int digit = inputDigit.nextInt();
        for (int i = 2; i < digit; i++) {
            for (int j = 2; j < digit; j++) {
                int multiTwoNumbers=multiplication(i,j);
                String multiTwoNambers=String.valueOf(multiTwoNumbers);
                int maxDigit=maxDigit(i,j);
                String number=addNullToString(maxDigit);
                if(multiTwoNambers.equals(number)){
                    System.out.println(i+"*"+j+"="+multiTwoNumbers);
                }
            }
        }
    }
    public static int maxDigit(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
    public static int multiplication(int number1, int number2) {
        int result=number1*number2;
        return  result;
    }
    public static String addNullToString (int number){
        String createStringToNumber=String.valueOf(number);
        int length=createStringToNumber.length();
        String rezult=new String();
        for(int i=0;i<length-1;i++){
            rezult+=createStringToNumber.charAt(i);
            rezult+='0';
        }
        rezult+=createStringToNumber.charAt(length-1);
        return rezult;
    }

}
