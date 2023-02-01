package patternStudy;

public class Eg6 {

	public static void main(String[] args) {

		//
		//       *
		//      ***
		//     *****
		//    *******
		
		// ithe donhi side n space ahe pn right side chya space ch khich ghen den nhi thevach
		// row =4 ;col=7(highest); space=3(always take value of space from first row)
		// star= 1(always take value of star from first row)
		
		int space=3;
		int star=1;
		
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
			space--;
			star=star+2;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
