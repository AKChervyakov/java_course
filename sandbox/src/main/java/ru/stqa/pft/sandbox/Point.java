package ru.stqa.pft.sandbox;

/**
 * Created by Sanchez on 22.01.2017.
 */
public class Point {

  public static void main (String[] args) {

    double x1 = 3; //абцисса точки p1
    double y1 = 6; //ордината точки p1
    double x2 = 4; //абцисса точки p2
    double y2 = 6; //ордината точки p2
    System.out.println("Расстояние между точками (x1, y1) и (x2, y2) = " + distance(x1, y1, x2, y2));
  }

  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}
