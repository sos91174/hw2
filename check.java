package hw2ReadTxt;

import java.util.ArrayList;



public class check {
	
	public String stuId;
	public String stuName;
	public String deptName;
	public ArrayList<String> courses;
	
	public void icheck() 
	{
		ArrayList<check> userViews=new ArrayList<>();
		
		ArrayList<Student> stuList=new ArrayList<>();
		
		stuList= new Student().readfile();
		for (Student student : stuList) 
		{
			check tempView=new check();
			tempView.stuId=student.id;
			tempView.stuName=student.name;
			
			tempView.deptName=serchDept(student.id);
			tempView.courses=serchCourse(student.id);
			userViews.add(tempView);
		}
		printList(userViews);
		
	}
	
	public void printList(ArrayList<check> tempList) 
	 {

		for (check checks : tempList)
		{
			
			System.out.println(checks.stuId+"\t"+checks.stuName
				         +"\t"+checks.deptName+"\t"+" "+checks.courses);
					
		}
		 
	 }
	
	public String serchDept(String id) 
	{
		String tempid=id.substring(0, 2);
		ArrayList<Dept> deptList=new ArrayList<Dept>();
		deptList=new Dept().readfile();
		for (Dept dept : deptList) 
		{
			if(dept.DeptNo.equals(tempid))
			{
				return dept.DeptName;
			}
		}
		return "";
	}
	
	public ArrayList<String> serchCourse(String id)
	{
		ArrayList<String> courseArr=new ArrayList<>();
		ArrayList<StudentCourse> stuCourse=new ArrayList<>();
		stuCourse=new StudentCourse().readfile();
		for (StudentCourse studentCourse : stuCourse) 
		{
			
			if (studentCourse.stuId.equals(id)) 
			{
				String tempString=new StudentCourse().checkclassName(studentCourse.deptId);
				courseArr.add(tempString);	
			}
		}
		return courseArr;
		
		
		
	}
	
	
	
	


}
