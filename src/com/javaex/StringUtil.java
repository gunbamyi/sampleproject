package com.javaex;

public class StringUtil {

	public static String concatString(String[] strArray) {

		// �޼ҵ� �����ۼ�
		
		String result = null;

		for (int i = 0; i < strArray.length; i++) {

			//System.out.print(strArray[i]);
			result += strArray[i];
		}

		return result;
	}

}
