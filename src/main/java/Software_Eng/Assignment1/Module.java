package Software_Eng.Assignment1;

import java.util.ArrayList;


public class Module 
{
	//Variables
	private String Name;
	private String ID;
	private ArrayList<Student> Students;
	private ArrayList<Course> Courses;

    public Module(String Name,String ID,ArrayList<Student> Students,ArrayList<Course> Courses)
    {
    	this.Name=Name;
    	this.ID=ID;
    	this.Students=Students;
    	this.Courses=Courses;
    }

    //Accessor Methods
    public String getName(){return Name;}
	public String getID(){return ID;}
	public ArrayList<Student> getStudents(){return Students;}
	public ArrayList<Course> getCourses(){return Courses;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setID(String ID){this.ID=ID;}
	public void setStudents(ArrayList<Student> Students){this.Students=Students;}
	public void setCourses(ArrayList<Course> Courses){this.Courses=Courses;}
}
