package patternStudy;

public class Eg4 {

	public static void main(String[] args) {

		//  *****
		//   ****
		//    ***
		//     **
		//      *
		
		// Ithe left side la space ahe mnun ithe apan space cha variable ghetala
		
		int space=0;
		int star=5;
		
		for(int row=1;row<=5;row++)
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
			star--;
		}
		
// ithe apan space chi initial value hi 1 thevali karan ki aplyala mahit ahe first row madhe space nhi ahe
// ani space chi sarvat agodar value hi 0 ahe tr  looop madhe samja initial value 1 ahe ani cond star<=0 asel tr to code execute honar nhi ani first row madhe space create honar nhi		
		
		
			
		
		
		
		
		
		
		
	}

}
