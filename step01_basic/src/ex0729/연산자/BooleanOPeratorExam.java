package ex0729.연산자;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;
		boolean f=false;
		System.out.println("true&false="+(t&f));	//true&false= f
		System.out.println("true&true="+(t&t));		//true&true= t
		System.out.println("false&false="+(f&f));	//false&false= f
		System.out.println();
	
		System.out.println("true|false="+(t|f));	//true|false = t
		System.out.println("true|true="+(t|t));		//true|true = t
		System.out.println("false|false="+(f|f));   //false|false = f
		System.out.println();

		System.out.println("true^false="+(t^f));	//true^false = t
		System.out.println("true^true="+(t^t));     //true^true = f
		System.out.println("true^false="+(t^f));	//true^false = t
		System.out.println("true^true="+(t^t));		//true^true = f
		System.out.println();

		System.out.println("true&&false="+(t&&f));	//true&&false = t
		System.out.println("true&&true="+(t&&t));	// t
		System.out.println("true&&false="+(t&&f));  // t
		System.out.println("false&&false="+(f&&f)); // f
		System.out.println();

		System.out.println("true||false="+(t||f));	// t
		System.out.println("true||true="+(t||t));	//t
		System.out.println("false||false="+(f||f));	//f
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j); //int i= 5	3
		System.out.println("i>=j==>>"+(i>=j));	//i>=j==>>true
		System.out.println("i>j=>>"+(i>j));		//i>j=>>
		System.out.println("i<=j=>>"+(i<=j));	//i<=j=>>
		System.out.println("i<j=>>"+(i<j));		//i<j=>>
		System.out.println("i==j=>>"+(i==j));	//i==j=>>
		System.out.println("i!=j=>>"+(i != j)); //i!=j=>>

	}
}