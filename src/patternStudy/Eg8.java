package patternStudy;

public class Eg8 {

	public static void main(String[] args) {
		
		   //        *
			//      ***
			//     *****
			//    *******
		
		int space=3;
		int star=1;
		
		for(int row=1;row<=4;row++)
		{
			for(int i=1;i<=space;i++);
			{
				System.out.print(" ");
			}
			for(int col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space--;
			star=star+2;
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
