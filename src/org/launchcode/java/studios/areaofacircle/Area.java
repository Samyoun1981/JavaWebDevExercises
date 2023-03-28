package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        double radInput = input.nextDouble();
        double area = Circle.getArea(radInput);
        System.out.println("The area of your circle is" + area);
    }
}
