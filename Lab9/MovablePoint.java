package lab9;

public class MovablePoint implements Movable {
  int x;
  int y;
  int xSpeed;
  int ySpeed;
  
  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    //this(x, y, xSpeed, ySpeed);  
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  
  public String toString() {
    return String.format ("MovablePoint: \n x: " + x + "\n y: " + y + "\n xSpeed: " + xSpeed + "\n ySpeed: " + ySpeed);
  
  }
  
  public void moveUp() {
    y -= ySpeed;
  }
  
  public void moveDown() {
    y += ySpeed;
  }
  
  public void moveLeft() {
    x -= xSpeed;
  }
  
  public void moveRight() {
    x += xSpeed;
  }
  
}