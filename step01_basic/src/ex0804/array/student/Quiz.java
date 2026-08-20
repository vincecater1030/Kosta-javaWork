package ex0804.array.student;

public class Quiz {

	public static void main(String[] args) {
		// 4번 (2)int[]array;array={1,2,3};
		// 5번 (3)boolean 타입 배열 항목의 기초 초기값은 true이다 (x)
		// 6번 3,5
		// 8번 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성하세요(중첩for문)
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
			int total = 0;
			int index = 0 ;
		for (int i=0;   i< array.length;  i++) {
			
			int rowLen = array[i].length;
			index += rowLen;
			
			for(int j=0;j< array[i].length;  j++) {
			
				total = total + array[i][j] ;
			}
			
		}System.out.println("총합은 ="+total);
		System.out.println(index);
		System.out.println("평균은 ="+(double)total/index);
		//주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성하세요(중첩for문)
		
		
		
	}
}
