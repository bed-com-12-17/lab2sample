//This program will print out a student's details
import java.util.Scanner;						 	// importing Scanner instance
public class StudentManagementProgram{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	 	//instantiating Scanner variable

		Student StudentObject = new Student();   	//calling the Student class where the blueprint is

		System.out.print("Enter your name here: "); // prompting the user to enter the name set in class Student
		String temp = input.nextLine();
		StudentObject.setName(temp);

		System.out.println("Enter grades here");	//prompting the user to enter grades set in class Student
		double grades[] = new double[3];			//declaring an array that will store the grades
		for(int i=0; i<3; i++){						//looping through the grades
			grades[i] = input.nextDouble();
		}
		StudentObject.setGrades(grades);			//calling the setGrades method
		StudentObject.getAverageGrade();			//calling the getAverage method

		StudentObject.printDetails();				//calling the printDetails method
	}
}