package xls;

abstract class polymorphism {
abstract int getrateofinterest();
	}
class sbi extends polymorphism{
	int getrateofinterest(){return 7;}
}
class icici extends polymorphism{
	int getrateofinterest(){return 8;}
}
class test{
	public static void main(String[] args) {
		polymorphism b;
		b=new sbi();
		System.out.println(""+b.getrateofinterest()+"%");
		System.out.println(""+b.getrateofinterest()+"%");
	}
}