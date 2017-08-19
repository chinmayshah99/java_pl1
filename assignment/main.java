// Implement stacks using interfaces

import java.util.*;

interface hmm{

	public void push(int a[], int element, int size);
	public void pop();
	public void display(int a[]);
}

class zz implements hmm{
	public int top = -1;
	public void push(int a[], int element, int size)
	{
		top++;
		if(top == size)
			System.exit(-1);
		else
			a[top] = element;
	}

	public void pop()
	{
		if (top == -1)
			System.exit(-1);

		else
			top--;
	}


	public void display(int a[]) {
		for (int i = top-1; i >=0; i--) {
			System.out.println(a[i]);
		}
	}
}

public class main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		zz z1 = new zz();
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
			z1.push(a,a[i],size);
		}
		System.out.println("Current array: \n");
		z1.display(a);
		z1.pop();
		z1.display(a);
	}
}