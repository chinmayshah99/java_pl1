import java.util.Scanner;
import java.io.*;


class InvalidAgeException extends Exception{
    InvalidAgeException(String s)
    {
        super(s);
    }
}



class task2{


    void getage(int age) throws InvalidAgeException
    {
        if(age < 0 || age > 100)
        {
            throw new InvalidAgeException("enter valid age");
        }
    }

    public static void main(String args[])
    {

    Scanner sc  = new Scanner(System.in);
    int checkage = sc.nextInt();
    task2 obj = new task2();
    try{
    obj.getage(checkage);
    }catch(InvalidAgeException e){
        System.out.println(e);
    }
    }
}