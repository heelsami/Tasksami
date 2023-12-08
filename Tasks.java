import java.util.*;

//Q2***********

public class Tasks{
	public static void main (String[] args){

		Rectangle r1 = new Rectangle(1.2, 3.4);
		Rectangle r2 = new Rectangle(1.0, 1.0);
		Rectangle r3 = new Rectangle(5.6, 7.8);
		System.out.println("Rectangle [length=" + r1.length + ", width="+r1.width+"]" );
		System.out.println("Rectangle [length=" + r2.length + ", width="+r2.width+"]" );
		System.out.println("Rectangle [length=" + r3.length + ", width="+r3.width+"]" );
		


			if (r1.getArea() > r2.getArea() && r1.getArea() > r3.getArea()) {
            System.out.println("length is: " + r1.length);
            System.out.println("width is: " + r1.width);
            System.out.println("Area is: " + r1.getArea());
            System.out.println("Perimeter is: " + r1.getPerimetr());
          } else if (r2.getArea() > r1.getArea() && r2.getArea() > r3.getArea()) {
              System.out.println("length is: " + r2.length);
              System.out.println("width is: " + r2.width);
              System.out.println("Area is: " + r2.getArea());
              System.out.println("Perimeter is: " + r2.getPerimetr());
          } else {
              System.out.println("length is: " + r3.length);
              System.out.println("width is: " + r3.width);
              System.out.println("Area is: " + r3.getArea());
              System.out.printf(Locale.US, "Perimeter is: %.2f\n", r3.getPerimetr());
          }


	}
}
class Rectangle {
	double length, width;
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	double getArea() {
        return this.length * this.width;
    }

    double getPerimetr() {
        return (this.length + this.width) * 2;
    }
}



//Q1******************************


public class Tasks {
	public static void main(String [] args){
		Circle c1 = new Circle();
		System.out.println("The circle has radius of "+c1.radius+" The color of a circle  " + c1.getColor()+" and area of " +(int)c1.getArea());
		Circle c2 = new Circle(2.0, "blue");
		System.out.println("The circle has radius of "+c2.radius+" The color of a circle  " + c2.getColor()+" and area of " +(int)c2.getArea());
		Circle c3 = new Circle(3.0, "purple");
	    System.out.println("The circle has radius of "+c3.radius+" The color of a circle  " + c3.getColor()+" and area of " +(int)c3.getArea());;

	}
}
class Circle {
	double radius;
	String color;
	Circle(){
		radius = 1.0;
		color = "red";

	}
	Circle(double radius){
		this.radius = radius;
		this.color = "red";

	}
	Circle(String color){
		this.radius = 1.0;
		this.color = color;
	}
	Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
	double getArea(){
		return (radius * radius*Math.PI);
	}
	String getColor(){
		return color;
	}
	void setRadius(double radius) {
    this.radius = radius;
    
    }
    void setColor(String color){
    	this.color = color;
    }
}

public class Tasks {
    public static void main(String[] args) {
        // Создаем первый объект Random с начальным зерном 3
        Random random1 = new Random(4);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");

        // Создаем второй объект Random с начальным зерном 3
        Random random2 = new Random(1);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
    }
}