package demo1;
import college.student;
import college.marks;
class demo
{
	public static void main(String args[])
	{
		student q=new student();
		marks l=new marks();
		q.getdata(10, "cs");
		q.putdata();
		l.getdata();
		l.putdata();
	}
}