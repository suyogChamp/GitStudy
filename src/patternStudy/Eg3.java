package patternStudy;

public class Eg3 {

	public static void main(String[] args) {

		
		//  *
		//  **
		//  ***
		//  ****
		//  *****
		
		//BASIC THINGS TO DRAW ANY PATTERN
		
		//row==5  columns==5 (maximum zolumn ghyayache)
		// star chi initial value hi pahilya row la jevdi disel tevdi ghyaychi
	    //	right side la kitihi space asli tari tyacha variable ghyayacha nhi..
		// jevha left side la space asel tevhach ghyayacha
		//ithe right side space ahe pn tyacha khi farak padat nhi
		
		int star1=1;
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=star1;col++)
			{
				System.out.print("*");
			
			}
			
			System.out.println();
			star1++;
		}
		
		// now reverse of it
		
		// *****
		// ****
		// ***
		// **
		// *
		
		int star=5;
		
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star--;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
