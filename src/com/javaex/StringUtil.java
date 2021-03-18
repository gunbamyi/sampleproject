package com.javaex;

public class StringUtil {

	public static String concatString(String[] strArray) {

		// 메소드 내용작성
		
		String result = null;

		for (int i = 0; i < strArray.length; i++) {

			//System.out.print(strArray[i]);
			result += strArray[i];
		}

		return result;
	}

}
