package ex0729.연산자;

class MathOperatorExam{
	public static void main(String []args){
		int i=5;
		int j=2;
		System.out.println("i+j="+i+j);		// i+j=52 연산자 우선순위가 없어서 순서가 왼쪽부터 가면서 String에 흡수 
		System.out.println("i-j="+(i-j));	// i-j=3
		System.out.println("i*j="+(i*j));	// i*j=10
		System.out.println("i/j="+(i/j));	// i/j=2
		System.out.println("i%j="+(i%j));	// i%j=1

		System.out.println("i="+i); 		// i=5
		
		int k=i++;
		System.out.println("k="+k);    		//k=5
		System.out.println("i="+i);			//i=6
		
		int p=++i;
		System.out.println("p="+p);			//p=6
		System.out.println("i="+i);			//i=6

		int x=19 + 4 * 3 / 2 - 10 * 2 + 4;

		System.out.println("19+4*3/2-10*2+4="+x);	//
	}	
}