import java.util.Scanner;

class Student{
	int roll;
	String name ;
	float marks;
	void input()
	{
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("Roll: " );
		 roll=myObj.nextInt();
         System.out.println("Name: ");
		 name = myObj.next();
		 System.out.println("marks: ");
		 marks=myObj.nextFloat();
                
	}
	void display()
	{
		System.out.println("Roll: " + roll);
		System.out.println("Name: " + name );
		System.out.println("Marks: " + marks);
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.input();
		obj.display();
	}
}
