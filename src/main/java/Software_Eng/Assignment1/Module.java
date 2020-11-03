package Software_Eng.Assignment1;

import java.util.ArrayList;


public class Module 
{
	//Variables
	private String Name;
	private String ID;
	private ArrayList<Student> Students=new ArrayList<>();
	private ArrayList<String> Courses=new ArrayList<>();

	//Constructor
    public Module(String Name,String ID)
    {
    	this.Name=Name;
    	this.ID=ID;
    }

    //Add student to list and add Module to student
    public void addStudent(Student s){
    	//Add student to list of students
    	Students.add(s);
    	//Add the module to the student
    	s.addModule(Name);
	}

	//Add course to list and add course to student
	public void addCourse(String c){
    	//Add course to list of courses
		Courses.add(c);
		//Adds the course to all students in module
		for(Student x:Students){
			x.addCourse(c);
		}
	}

	@Override
	//To String method returns name of Module
	public String toString(){
    	return Name;
	}

    //Accessor Methods
	public ArrayList<Student> getStudents(){return Students;}
	public ArrayList<String> getCourses(){return Courses;}

}
