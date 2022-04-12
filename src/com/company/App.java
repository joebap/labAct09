package com.company;

public class App {

    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    private static double computeSum(double num1, double num2,double num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers.
     */


    /**
     *
     * Create method that returns the greater integer value
     */
    private static int greaterValue(int x,int y){
        if(x>y){
            return x;
        }else{
        return y;
        }
    }

    /**
     *
     * Create method that returns the greater double value
     */       private static double greaterValue(double x,double y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("the sum of the two int parameters are "+computeSum(1,5 ));
        System.out.println("the sum of the two int parameters are "+computeSum(16.4,3.3,2.5));
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */

        /**
         * Call the greaterValue method with integer parameters
         */
           System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
         System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}