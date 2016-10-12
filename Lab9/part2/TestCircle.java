package part2;

import java.util.*;

public class TestCircle {

  public static void main(String[] args) {
    GeometricObject g1 = new Circle(11.0);
    
    System.out.println(g1);
    System.out.println("Perimeter -> " + g1.getPerimeter());
    System.out.println("Area -> " + g1.getArea());
    
  }
  
}