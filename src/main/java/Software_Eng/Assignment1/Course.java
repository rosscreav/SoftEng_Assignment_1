package Software_Eng.Assignment1;

//Imports
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course 
{
	//Variables
	private String Name;
	private ArrayList<Module> Modules;
	private ArrayList<Student> Students;
	private DateTime StartDate;
	private DateTime EndDate;

    public Course(String Name,ArrayList<Module> Modules,ArrayList<Student> Students,DateTime StartDate,DateTime EndDate)
    {
        this.Name=Name;
        this.Modules=Modules;
        this.Students=Students;
        this.StartDate=StartDate;
        this.EndDate=EndDate;
    }

    //Accessor Methods
    public String getName(){return Name;}
	public ArrayList<Module> getModules(){return Modules;}
	public ArrayList<Student> getStudents(){return Students;}
	public DateTime getStartDate(){return StartDate;}
	public DateTime getEndDate(){return EndDate;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setModules(ArrayList<Module> Modules){this.Modules=Modules;}
	public void setStudents(ArrayList<Student> Students){this.Students=Students;}
	public void setStartDate(DateTime StartDate){this.StartDate=StartDate;}
	public void setEndDate(DateTime EndDate){this.EndDate=EndDate;}
}
