package lab9;

public class MovableCircle implements Movable {
  private MovablePoint center;
  private int radius;
  
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.radius = radius;
    center =  new MovablePoint(x, y, xSpeed, ySpeed);
  }
  
  public String toString() {
    return String.format ("MovableCircle: \n x: " + center.x + "\n y: " + center.y + "\n xSpeed: " + center.xSpeed + "\n ySpeed: " + center.ySpeed + "\n radius : " + radius);
  
  }
  
  public void moveUp() {
    center.y -= center.ySpeed;
  }
  
  public void moveDown() {
    center.y += center.ySpeed;
  }
  
  public void moveLeft() {
   center.x -= center.xSpeed;
  }
  
  public void moveRight() {
    center.x += center.xSpeed;
  }
  
}