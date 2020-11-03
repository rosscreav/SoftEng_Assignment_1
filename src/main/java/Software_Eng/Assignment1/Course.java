package Software_Eng.Assignment1;

//Imports
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course 
{
	//Variables
	private String Name;
	private DateTime StartDate;
	private DateTime EndDate;
	private ArrayList<Module> Modules=new ArrayList<>();

	//Constructor
    public Course(String Name,DateTime StartDate,DateTime EndDate)
    {
        this.Name=Name;
        this.StartDate=StartDate;
        this.EndDate=EndDate;
    }

    //Add module to course
    public void addModule(Module m){
    	//Add module to to list of modules
    	Modules.add(m);
    	//Add the course to the modules
    	m.addCourse(Name);
	}

	@Override
	//toString method to return the name of course
	public String toString(){
		return Name;
	}

    //Accessors
	public ArrayList<Module> getModules(){return Modules;}

}
