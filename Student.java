package hw2ReadTxt;

import java.util.ArrayList;


public class Student {
	
	public String id;
	public String name;
	public String birday;
	
	Student()
	{
		
	}
	
	Student(String id,String name,String birday)
	{
		this.id= id;
		this.name= name;
		this.birday= birday;
	}
	
	
	
	public static ArrayList<Student> readfile(){
		String[] lines = file.readFile("D:\\WorkWork\\JAVA\\HW\\JAVATest2\\StudentData.txt");
		ArrayList<Student> strlist=new ArrayList<Student>();
	
		
		for(String line:lines) 
		{
			//System.out.println(line);
			if(line.charAt(0)!='-')
			{
				String[] data = line.split(",");
				//System.out.println(data[0]);
				//System.out.println(data[1]);
				
				strlist.add(new Student(data[0], data[1],data[2]));
				
			}
		}
		
		
		return strlist;
	}
	
	
	
	
	
	
	
	
	
	
	
}
