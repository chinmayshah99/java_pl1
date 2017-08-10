// This programs demonstrates function overloading
// Chinmay Shah

import java.util.Scanner;

class check{

    void printHeader(char c)
    {
        System.out.printf("%n");
        for(int i = 0 ; i < 70; i++)
            System.out.print(c);
    }
    void printHeader(char c, int no)
    {
        System.out.printf("%n");
        for(int i = 0; i< no; i++)
            System.out.print(c);
    }
    void printHeader(String s)
    {
        System.out.printf("%n");
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        check obj = new check();
        obj.printHeader('c');
        obj.printHeader("java ain't bae");
        obj.printHeader('h',10);
    }
}