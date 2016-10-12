package part2;

public class ResizableCircle extends Circle implements Resizable{
  public ResizableCircle(double radius) {
    super(radius);
  }
  
  public String toString() {
    return String.format ("ResizableCircle -> radius: " + radius);
  }  
  
  public void resize(int percent) {
    double per = radius * (percent / 100.0);
    radius += per;
  }
  
}