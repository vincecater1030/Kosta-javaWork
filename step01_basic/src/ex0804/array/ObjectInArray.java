package ex0804.array;

//ObjectInArray.java

class ObjectOne{
	public int a;
    
    

}

public class ObjectInArray{
	//메인 메소드에서 
	public static void main(String[] args) {
		ObjectOne arr[] = new ObjectOne[5];//배열을 생성한것
		// System.out.println("---배열방 기본값--");
		 for(int i=0; i<arr.length ; i++) {
			 System.out.println("생성전: "+ arr[i] + "\t");
			  
			 arr[i] = new ObjectOne();
			  
			 System.out.println("생성후: "+ arr[i] + "\t");
		 
		 //각 객체의 a의 값 출력
			 System.out.println("arr[" +i+ "].a=" +arr[i].a + "\t");
			 
		 //각 객체의 a의 값 변경
			 arr[i].a = i+1;
		//변경된 a의 값 출력
			 System.out.println("후: arr[" +i+ "].a=" +arr[i].a+ "\n");
		 
		 }
		 System.out.println("--------------------");
		///////////개선된 for 문///////////

		for( ObjectOne obj : arr) {
		System.out.println(obj + "," +obj.a);
		}
	}	
		
//		
//		arr[0]= new ObjectOne();
//		arr[1]= new ObjectOne();
//		arr[2]= new ObjectOne();
//		arr[3]= new ObjectOne();
//		arr[4]= new ObjectOne();
//		
//		System.out.println("-----------");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println("-----------");
//		
//		System.out.println(arr[0].a);	
//		System.out.println(arr[1].a);
//		System.out.println(arr[2].a);
//		System.out.println(arr[3].a);
//		System.out.println(arr[4].a);
//		
//		System.out.println("-----------");
//		for(int i=0; i<arr.length ; i++) {
//		System.out.println(arr[0].a+i);
		

		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		 
		//5개의 ObjectOne객체를 생성하세요.
		//각 객체가 갖고있는 전역변수 출력
		//각 객체의 주소값 출력
			
		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.			
		//각 ObjectOne 객체의 a를 출력하세요
			
		
	
}
