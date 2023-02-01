package patternStudy;

public class EG9 {

	public static void main(String[] args) {
	
		//*******
		//******
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		//******
		//*******
		int star=7;
		
		for(int row=1;row<=13;row++)
		{
			for(int col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(row<7)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
