package lab9;

public class MovableRectangle implements Movable{
  private MovablePoint topLeft;
  private MovablePoint bottomRight;
  
  public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
    topLeft =  new MovablePoint(x1, y1, xSpeed, ySpeed);
    bottomRight =  new MovablePoint(x2, y2, xSpeed, ySpeed);
    
    if(x1 == x2 || y1 == y2) {
      throw new IllegalArgumentException ("Given coordinates does not form a rectangle!\n \t\t\t    Either: x1 is equal to x2 or y1 is equal to y2");
    } else if(x1 > x2) {
      throw new IllegalArgumentException ("Invalid! x1 should be lesser than x2, x1 is top left");
    } else if(y1 < y2) {
      throw new IllegalArgumentException ("Invalid! y1 should be greater than y2, y1 is top left");
    }
  }
  
  public String toString() {
    return String.format ("MovableRectangle: \ntop left:\n (x1, y1) -> (" + topLeft.x + ", " + topLeft.y + ")" + 
                          "\n xSpeed: " + topLeft.xSpeed + "\n ySpeed: " + topLeft.ySpeed + 
                          "\nbottom right: \n (x2, y2) -> (" + bottomRight.x + ", " + bottomRight.y + ")" + 
                          "\n xSpeed: " + bottomRight.xSpeed + "\n ySpeed: " + bottomRight.ySpeed);
  }
  
  public void moveUp() {
    topLeft.y -= topLeft.ySpeed;
    bottomRight.y -= bottomRight.ySpeed;
  }
  
  public void moveDown() {
    topLeft.y += topLeft.ySpeed;
    bottomRight.y += bottomRight.ySpeed;
  }
  
  public void moveLeft() {
    topLeft.x -= topLeft.xSpeed;
    bottomRight.x -= bottomRight.xSpeed;
  }
  
  public void moveRight() {
    topLeft.x += topLeft.xSpeed;
    bottomRight.x += bottomRight.xSpeed;
  }
  


}