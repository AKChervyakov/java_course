package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sanchez on 30.01.2017.
 */
public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(1,1);
    Point p2 = new Point(1,2);
    Assert.assertEquals(p1.distance(p2), 1.0); //положительный тест
    Assert.assertEquals(p1.distance(p2), 2.0); //отрицательный тест
  }
}
