package ex0803.overloading;

//import com.sun.swing.internal.plaf.metal.resources.metal;

class Test{
     public void aa(){
    	 System.out.println(1);
     }
     public int aa(int i){
    	 System.out.println(2);
        return 4;
     }
     protected void aa(String s){  
    	 System.out.println(3);
     }

     String aa(int i, String s){
    	 System.out.println(4);
       return "ddd";
    }
  
     ///////메인 메소드///////////////
    public static void main(String[] args) {
    	//메소드 호출
    	  Test t =new Test();
    	  t.aa();
    	  t.aa(3);
    	  t.aa("하이");
    	  t.aa(3,"하이");

    	/**
    	 * t.aa("졸지마",true); /오류 난다 유형 맞는게 없으니까
    	 */
    	
	}
     
     
     
 }//클래스 끝
 
 