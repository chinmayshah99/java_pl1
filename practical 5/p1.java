import java.util.*;
abstract class Shape
{
    abstract int area(int l, int b);
    abstract int perimeter(int l, int b);
}
class Rectangle extends Shape
{
    int l,b, area, perimeter;

    int area(int l, int b)
    {
    this.l=l;
    this.b=b;
    area=l*b;
    return area;
    }
    int perimeter(int l, int b)
    {
        this.l=l;
        this.b=b;
        perimeter=2*(l+b);
        return perimeter;
    }
}
class Square extends Shape
{
    int s, area, perimeter;

    int area(int l, int b)
    {
        this.s=l;
        area=s*s;
        return area;
    }
    int perimeter(int l, int b)
    {
        this.s=l;
        perimeter=4*(s);
        return perimeter;
    }
}
class run
{
    public static void main(String args[])
    {
        int rectangle_area,rectangle_perimeter, square_area, square_perimeter;
        Rectangle r1 = new Rectangle();
        Square s1 = new Square();
        rectangle_area= r1.area(1,2);
        rectangle_perimeter= r1.perimeter(1,2);
        square_area= s1.area(1,1);
        square_perimeter= s1.perimeter(1,1);
        System.out.println("Reactangle: \nArea="+rectangle_area+"\nPerimeter="+rectangle_perimeter+"\nSquare:\nArea="+square_area+"\nPerimeter="+square_perimeter);
    }
}