import java.util.Scanner;
import java.io.*;


class QueueException extends Exception{
    QueueException(String s)
    {
        super(s);
    }
}



class queue{

    int current;
    int array[] = new int[110000];
    queue()
    {
        current = 0;
    }
    void enQueue(int number)
    {
        array[current++] = number;
    }

    int deQueue() throws QueueException
    {
        if( current == 0)
        {
            throw new QueueException("queue is already empty");
        }
        else{
            return array[current--];
        }
    }

    public static void main(String args[])
    {

    Scanner sc  = new Scanner(System.in);
   
    queue q1 = new queue();
    for(int i = 0;i < 9; i++)
    {
    q1.enQueue(i* 4345);
    }
    for(int i =0; i< 10;i++)
    try{
    System.out.println(q1.deQueue());
    }catch(QueueException e){
        System.out.println(e);
    }

    }
}