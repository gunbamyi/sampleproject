package sampleproject;

public class Student extends Person  {

	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**
	 * @param name
	 * @param age
	 * @param schoolName
	 */
	public Student(String name, int age, String schoolName) {
		System.out.println(" Student Ŭ���� ������ ȣ��� !! ");
		super.setName(name);
	    super.setAge(age);
		this.schoolName = schoolName;
	}
	public void showInfo() {
		System.out.println("�̸�: "   + super.getName() + 
                " ����: "  + super.getAge() + 
                " �б�: "  + this.getSchoolName() );
		
	}

}


