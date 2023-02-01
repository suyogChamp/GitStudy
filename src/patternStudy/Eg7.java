package patternStudy;

public class Eg7 {

	public static void main(String[] args) {
	
		//  *******
		//   *****
		//    ***
		//     *
		 
		// row =4 column=7 space=0 star=7
		
		int space=0;
		int star=7;
		
		for(int row=1;row<=4;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			
			for(int col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space++;
			star=star-2;
		}

	}

}
