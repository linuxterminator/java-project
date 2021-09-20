package com.huqingshan.project;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        double r;
        System.out.println("请输入半径");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();

        System.out.println("面积为: " + String.format("%.2f",Assignment.getArea(r)));
        System.out.println("周长为: " + String.format("%.2f",Assignment.getPerimeter(r)));
    }
}
