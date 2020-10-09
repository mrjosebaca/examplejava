import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Bird
{
  int x;
  int y;
  int width;
  int height;
  ImageIcon image;
  public Bird(int x,int y,int width,int height)
  {
    this.x=x;
    this.y=y;
    this.width=width;
    this.height=height;
    this.image=new ImageIcon("bird.png");

  }

  public void draw(Graphics g)
  {
    Graphics2D g2=(Graphics2D)g;
    g2.drawImage(this.image.getImage(),this.x,this.y,this.width,this.height,null);

  }

}