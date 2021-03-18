package sampleproject;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(1);//가장 앞에 데이터 추가
		list.addLast(2);//가장 뒤에 데이터 추가
		list.add(3);//데이터 추가
		list.add(1, 10);//index 1뒤에 데이터 10 추가
		
		System.out.println(list.indexOf(list));
		System.out.println(list.size());
		System.out.print(list.get(1));

	}

}
