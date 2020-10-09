import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class Scene extends JPanel implements ActionListener
{
  private int width;
  private int height;
  private BoxRect box;
  private Bird bird;
  private Timer time;
  public Scene(int width,int height)
  {
    super();
    this.width=width;
    this.height=height;
    this.setSize(width,height);
    this.box=new BoxRect(45,45,56,56);
    this.bird=new Bird(85,45,56,56);
    this.time=new Timer(25000,this);
  }

  public void actionPerformed(ActionEvent e)
  {

  }
 
  public void paint(Graphics g)
  {
    super.paint(g);
    this.box.draw(g);
    this.bird.draw(g);
    repaint();


  }
}