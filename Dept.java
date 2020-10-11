package hw2ReadTxt;

import java.util.ArrayList;



public class Dept {
	
	public String DeptNo;
	public String DeptName;
	Dept()
	{
		
	}
	Dept(String no,String name)
	{
		this.DeptNo = no;
		this.DeptName = name;
	}

	
	
	public ArrayList<Dept> readfile(){
		//String[] lines = file.readFile("C:\\Users\\sos91\\Desktop\\JAVA\\JAVATest2\\DeptData.txt");
		String[] lines = file.readFile("D:\\WorkWork\\JAVA\\HW\\JAVATest2\\DeptData.txt");
		ArrayList<Dept> strlist=new ArrayList<Dept>();
		System.out.println(lines[0]);
		
		for(String line:lines) {
				String[] data = line.split(",");
				System.out.println(data[0]);
				System.out.println(data[1]);
				//new Dept(data[0], data[1]);
				//Dept dept = new Dept(data[0], data[1]);
				//strlist.add(new Dept(data[0], data[1]));
		}
	
		
		return strlist;
	}

}
