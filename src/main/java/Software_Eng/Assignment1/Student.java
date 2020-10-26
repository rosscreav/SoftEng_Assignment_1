package Software_Eng.Assignment1;

//Imports
import org.joda.time.DateTime;
import java.util.ArrayList;


public class Student 
{
	//Variables
	private String Name;
	private int Age;
	private DateTime DOB;
	private long ID;
	private String Username;
	private ArrayList<Course> Courses;
	private ArrayList<Module> Modules;
	
	
    public Student(String Name,int Age,DateTime DOB,long ID,ArrayList<Course> Courses,ArrayList<Module> Modules)
    {
        this.Name=Name;
        this.Age=Age;
        this.DOB=DOB;
        this.ID=ID;
        this.Courses=Courses;
        this.Modules=Modules;
    }

    public String getUsername(){
    	if (Username==null) {
    		Username=((Name+Age).replaceAll("\\s+", ""));
    	}
    	return Username;
    }

    //Accessor Methods
	public String getName(){return Name;}
	public int getAge(){return Age;}
	public DateTime getDOB(){return DOB;}
	public long getID(){return ID;}
	public ArrayList<Course> getCourses(){return Courses;}
	public ArrayList<Module> getModules(){return Modules;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setAge(int Age){this.Age=Age;}
	public void setDOB(DateTime DOB){this.DOB=DOB;}
	public void setID(long ID){this.ID=ID;}
	public void setUsername(String Username){this.Username=Username;}
	public void setCourses(ArrayList<Course> Courses){this.Courses=Courses;}
	public void setModules(ArrayList<Module> Modules){this.Modules=Modules;}
    
}
