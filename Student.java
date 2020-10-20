//This program is a blueprint of the StudentManagementProgram class 
import java.util.Scanner;        										//importing the Scanner class
public class Student{
	Scanner input = new Scanner(System.in);								//instantiating the Scanner variable
	private String name;												// declaring variables only to be used in this class hence private
	private double [] grades;
	private int totalNumberOfStudents;

	Student(){															//Student constructor

	}

	public void setName(String name){									//setting the name
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setGrades(double [] grades){							//setting the grades
		this.grades = grades;
	}
	public double[] getGrades(){										//getting the grades
		return grades;
	}
	public int getNumberOfStudents(){									//getting the number of students
		System.out.print("Enter current number of students in class:"); //prompting the user to enter the number of students in the class
		totalNumberOfStudents=input.nextInt();
		return totalNumberOfStudents;
	}
	public double getAverageGrade(){
		getGrades();
		double average;													//computing the average grade of the student
		double total = 0;
		for(double x : grades){
			total +=x;
		}
		average = total/3;
		return average;
	}
	public void printDetails(){											//a method that prints all the student's information
		System.out.print("Student name is " +getName() +", average grade is "
		 +getAverageGrade() + " and the current number of students is " + getNumberOfStudents() + ".");
	}
}