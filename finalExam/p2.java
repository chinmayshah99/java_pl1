// To input details of 5 employees(using getdata) and decide salary according to designation and display its
// Chinmay Shah

import java.io.*;
import java.util.Scanner;

class employee{
    int id,salary;
    String name, add, designation;

    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        name = sc.next();
        add = sc.next();
        System.out.println("1. senior developer, 2. tester 3. junior developer");
        int temp;
        temp = sc.nextInt();
        if(temp == 1)
        {
            designation = "senior developer";
            salary  = 2000000;
        }
        else if(temp == 2)
        {
            designation = "tester";
            salary  = 75000;   
        }
        else
        {
            designation = "junior developer";
            salary  = 25000;
        }
    }
    void putdata()
    {
        System.out.println("Name: "+ name);
        System.out.println("id: "+ id);
        System.out.println("Address: "+ add);
        System.out.println("designation: "+ designation);
        System.out.println("salary: "+ salary);
    }

    public static void main(String[] args) {
        for(int i = 0 ; i < 5; i++)
        {
        System.out.println("enter for employee"+ (i+1));
        employee e = new employee();
        e.getdata();
        e.putdata();
        }

    }
}