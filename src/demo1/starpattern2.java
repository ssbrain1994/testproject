package demo1;

public class starpattern2 {
	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=6; i++)
		{
			for(j=1; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 int i,j;
		 for(int i=0;i<=6;i++){
		 for(int j=0;j<i;j++){
		 Syso("*");
		 }
		 Syso();
		 */
	}
}
