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
	    System.out.println("�̸�: " + name + " ����: "  + age);
	  }
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		System.out.println(" Person Ŭ���� ������ ȣ��� !! ");
		this.name = name;
		this.age = age;
	}
	/**
	   * �⺻ ������
	   */
	  public Person() {
	    System.out.println(" Person Ŭ���� ������ ȣ��� !! ");
	  }
		
	}
   

