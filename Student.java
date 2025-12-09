
public class Student {
	
	private String name;
	private Course [] courseList = new Course[10];
	private int numCourses = 0;
	
	public Student(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) //referss to the field 
	{
		this.name = name;     // can be used to call different constructor
	}
	
	public void addCourse(Course c)
	{
		courseList[numCourses++] = c;
	}
	
	public String [] getCourses()
	{
		String [] coursesNames = new String[numCourses];
		for (int i = 0; i < numCourses; i++)
		{
			coursesNames[i] = courseList[i].getName();
		}
		return coursesNames;
	}
}
