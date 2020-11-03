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
	private ArrayList<String> Courses;
	private ArrayList<String> Modules;
	
	
    public Student(String Name,int Age,DateTime DOB,long ID)
    {
        this.Name=Name;
        this.Age=Age;
        this.DOB=DOB;
        this.ID=ID;
    }

    public String getUsername(){
    	if (Username==null) {
    		Username=((Name+Age).replaceAll("\\s+", ""));
    	}
    	return Username;
    }

    public void addModule(String m){
    	Modules.add(m);
	}
	public void addCourse(String c){
		Modules.add(c);
	}

	public void Printout(){
		System.out.printf("Username: %s",getUsername());
		System.out.print("Modules: ");
		for(String x:Modules){System.out.printf(x+" ");}
		System.out.print("Courses: ");
		for(String x:Courses){System.out.printf(x+" ");}

	}

    //Accessor Methods
	public String getName(){return Name;}
	public int getAge(){return Age;}
	public DateTime getDOB(){return DOB;}
	public long getID(){return ID;}
	public ArrayList<String> getCourses(){return Courses;}
	public ArrayList<String> getModules(){return Modules;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setAge(int Age){this.Age=Age;}
	public void setDOB(DateTime DOB){this.DOB=DOB;}
	public void setID(long ID){this.ID=ID;}
	public void setUsername(String Username){this.Username=Username;}
	public void setCourses(ArrayList<String> Courses){this.Courses=Courses;}
	public void setModules(ArrayList<String> Modules){this.Modules=Modules;}
    
}
