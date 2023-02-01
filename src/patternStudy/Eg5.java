package patternStudy;

public class Eg5 {

	public static void main(String[] args) {
		
		// reverse of this
		
		//      *
		//     **
		//    ***
		//   ****
		//  *****
		
	
		
			int space1=4;
			int star1=1;
			
			for(int row=1;row<=5;row++)
			{
				for(int i=1;i<=space1;i++)
				{
					System.out.print(" ");
				}
				
				for(int col=1;col<=star1;col++)
				{
					System.out.print("*");
					
				}
				
				System.out.println();
				space1--;
				star1++;
			}
			
		


	}

}
