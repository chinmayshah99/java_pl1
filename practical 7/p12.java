import java.util.Scanner;
import java.io.*;

class p2{
    public static void main(String args[])
    {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            array[i] = sc.nextInt();
        }
        int choice = sc.nextInt();
        try{
            System.out.println(array[choice]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}