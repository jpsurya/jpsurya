package com.company;

//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int d1,d2,d3,d4,result,temp ;
        for(int number=100;number<=999;number++)
        {
            temp=number;
            d4=temp%10;
            temp=temp/10;
            d3=temp%10;
            temp=temp/10;
            d2=temp%10;
            temp=temp/10;
            d1=temp%10;
            result=(d4*d4*d4)+(d3*d3*d3)+(d2*d2*d2)+(d1*d1*d1);

        }
        if(temp==result)
        {
            System.out.println(temp+" number is armstrong");

        }

        }
    }

