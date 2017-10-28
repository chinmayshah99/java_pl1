import java.util.Scanner;
import java.io.*;


class BalanceException extends Exception{
    BalanceException(String s)
    {
        super(s);
    }
}



class task21{


    void getbalance(int amount) throws BalanceException
    {
        if(amount < 0 || amount > 50000000 )
        {
            throw new BalanceException("doesn't seem likely");
        }
    }

    public static void main(String args[])
    {

    Scanner sc  = new Scanner(System.in);
    int check_balance = sc.nextInt();
    task21 obj = new task21();
    try{
    obj.getbalance(check_balance);
    }catch(BalanceException e){
        System.out.println(e);
    }
    }
}