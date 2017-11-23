package com.testpackage;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner inputDigit = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int digit = inputDigit.nextInt();
        for (int i = 2; i < digit; i++) {
            for (int j = 2; j < digit; j++) {
                int multiTwoNumbers= mulOfNumbers(i,j);
                String mulTwoNum=String.valueOf(multiTwoNumbers);
                int maxDigit= findMaxDigit(i,j);
                String newDigitWhithZeros= addZerosToString(maxDigit);
                if(mulTwoNum.equals(newDigitWhithZeros)){
                    System.out.println(i+"*"+j+"="+mulTwoNum);
                }
            }
        }
    }
    public static int findMaxDigit(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
    public static int mulOfNumbers(int number1, int number2) {
        int result=number1*number2;
        return  result;
    }
    public static String addZerosToString(int number){
        String createStringToNumber=String.valueOf(number);
        int length=createStringToNumber.length();
        String result=new String();
        for(int i=0;i<length-1;i++){
            result+=createStringToNumber.charAt(i);
            result+='0';
        }
        result+=createStringToNumber.charAt(length-1);
        return result;
    }

}
