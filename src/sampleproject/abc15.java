package sampleproject;

public class abc15 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10, 20, 30};
	      int[] rightArray = new int[]{10, 20, 30};
	  
	      //�ڵ��ۼ�
	      if(leftArray.length != rightArray.length) {
	        System.out.println("�ι迭�� ����(ũ��)�� �ٸ��ϴ� ");
	      }else {
	        System.out.println("�ι迭�� ����(ũ��)�� �����ϴ� ");
	        for(int i=0; i<rightArray.length; i++ ) {
	          if(leftArray[i] != rightArray[i]) {
	            System.out.println( (i) + "��° ���Ұ� �ٸ��ϴ�");
	          }
	        }
	        
	     }
	 }
}
