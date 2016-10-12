package part2;

public class TestResizableCircle {

  public static void main(String[] args) {
    Resizable r1 = new ResizableCircle(100.0);
    
    System.out.println(r1);
    r1.resize(-50);
    System.out.println(r1);
  
  }

}