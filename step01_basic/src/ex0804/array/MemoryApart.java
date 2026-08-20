package ex0804.array;

class MultiArray{
//클래스 내부에서는 선언문만 있어야 한다.
//정수형 2차원 배열 8*9
	 int arr [][] = new int [8][9]; //변수 선언
			
//메소드이름 :array99
	public void array99(){
//for loop 를 사용하여 배열에 곱한 (구구단)결과저장
//배열에 결과를 꺼내출력
		for(int i=0; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				
				arr[i][j]=(i+2) * (j+1);//변경
			
				System.out.print(arr[i][j]+"\t"); //배열방 출력
			}
			System.out.println();
		}	

	}			
		
}
////////////////////////////////////////////////////////
//public class MemoryApart {
//	public static void main(String[] args) {
//		MultiArray ma = new MultiArray();
//		//객체 생성 (=new MultiArray().array99();)
//		ma.array99();//매소드 호출
		

