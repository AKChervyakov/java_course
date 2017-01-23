package ru.stqa.pft.sandbox;

/**
 * Created by Sanchez on 23.01.2017.
 */
class Point {

  public double x; // абсцисса точки
  public double y; // ордината точки

  // возвращаем строку с описанием точки
  public String toString() {
    return "(" + x + ";" + y + ")";
  }

  // выводим на экран описание точки
  public void printPoint() {
    System.out.print(this.toString());
  }

  // Создаем точку с указанными координатами
  public Point(double a, double b) {
    x = a;
    y = b;
  }

  // Вычисляем расстояние между точками
  public double distance(Point p) {
    return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
  }

  // Проверяем совпадают ли точки
  public boolean equalsPoint(Point p) {
    if (this.x == p.x && this.y == p.y) {
      return true;
    } else {
      return false;
    }
  }
}