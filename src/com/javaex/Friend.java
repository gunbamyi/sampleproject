package com.javaex;
public class Friend {
	private String name;
    private String hp;
    private String school;
    //�ʿ��� �޼ҵ� �ۼ�
    
   	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
    public Friend(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	public void showInfo(){
		 System.out.println("�̸�:"+this.getName()+"  �ڵ���:"+this.getHp()+"  �б�:"+this.getSchool());
	}
}



