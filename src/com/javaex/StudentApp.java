package com.javaex;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sArr = new String[5];
		Student[] stu = new Student[5];
		
		for(int i=0; i<stu.length; i++)  {
			stu[i] = new Student("201010","È«±æµ¿", "³²", i+10);
					
		for(int i1=0; i1<stu.length ; i1++)  {
			System.out.println("===========================");
			stu[i1].show();
		}
		}
		

	}

}
