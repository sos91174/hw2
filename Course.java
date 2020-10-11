package hw2ReadTxt;

import java.util.ArrayList;


public class Course {
	
	public String CourseNo;
	public String CourseName;
	Course() 
	{
		
	}
	Course(String no,String name)
	{
		this.CourseNo = no;
		this.CourseName = name;
	}
	

	
	public static ArrayList<Course> readfile(){
		String[] lines = file.readFile("D:\\WorkWork\\JAVA\\HW\\JAVATest2\\CourseData.txt");
		ArrayList<Course> strlist=new ArrayList<>();
	
		
		for(String line:lines) 
		{
			//System.out.println(line);
			if(line.charAt(0)!='-')
			{
				String[] data = line.split(",");
				//System.out.println(data[0]);
				//System.out.println(data[1]);
				
				strlist.add(new Course(data[0], data[1]));	
				
				
			}
		}
		
		
		
		return strlist;
	}
	
	
}
