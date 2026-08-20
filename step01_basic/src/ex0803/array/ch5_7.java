package ex0803.array;

public class ch5_7 {

	public static void main(String[] args) {
		//주어진 배열 항목에서 최대값을 출력하는 코드를 작성하시요(for문)
		//int[] array = {1,5,3,8,2};
		
	        int array[] = {1, 5, 3, 8, 2};
	        int max = 0;

	        for (int i=0; i < array.length; i++) {
	            if (max < array[i]) {
	                max = array[i];
	            }                                  
	        } System.out.println("최대값 " + max);                                      
	
	/*public static void main(String[] args){
		int[] array = {1, 5, 3, 8, 2};
		int max =Integer.MIN_VALUE; //min_value 는 상수
				Integer.MIN_VALUE 인티저 안의 최고밧
				반대는    MAX_VALUE
				int max =0; 과 같이 볼수 있지만..
		
				 
	}*/
	
	
	
	}//매소드끝
	
	
	
}//클래스 끝