public class Student
{
  private String name;
  private int age;
  private int grade;
  private String gender;

  public Student(String name,int age,int grade,String gender)
  {
    this.name=name;
    this.age=age;
    this.grade=grade;
    this.gender=gender;
  }

  public void setName(String name)
  {
    this.name=name; 
  }

  public String getName()
  {
    return this.name;
  }

  public void setAge(int age)
  {
    this.age=age;
  }

  public int getAge()
  {
    return this.age;
  }

  public void setGrade(int grade)
  {
    this.grade=grade;
  }

  public int getGrade()
  {
    return this.grade; 
  }

  public void setGender(String gender)
  {
    this.gender=gender;
  }

  public String getGender()
  {
    return this.gender;
  }

  public String toString()
  {
    return this.name+" "+this.age+" "+this.grade+" "+this.gender;
  }

}