/*
关于构造方法的使用，以及面积的计算
 */
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        Circle circle= new Circle(radius);

        Rectangle rectangle = new Rectangle(length,width);

        System.out.println(circle.getAcreage());
        System.out.print(rectangle.getAcreage());
    }
}

abstract class Shape {
   public abstract double getAcreage();
}
class Circle extends Shape {
    double radius;
    double S1;
    double PI = Math.PI;

    public  Circle(double radius){
        this.radius=radius;
    }
    public double getAcreage(){
        S1 = PI * radius * radius;
        return S1;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    double S2 ;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double getAcreage(){
        S2 = length * width;
        return S2;
    }
}


