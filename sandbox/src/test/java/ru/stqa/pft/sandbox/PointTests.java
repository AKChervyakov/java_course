package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sanchez on 30.01.2017.
 */
public class PointTests {

  @Test(priority = 0)
  public void testDistance() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 2);
    Assert.assertEquals(p1.distance(p2), 1.0); //проверяем, что расстояние м-у точками равено 1.0
  }

  @Test(priority = 1)
  public void testDistance2() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 2);
    Assert.assertNotEquals(p1.distance(p2), 2.0); //Проверяем, что расстояние м-у точками не равено 2.0
  }
}
