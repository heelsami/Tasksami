import java.util.*;
// public class Object{
// 	public static void main (String [] args){
// 		Person person1 = new Person();
// 		person1.name = "Amina";
// 		person1.age = 17;
// 		System.out.println("My name is "+person1.name+". I am "+person1.age);
// 		Person person2 = new Person();
// 		person2.name = "Nurdana";
// 		person2.age = 18;
// 		System.out.println("My name is "+person2.name+". I am "+person2.age);


// 	}
// }
// class Person {
// 	String name;
// 	int age;

// }





//************

// public class Object{
// 	public static void main (String [] args){
// 		Pokemon p1 = new Pokemon();
// 		p1.name = "Amina";
// 		// p1.level = 100;
// 		 System.out.println(p1.name + " " + p1.level);
// 		 p1.attack();
		


  // }

// }


// class Pokemon{
// 		String name;
// 		int level;

// 		void attack(){

// 		    System.out.println(name +" attack!!");
// 	    }
// 	    Pokemon(){
// 	    	level = 1;
// 	    }

// }


// public class Object{
// 	public static void main(String[] args) {
// 		Pokemon p1 = new Pokemon("Amina", 100);

// 	}
// }
// class Pokemon{
// 	String name;
// 	int age;
// 	Pokemon(String name, int age){
// 		this.name = name;
// 		this.age = age;
// 	}
// 	
// }



//*******************

// public class Object {
// 	public static void main(String[]args){
// 		Circle circle1 = new Circle();
// 		System.out.println(circle1.getArea());
// 		Circle circle2 = new Circle(25);
// 		System.out.println(circle2.getArea());
// 		Circle circle3 = new Circle(125);
// 		System.out.println(circle3.getArea());
// 		circle2.radius = 100;
// 		System.out.println(circle2.getArea());

// 	}
// }
// class Circle{
// 	double radius;

// 	Circle(){
// 		radius = 1;
// 	}

// 	Circle(double radius){
// 		this.radius = radius;

// 	}
// 	double getArea(){
// 		return this.radius * this.radius * Math.PI;
// 	}
// 	double getPerimetr(){
// 		return 2* this.radius * Math.PI;
// 	}
// 	void setRadius(double radius){
// 		this.radius = radius;

// 	}

// }

public class Object{
	public static void main (String[]args){
		 Scanner scanner = new Scanner(System.in);

        // Ввод данных для Person
        System.out.println("Persons name:");
        String personName = scanner.nextLine();

        System.out.println("Persons address:");
        String personAddress = scanner.nextLine();

        // Создание объекта Person
        Person person = new Person(personName, personAddress);
        System.out.println(person);
        System.out.println();

        // Ввод данных для Student
        System.out.println("Students name:");
        String studentName = scanner.nextLine();

        System.out.println("Students address:");
        String studentAddress = scanner.nextLine();

        System.out.println("Students program:");
        String studentProgram = scanner.nextLine();

        System.out.println("Year:");
        int studentYear = scanner.nextInt();
        
        // Добавьте эту строку, чтобы "съесть" символ новой строки
        scanner.nextLine();
        
        System.out.println("Pay:");
        Double studentFee = scanner.nextDouble();

        // Создание объекта Student
        Student student = new Student(studentName, studentAddress, studentProgram, studentYear, studentFee);
        System.out.println(student);
        System.out.println();

        // Ввод данных для Staff
        System.out.println("Your name:");
        scanner.nextLine(); // Очистим буфер после nextInt
        String staffName = scanner.nextLine();

        System.out.println("Your address:");
        String staffAddress = scanner.nextLine();

        System.out.println("Your school:");
        String staffProgram = scanner.nextLine();

        System.out.println("Pay:");
        double staffFee = scanner.nextDouble();

        // Создание объекта Staff
        Staff staff = new Staff(staffName, staffAddress, staffProgram, staffFee);
        System.out.println(staff);
       
    



	}
}

class Person{
	public String name;
	public String address;

	public Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	public String getName(){
		return name;

	}
	public String getAddress(){
		return address;

	}
	public String toString(){
		return "Person[name "+ name + ", address " + address + " ]"; 
	}


}










