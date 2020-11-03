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
	private ArrayList<String> Courses=new ArrayList<>();
	private ArrayList<String> Modules=new ArrayList<>();
	
	//Constructor
    public Student(String Name,int Age,DateTime DOB,long ID)
    {
        this.Name=Name;
        this.Age=Age;
        this.DOB=DOB;
        this.ID=ID;
        //Generates Username format FirstnameLastnameAge ie. RossCreaven2
		Username=((Name+Age).replaceAll("\\s+", ""));
    }

    //Adds the module to module list
    public void addModule(String m){
    	//Check if module is already in list
		if (!Modules.contains(m)) {
			Modules.add(m);
		}
	}
	//Adds the course to the course list
	public void addCourse(String c){
    	//Check if course is already in list
		if (!Courses.contains(c)) {
			Courses.add(c);
		}
	}

	@Override
	//Returns a string in the format "Username: %Username% Modules: %ModuleList% Courses: %CourseList%"
	public String toString(){
		return String.format("Username: %-30s Modules: %-80s Courses: %s \n",Username,Modules,Courses);
	}

	//Accessors
	public String getUsername(){return Username; }
	public ArrayList<String> getModules(){return Modules;}
	public ArrayList<String> getCourses(){return Courses;}
    
}
