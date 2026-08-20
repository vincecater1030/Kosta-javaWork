package ex0730;

public class Ch03 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		for (i = 1; i <= 5; i++) {
		    for ( j = 1; j <= i; j++) {
		        System.out.print("#"); 
		    }
		    System.out.println();
		}
		for (i = 5; i >= 1; i--) {
		    for ( j = 1; j <= i; j++) {
		        System.out.print("#"); 
		    }
		    System.out.println();
		}
		for (i = 1; i <= 4; i++) {
		    for ( j = 1; j <= i; j++) {
		        System.out.print("@"); 
		    }
//		    for ( j = 1; j <= i; j++) {
//		        System.out.print("@"); 
//		    }
		    System.out.println();
		}
		
//		System.out.println("공백..모르겠어요");
		
	
	}//
}//

	


