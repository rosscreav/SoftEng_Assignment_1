package Software_Eng.Assignment1;

//Imports
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course 
{
	//Variables
	private String Name;
	private ArrayList<Module> Modules;
	private DateTime StartDate;
	private DateTime EndDate;

    public Course(String Name,DateTime StartDate,DateTime EndDate)
    {
        this.Name=Name;
        this.StartDate=StartDate;
        this.EndDate=EndDate;
    }

    public void addModule(Module m){
    	Modules.add(m);
    	m.addCourse(Name);
	}

	@Override
	public String toString(){
		return Name;
	}

    //Accessor Methods
    public String getName(){return Name;}
	public ArrayList<Module> getModules(){return Modules;}
	public DateTime getStartDate(){return StartDate;}
	public DateTime getEndDate(){return EndDate;}

	//Mutator Methods
	public void setName(String Name){this.Name=Name;}
	public void setModules(ArrayList<Module> Modules){this.Modules=Modules;}
	public void setStartDate(DateTime StartDate){this.StartDate=StartDate;}
	public void setEndDate(DateTime EndDate){this.EndDate=EndDate;}
}
