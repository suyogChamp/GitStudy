package logicalProgrames;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

	//	int a = 20;
	//	int b = 30;
	//	int mul = a + b;
	//	System.out.println(mul);
		// ata yachi value kashi nehamich 50 yeil karan ki apan value fix kelya ahet
		// mg pratek veles apala input vegala vegala deu shaklo pahije yasathi apalya
		// kade ek
		// "scanner " navacha class ahe jo java cha ahe ani util package cha ahe
		
		//1. creating object of scanner class
		
		Scanner sc=new Scanner(System.in);  // yamadhe apan system.in ha kasha sathi gheatala..jevha aplyale ekhadi gosht hiprint karachi asel mnje ch aplyala output pahayacha asel tr apan system.out lihito..ani ithe aplyala input dyayacha ahe mhanun .in use kel
		
		// ata apala input kontahi datatype cha su shakto ttr tyasathi scanner chya vegveglya methods ahe "next" chaya
		//e.g
		// String input===> next();
		// number==decimal/nondecimal======>nextint();,nextboolean(); etc
		// char==>nextchar();
		
		
		//2 using object
		System.out.println("enter any string");// ...apan heka lihil karan ki apan jr program run kela asta t sagal blank diste he mnje aplyale sangan ki tumi asa as kara ba
		String value = sc.next();
		System.out.println("my name is "+value);
		
	//	ata apan he run kel ki sarvat agodar enter any string ha msg disel fkt
	// mg aplyala console madhe jaun je string takayachi asn te taku shakto ani enter kel ki my name is ani je string taku te print hoil	
		
	
		
		
		
		
		
		
		
		
		

	}

}
