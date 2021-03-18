package sampleproject;

public class abc14 {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5,6};
		for(int n=0; n<intArray.length; n++) {
			intArray[n] = (int)(Math.random()*45)+1;
			System.out.print(intArray[n] + "\t");
		}
		

	}

}
