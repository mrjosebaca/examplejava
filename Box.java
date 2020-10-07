import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Box
{
  int x;
  int y;
  int width;
  int height;
  public Box(int x,int y,int width,int height)
  {
    this.x=x;
    this.y=y;
    this.width=width;
    this.height=height;
  }

  public void draw(Graphics g)
  {
    Graphics2D g2=(Graphics2D)g;
    g2.drawRectangle(Color.red,this.x,this.y,this.width,this.height);

  }

}