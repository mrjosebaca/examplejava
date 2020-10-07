import java.util.Random; 
import java.util.ArrayList;
import javax.swing.JFrame;
public class Main
{
  static Random random=new Random(); 

  public static int randonInt(int min,int max)
  {
    int x=min+random.nextInt(max);
    return x; 
  } 

  public static int sum(int a, int b)
  {
    int result=a+b; 
    return result; 
  }

  public static int subtract(int a,int b)
  {
    int result=a-b; 
    return result;
  }

  public static int multiplication(int a,int b)
  {
    int result=a+b;
    return result; 
  }

  public static int division(int a,int b)
  {
    int result=a/b; 
    return result; 
  }

  public static void main(String args[])
  {
    /*
    int x=0;
    int y=0; 
    x=randonInt(50,100); 
    y=randonInt(1,100); 
    System.out.println(sum(x,y)); 
    System.out.println(y); 
*/
/*
  ArrayList<Student> aStudents=new ArrayList<Student>();

   
   Student juan=new Student("Juan",12,6,"Male");
   System.out.println(juan);
   juan.setAge(10);
   System.out.println(juan);
   Student carlos=new Student("Carlos",10,4,"Male");
   Student maria=new Student("Maria",7,1,"Female");
   Student alejandra=new Student("Monica",15,7,"Female");

   aStudents.add(juan);
   aStudents.add(carlos); 
   aStudents.add(maria);
   aStudents.add(alejandra);

   System.out.println(aStudents.get(0).getAge()==aStudents.get(3).getAge()); 


   if(aStudents.get(0).getAge()==aStudents.get(3).getAge())
   {
     System.out.println("Monica and Juan have the same age"); 
   }
   if(aStudents.get(1).getGrade()>aStudents.get(2).getGrade())
   {
     System.out.println("Maria is not on a greater grade");
   }*/

   JFrame jFrame=new JFrame();
   jFrame.setSize(800,600);
   jFrame.add(new Scene(800,600));
   jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   jFrame.setVisible(true);
  


  }
}