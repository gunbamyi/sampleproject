package com.javaex;
import java.util.Scanner;
public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend[] sArr = new Friend[3];
		Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요");
            // 친구정보 입력받기
            // 입력받은 친구정보를 공백으로 분리
            // Friend 객체 생성하여 데이터 넣기
            // 배열에 추가하기
        // 친구정보 출력
        
               
        for (int i = 0; i < sArr.length; i++) {
            //친구정보 출력 메소드 호출
        	String temp = sc.nextLine();
        	String[] tempArr = temp.split(" ");
        	sArr[i] = new Friend(tempArr[0],tempArr[1],tempArr[2]);
       }
        for( int i=0; i< sArr.length; i++) {
        	sArr[i].showInfo();
        }
         sc.close();
	}



	}


