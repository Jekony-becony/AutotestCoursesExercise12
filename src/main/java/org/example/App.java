package org.example;


import static java.lang.Math.sqrt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    }
    public static double calculateSquare(double a, double b, double c){
        double p = (a+b+c)/2;
        double s = sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
