package xls;

public class instance2 {

	
		
		instance2(){
			System.out.println("parent class");
		}
	}
	class b2 extends instance2(){
	b2(){
		super();
		System.out.println("child");
	}
	{System.out.println("instance block");}
}

public static void main(String[] args) {