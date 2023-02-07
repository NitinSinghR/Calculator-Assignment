package org.example;

import java.util.*;
import java.util.logging.*;
class Calculator
{
    private int a;
    private int b;
    public void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public int calculate(int a,int b){
        return 0;
    }
}
class Addition extends Calculator
{
    @Override
    public int calculate(int a, int b)
    {
        return a+b;
    }
}
class Subtraction extends Calculator
{
    @Override
    public int calculate(int a, int b)
    {
        return a-b;
    }
}
class Multiplication extends Calculator
{
    @Override
    public int calculate(int a, int b)
    {
        return a*b;
    }
}
class Division extends Calculator
{
    @Override
    public int calculate(int a, int b)
    {
        return a/b;
    }
}
class CalcTest
{
    public static void main(String[] args)
    {
        Logger l=Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        int ch;
        Calculator c = null;
        String v1="Enter first number\n";
        String v2="Enter second number\n";
        while(true)
        {
            l.info("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice\n");
            ch=sc.nextInt();
            switch(ch) {
                case 1: {
                    c = new Addition();
                    l.info(v1);
                    a=sc.nextInt();
                    l.info(v2);
                    b=sc.nextInt();
                    c.set(a,b);
                    break;
                }
                case 2:{
                    c =  new Subtraction();
                    l.info(v1);
                    a=sc.nextInt();
                    l.info(v2);
                    b=sc.nextInt();
                    c.set(a,b);
                    break;
                }
                case 3: {
                    c = new Multiplication();
                    l.info(v1);
                    a=sc.nextInt();
                    l.info(v2);
                    b=sc.nextInt();
                    c.set(a,b);
                    break;
                }
                case 4:{
                    c = new Division();
                    l.info(v1);
                    a=sc.nextInt();
                    l.info(v2);
                    b=sc.nextInt();
                    c.set(a,b);
                    break;
                }
                default: {
                    l.info("Invalid Input\n");
                    sc.close();
                    System.exit(0);
                }
            }
            Calculator finalC = c;
            l.log(Level.INFO, () -> "Result: " + finalC.calculate(finalC.getA(), finalC.getB()));
        }
    }
}