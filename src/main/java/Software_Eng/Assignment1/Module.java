package Software_Eng.Assignment1;

import java.util.ArrayList;


public class Module 
{
	//Variables
	private String Name;
	private String ID;
	private ArrayList<Student> Students;
	private ArrayList<String> Courses;

    public Module(String Name,String ID)
    {
    	this.Name=Name;
    	this.ID=ID;
    }

    public void addStudent(Student s){
    	Students.add(s);
    	s.addModule(Name);
	}

	public void addCourse(String c){
    	Courses.add(c);
		for(Student x:Students){
			x.addCourse(c);
		}
	}

	@Override
	public String toString(){
    	return Name;
	}

    //Accessor Methods
    public String getName(){return Name;}
	public String getID(){return ID;}
	public ArrayList<Student> getStudents(){return Students;}
	public ArrayList<String> getCourses(){return Courses;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setID(String ID){this.ID=ID;}
	public void setStudents(ArrayList<Student> Students){this.Students=Students;}
	public void setCourses(ArrayList<String> Courses){this.Courses=Courses;}
}
