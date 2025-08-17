package com.Rangan;
import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double i=1,a,b;
        System.out.println("Calculator");
        System.out.print("Enter a no:");
        a=sc.nextDouble();
        do{
            String opt=sc.next();
            switch(opt){
                case "+": b=sc.nextDouble();
                          a+=b;
                          break;
                case "-": b=sc.nextDouble();
                          a-=b;
                          break;
                case "*": b=sc.nextDouble();
                          a*=b;
                          break;
                case "^": b=sc.nextDouble();
                          a= Math.pow(a,b);
                          break;
                case "/": b=sc.nextDouble();
                          if(b!=0){
                              a=a/b;
                          }
                          else{
                              System.out.print("Enter anything except 0");
                          }
                          break;
                case "=": System.out.println("Calculated Value:"+a);
                          System.out.println("Do you want to end the program?If yes press 0 or any other no. if no");
                          b= sc.nextDouble();
                          if (b == 0) {
                             i=0;
                          }
                          break;
                default: System.out.println("Invalid Choice");
                         break;

            }
        }while(i!=0);
    }
}
