package college;
import java.util.Scanner;

public class marks extends student{
    int n, total = 0;
    float percentage;
    Scanner s = new Scanner(System.in);
    int marks[] = new int[5];
	public	void getdata()
    {
        System.out.println("Enter marks");
        for(int i = 0; i < 5; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
    }
    public void putdata()
    {
        percentage = (float)((total*100) /500) ;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
        if(percentage<90.0)
            System.out.println("Merit :"+percentage);
        else if(percentage>90.0)
            System.out.println("Distinction"+percentage);
        else
            System.out.println("First class"+percentage);
    }
	
	
}