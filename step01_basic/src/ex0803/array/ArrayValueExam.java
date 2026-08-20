package ex0803.array;


class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)  ->명시적 초기화
	int arr[] = new int [] {10,9,8,7,6,5,4,3,2,1};

   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.   특별한 내용 없으면 ->퍼블릭 보이드 인수 
   */	
	public void printArrayvalue() {
		System.out.println("arr="+arr);
		int len = arr.length;
		
		for(int i=0;i<len;i++) {
		System.out.println(arr[i]); 
		
		arr[2]=200;
		
		}System.out.println();
	}
}


/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue xxx = new ArrayValue();
		xxx.printArrayvalue();
	}
}
