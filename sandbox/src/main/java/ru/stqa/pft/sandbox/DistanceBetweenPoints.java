package ru.stqa.pft.sandbox;

/**
 * Created by Sanchez on 22.01.2017.
 */

public class DistanceBetweenPoints {

  public static void main(String[] args) {

    Point p1 = new Point(3,1);
    Point p2 = new Point(2,5);

    if( p1.equalsPoint(p2) ) {
      System.out.println("Точки "+p1+" и "+p2+" совпадают!");
    } else {
      System.out.println("Расстояние между точками "+p1+" и "+p2+" = "+p1.distance(p2));
    }
  }
}