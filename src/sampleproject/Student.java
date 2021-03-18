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
		System.out.println(" Student 클래스 생성자 호출됨 !! ");
		super.setName(name);
	    super.setAge(age);
		this.schoolName = schoolName;
	}
	public void showInfo() {
		System.out.println("이름: "   + super.getName() + 
                " 나이: "  + super.getAge() + 
                " 학교: "  + this.getSchoolName() );
		
	}

}


