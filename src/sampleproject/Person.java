package sampleproject;

public class Person {
	private String name;
	private int age;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void showInfo() {
	    System.out.println("이름: " + name + " 나이: "  + age);
	  }
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		System.out.println(" Person 클래스 생성자 호출됨 !! ");
		this.name = name;
		this.age = age;
	}
	/**
	   * 기본 생성자
	   */
	  public Person() {
	    System.out.println(" Person 클래스 생성자 호출됨 !! ");
	  }
		
	}
   

