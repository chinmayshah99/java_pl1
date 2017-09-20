package college;

public class student{
    int roll_num;
    String name;

    public void getdata(int rollno, String name)
    {
        this.roll_num = rollno;
        this.name = name;
    }
    public void putdata()
    {
        System.out.println(roll_num + " "+ name);
    }

}