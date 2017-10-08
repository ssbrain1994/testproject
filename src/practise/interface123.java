package practise;

public interface interface123 {
		void draw();  
		static int cube(int x){return x*x*x;}  
		}  
		class Rectangle implements interface123{  
		public void draw(){System.out.println("drawing rectangle");}  
		}  
		  
		class TestInterfaceStatic{  
		public static void main(String args[]){  
			interface123 d=new Rectangle();  
		d.draw();  
		System.out.println(interface123.cube(3));  
		}}  

