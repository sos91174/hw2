package hw2ReadTxt;

import java.util.ArrayList;


public class StudentCourse {
	
	
	public String stuId;
	public String deptId;
	StudentCourse()
	{
		
	}
	StudentCourse(String id,String dept)
	{
		this.stuId=id;
		this.deptId=dept;
	}
	
	
	public static ArrayList<StudentCourse> readfile(){
		String[] lines = file.readFile("D:\\WorkWork\\JAVA\\HW\\JAVATest2\\StudentCourseData.txt");
		ArrayList<StudentCourse> strlist=new ArrayList<>();
	
		
		for(String line:lines) 
		{
			//System.out.println(line);
			if(line.charAt(0)!='-')
			{
				String[] data = line.split(",");
			
				strlist.add(new StudentCourse(data[0], data[1]));
				
				
			}
		}
		
		
		
		return strlist;
	}
	
	
	public String checkclassName(String id) 
	{
		ArrayList<Course> courseList=new ArrayList<Course>();
		courseList=new Course().readfile();
		for (Course course : courseList) 
		{
			if(course.CourseNo.equals(id))
				return course.CourseName;
		}
		return "";
	}

}
