package com.company;

public class Main {

    public static void main(String[] args) {
        calc(4,3,'+');
        calc(3.5,2,'-');
        calc(3.5,2,'*');
        calc(3.5,2,'/');
        calc(3,2,'%');


    }
    public static void calc(double x, double y,char c)
    {
        switch(c) {
            case '+':
                System.out.println("x + y = " + (x + y));
                break;
            case '-':
                System.out.println("x - y = " + (x - y));
                break;
            case '*':
                System.out.println("x * y = " + (x * y));
                break;
            case '/':
                System.out.println("x / y = " + (x / y));
                break;
            case '%':
                System.out.println("x % y = " + (x % y));
                break;
            default :
                System.out.println("Not a valid operation");
                break;
        }

    }

}





