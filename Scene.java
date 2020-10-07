import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class Scene extends JPanel
{
  private int width;
  private int height;
  private Box box;
  public Scene(int width,int height)
  {
    super();
    this.width=width;
    this.height=height;
    this.setSize(width,height);
    this.box=new Box(45,45,56,56);
  }
 
  public void paint(Graphics g)
  {
    super.paint(g);


  }
}