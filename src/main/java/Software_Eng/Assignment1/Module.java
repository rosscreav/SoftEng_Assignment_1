package Software_Eng.Assignment1;


public class Module 
{
	//Variables
	private String Name;
	private String ID;
	private Student[] Students;
	private Course[] Courses;

    public Module(String Name,String ID,Student[] Students,Course[] Courses)
    {
    	this.Name=Name;
    	this.ID=ID;
    	this.Students=Students;
    	this.Courses=Courses;
    }

    //Accessor Methods
    public String getName(){return Name;}
	public String getID(){return ID;}
	public Student[] getStudents(){return Students;}
	public Course[] getCourses(){return Courses;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setID(String ID){this.ID=ID;}
	public void setStudents(Student[] Students){this.Students=Students;}
	public void setCourses(Course[] Courses){this.Courses=Courses;}
}
