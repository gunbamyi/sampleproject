package com.javaex;

public class HouseDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
public class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    } 

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();     // sleep() �޼ҵ� ȣ��
        houseDog.sleep(3);   // sleep(int hour) �޼ҵ� ȣ��