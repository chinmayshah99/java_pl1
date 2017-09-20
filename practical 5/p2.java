import java.util.Scanner;
class Student
{
    int roll_num;
    String name;
}
class Test extends Student
{
    int marks1,marks2;
}

interface Sport
{
    int sportswt=50;
    void putwt();
}
class Result extends Test implements Sport
{
    int total;
    void calculate(int marks1,int marks2)
    {
        total=marks1+marks2+sportswt;
    }
    public void putwt()
    {
        System.out.println("Sportswt:"+sportswt);
    }
    void display()
    {
        System.out.println("Roll number:"+roll_num);
        System.out.println("Name:"+name);
        putwt();
        System.out.println("Total:"+total);
    }
}
class show_result
{
    public static void main(String args[])
    {
        int marks_1,marks_2;
        Scanner sc=new Scanner(System.in);
        Result r1=new Result();
        System.out.println("Enter the Roll number:");
        r1.roll_num= sc.nextInt();
        System.out.println("Enter the Name:");
        r1.name= sc.next();
        System.out.println("Enter the marks1:");
        marks_1= sc.nextInt();
        System.out.println("Enter the marks2:");
        marks_2= sc.nextInt();
        r1.calculate(marks_1,marks_2);
        r1.display();
    }
}
