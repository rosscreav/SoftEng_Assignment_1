package Software_Eng.Assignment1;

//Imports
import org.joda.time.DateTime;


public class Student 
{
	//Variables
	private String Name;
	private int Age;
	private DateTime DOB;
	private long ID;
	private String Username;
	private Course[] Courses;
	private Module[] Modules;
	
	
    public Student(String Name,int Age,DateTime DOB,long ID,Course[] Courses,Module[] Modules)
    {
        this.Name=Name;
        this.Age=Age;
        this.DOB=DOB;
        this.ID=ID;
        this.Courses=Courses;
        this.Modules=Modules;
    }

    public String getUsername(){
    	return ((Name+Age).replaceAll("\\s+", ""));
    }

    //Accessor Methods
	public String getName(){return Name;}
	public int getAge(){return Age;}
	public DateTime getDOB(){return DOB;}
	public long getID(){return ID;}
	public Course[] getCourses(){return Courses;}
	public Module[] getModules(){return Modules;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setAge(int Age){this.Age=Age;}
	public void setDOB(DateTime DOB){this.DOB=DOB;}
	public void setID(long ID){this.ID=ID;}
	public void setUsername(String Username){this.Username=Username;}
	public void setCourses(Course[] Courses){this.Courses=Courses;}
	public void setModules(Module[] Modules){this.Modules=Modules;}
    
}
