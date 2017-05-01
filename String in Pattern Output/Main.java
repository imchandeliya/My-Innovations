import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Main obj = new Main();
		obj.Proceed();
	}
	
	
	void Proceed()
	{
		Scanner scan = new Scanner(System.in);
		
		
		int i=0,j=0;
		System.out.print("Enter any String :");
		String entry = scan.nextLine();
		int stringLength = entry.length();								//Print String Length
	//	System.out.println("String length is "+stringLength);
		
		char[] entryy = new char[stringLength];
		
		
		for( i=0 ; i<stringLength ; i++)
		{
			entryy[i] = entry.charAt(i);
		}
		
		//Print Entryy Array items
/*		for(i=0 ; i<stringLength ; i++)
		{
			System.out.println(entryy[i]);
		}
*/
		System.out.println("\n");
		for(i=0 ; i<5 ; i++)
		{
			for(j=0 ; j<stringLength ; j++)
			{
				switch(entryy[j])
				{
					case ('A'):
						patternA(i);
						break;
					case ('a'):
						patternA(i);
						break;
						
					case ('B'):
						patternB(i);
						break;
					case ('b'):
						patternB(i);
						break;
						
					case 'C':
						patternC(i);
						break;
					case 'c':
						patternC(i);
						break;
						
					case 'D':
						patternD(i);
						break;
					case 'd':
						patternD(i);
						break;
						
					case 'E':
						patternE(i);
						break;
					case 'e':
						patternE(i);
						break;
						
					case 'F':
						patternF(i);
						break;
					case 'f':
						patternF(i);
						break;
						
					case 'G':
						patternG(i);
						break;
					case 'g':
						patternG(i);
						break;
						
					case 'H':
						patternH(i);
						break;
					case 'h':
						patternH(i);
						break;
						
					case 'I':
						patternI(i);
						break;
					case 'i':
						patternI(i);
						break;
						
					case 'J':
						patternJ(i);
						break;
					case 'j':
						patternJ(i);
						break;
						
					case 'K':
						patternK(i);
						break;
					case 'k':
						patternK(i);
						break;
						
					case 'L':
						patternL(i);
						break;
					case 'l':
						patternL(i);
						break;
						
					case 'M':
						patternM(i);
						break;
					case 'm':
						patternM(i);
						break;
						
					case 'N':
						patternN(i);
						break;
					case 'n':
						patternN(i);
						break;
						
					case 'O':
						patternO(i);
						break;
					case 'o':
						patternO(i);
						break;
						
					case 'P':
						patternP(i);
						break;
					case 'p':
						patternP(i);
						break;
						
					case 'Q':
						patternQ(i);
						break;
					case 'q':
						patternQ(i);
						break;
						
					case 'R':
						patternR(i);
						break;
					case 'r':
						patternR(i);
						break;
						
					case 'S':
						patternS(i);
						break;
					case 's':
						patternS(i);
						break;
						
					case 'T':
						patternT(i);
						break;
					case 't':
						patternT(i);
						break;
						
					case 'U':
						patternU(i);
						break;
					case 'u':
						patternU(i);
						break;
						
					case 'V':
						patternV(i);
						break;
					case 'v':
						patternV(i);
						break;
						
					case 'W':
						patternW(i);
						break;
					case 'w':
						patternW(i);
						break;
						
					case 'X':
						patternX(i);
						break;
					case 'x':
						patternX(i);
						break;
						
					case 'Y':
						patternY(i);
						break;
					case 'y':
						patternY(i);
						break;
						
					case 'Z':
						patternZ(i);
						break;
					case 'z':
						patternZ(i);
						break;
						
					case ' ':
						patterSpace(i);
						break;
					
				}
			}
			System.out.println();
		}
		
				
		
	}
	

	void patternA(int i)
	{
		
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" ******* ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print(" *     * ");
				break;
				
		}
	}
	void patternB(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******  ");
				break;
			case 1:
				System.out.print(" *    *  ");
				break;
			case 2:
				System.out.print(" ******* ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternC(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *       ");
				break;
			case 2:
				System.out.print(" *       ");
				break;
			case 3:
				System.out.print(" *       ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternD(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******  ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" *     * ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print(" ******  ");
				break;
		}
	}
	
	void patternE(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *       ");
				break;
			case 2:
				System.out.print(" ****    ");
				break;
			case 3:
				System.out.print(" *       ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternF(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *       ");
				break;
			case 2:
				System.out.print(" ****    ");
				break;
			case 3:
				System.out.print(" *       ");
				break;
			case 4:
				System.out.print(" *       ");
				break;
		}
	}
	////////////////////////////////////
	void patternG(int i)
	{
		switch(i)
		{
			case 0:0
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *       ");
				break;
			case 2:
				System.out.print(" *   *** ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternH(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *     * ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" ******* ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print(" *     * ");
				break;
		}
	}
	
	void patternI(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print("    *    ");
				break;
			case 2:
				System.out.print("    *    ");
				break;
			case 3:
				System.out.print("    *    ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternJ(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print("       * ");
				break;
			case 1:
				System.out.print("       * ");
				break;
			case 2:
				System.out.print("       * ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print("  *****  ");
				break;
		}
	}

	void patternK(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *    *  ");
				break;
			case 1:
				System.out.print(" *  *    ");
				break;
			case 2:
				System.out.print(" ***     ");
				break;
			case 3:
				System.out.print(" *   *   ");
				break;
			case 4:
				System.out.print(" *     * ");
				break;
		}
	}
	
	void patternL(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *       ");
				break;
			case 1:
				System.out.print(" *       ");
				break;
			case 2:
				System.out.print(" *       ");
				break;
			case 3:
				System.out.print(" *       ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternM(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" **   ** ");
				break;
			case 1:
				System.out.print(" * * * * ");
				break;
			case 2:
				System.out.print(" *  *  * ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print(" *     * ");
				break;
		}
	}
	
	void patternN(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" **    * ");
				break;
			case 1:
				System.out.print(" * *   * ");
				break;
			case 2:
				System.out.print(" *  *  * ");
				break;
			case 3:
				System.out.print(" *   * * ");
				break;
			case 4:
				System.out.print(" *    ** ");
				break;
		}
	}
	
	void patternO(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" *     * ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternP(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" ******* ");
				break;
			case 3:
				System.out.print(" *       ");
				break;
			case 4:
				System.out.print(" *       ");
				break;
		}
	}
	
	void patternQ(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" *   * * ");
				break;
			case 3:
				System.out.print(" *    ** ");
				break;
			case 4:
				System.out.print(" ***** * ");
				break;
		}
	}
	
	void patternR(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" ******* ");
				break;
			case 3:
				System.out.print(" *    *  ");
				break;
			case 4:
				System.out.print(" *     * ");
				break;
		}
	}
	
	void patternS(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print(" *       ");
				break;
			case 2:
				System.out.print(" ******* ");
				break;
			case 3:
				System.out.print("       * ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patternT(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print("    *    ");
				break;
			case 2:
				System.out.print("    *    ");
				break;
			case 3:
				System.out.print("    *    ");
				break;
			case 4:
				System.out.print("    *    ");
				break;
		}
	}
	
	void patternU(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *     * ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" *     * ");
				break;
			case 3:
				System.out.print(" *     * ");
				break;
			case 4:
				System.out.print("  *****  ");
				break;
		}
	}
	
	void patternV(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *     * ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print("  *   *  ");
				break;
			case 3:
				System.out.print("   * *   ");
				break;
			case 4:
				System.out.print("    *    ");
				break;
		}
	}
	
	void patternW(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *     * ");
				break;
			case 1:
				System.out.print(" *     * ");
				break;
			case 2:
				System.out.print(" *  *  * ");
				break;
			case 3:
				System.out.print(" * * * * ");
				break;
			case 4:
				System.out.print(" **   ** ");
				break;
		}
	}
	
	void patternX(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *     * ");
				break;
			case 1:
				System.out.print("  *   *  ");
				break;
			case 2:
				System.out.print("    *    ");
				break;
			case 3:
				System.out.print("  *   *  ");
				break;
			case 4:
				System.out.print(" *     * ");
				break;
		}
	}
	
	void patternY(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" *     * ");
				break;
			case 1:
				System.out.print("  *   *  ");
				break;
			case 2:
				System.out.print("    *    ");
				break;
			case 3:
				System.out.print("    *    ");
				break;
			case 4:
				System.out.print("    *    ");
				break;
		}
	}
	
	void patternZ(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print(" ******* ");
				break;
			case 1:
				System.out.print("      *  ");
				break;
			case 2:
				System.out.print("    *    ");
				break;
			case 3:
				System.out.print("  *      ");
				break;
			case 4:
				System.out.print(" ******* ");
				break;
		}
	}
	
	void patterSpace(int i)
	{
		switch(i)
		{
			case 0:
				System.out.print("       ");
				break;
			case 1:
				System.out.print("       ");
				break;
			case 2:
				System.out.print("       ");
				break;
			case 3:
				System.out.print("       ");
				break;
			case 4:
				System.out.print("       ");
				break;
		}
	}
}