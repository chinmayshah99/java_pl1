import java.util.*;
import java.io.*;

/**
 * p1
 */
class p1 {
    int  number1, number2;
     int getnumber1() {
        return number1;
    }

     void setnumber1(int number1) {
        this.number1 = number1;
    }

     int getnumber2() {
        return number2;
    }

     void setnumber2(int number2) {
        this.number2 = number2;
    }

    public static void main(String args[])
    {
        int number1, number2,choice;
        Scanner sc = new Scanner(System.in);
        p1 obj = new p1();
        try{
            number1 = sc.nextInt();
            number2 = sc.nextInt();
            choice = sc.nextInt();
            obj.setnumber1(number1);
            obj.setnumber2(number2);
        }catch(NumberFormatException  c1){
            System.out.println(c1);
            choice = 1;
        }

        try {
            if (choice == 1) {
                int calc = obj.getnumber1() + obj.getnumber2();
                System.out.println(calc);
            } else if (choice == 2) {
                System.out.println(obj.getnumber1() - obj.getnumber2());
            } else if (choice == 3) {
                System.out.println(obj.getnumber1() * obj.getnumber2());
            } else if (choice == 4) {
                float calc = obj.getnumber1() / obj.getnumber2();
                System.out.println(calc);
            }
            else{

            }
        }catch (ArithmeticException a) {
            System.out.println(a);
        }
    }


}
