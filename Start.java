package hw2ReadTxt;

import java.util.ArrayList;
import java.util.Iterator;


import hw2ReadTxt.file;


public class Start    {

	public static void main(String[] args) {
		//讀檔案資料  並建立一個array給他放
//				String[] lines = file.readFile("C:\\Users\\sos91\\Desktop\\JAVA\\JAVATest2\\CourseData.txt");
//				String[] lines2 = file.readFile("C:\\Users\\sos91\\Desktop\\JAVA\\JAVATest2\\DeptData.txt");
//				String[] lines3 = file.readFile("C:\\Users\\sos91\\Desktop\\JAVA\\JAVATest2\\StudentCourseData.txt");
//				String[] lines4 = file.readFile("C:\\Users\\sos91\\Desktop\\JAVA\\JAVATest2\\StudentData.txt");
//				//建ArrayList 把要的資料丟出來
//				ArrayList<Student> stulist = new ArrayList<>();
//		
//				
////				//用for each去跑
//				for(String line:lines) 
//				{
//					//System.out.println(line);
//					if(line.charAt(0)!='-')
//					{
//						String[] data = line.split(",");
//						//System.out.println(data[0]);
//						//新增變數a
//						Student a = new Student(data[0],data[1]);
//						//把資料存到變數a
//						stulist.add(a);
//						//System.out.println(a.getName());
//					}
//					
//				}
//				
//				for(String line2:lines2) 
//				{
//					//System.out.println(line2);
//					if(line2.charAt(0)!='-')
//					{
//						String[] data2 = line2.split(",");
//						Student b = new Student(data2[0],data2[1]);
//						stulist.add(b);
//						//System.out.println(b.getNum()+b.getName());
//						
//					}
//				}
//				
//				for(String line3:lines3) 
//				{
//					//System.out.println(line3);
//					if(line3.charAt(0)!='-')
//					{
//						String[] data3 = line3.split(",");
//					}	
//				}
//				
//				for(String line4:lines4) 
//				{
//					//System.out.println(line4);
//					if(line4.charAt(0)!='-')
//					{
//						String[] data4 = line4.split(",");
//						Student c = new Student(data4[0],data4[1],data4[2]);
//						stulist.add(c);
//						String aaa = c.getNum()+","+c.getName()+","+c.getMajor();
//						//System.out.println(aaa);
//					
//					}
//				}
//			
//				
//				Iterator<Student> it = stulist.iterator();
//				
//				Student a = it.next();
//				Student a1 = it.next();
//				Student a2 = it.next();
//				Student a3 = it.next();
//				Student a4 = it.next();
//				Student a5 = it.next();
//				
//				System.out.println(a5.getNum()+a.getName()+a2.getName()+a.getCourse());
//				
//				
//				while(it.hasNext()){
//					
//					Student prod = it.next();
//					
//					System.out.println(prod.getNum()+prod.getName());
//				}
				
//				Course abc = new Course();
//				abc.readfile();
//				
//				Dept abcd = new Dept();
//				abcd.readfile();
//				
//				Student stu = new Student();
//				stu.readfile();
//				
//				StudentCourse stu1 = new StudentCourse();
//				stu1.readfile();
			
				//new check().icheck();
				
				Dept aaa = new Dept();
				aaa.readfile();
				
//				System.out.println(aaa.readfile());
				
	}
	
}
				


