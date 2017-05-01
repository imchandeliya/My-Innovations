/*
		TIC-TAC-TOE
		
		Platform: J2SE
		classes used: 2
		developer: Aditya Chandeliya
		
		Bugs List:
			-sometime cause error (very rare)
			-sometime can't show draw match status
			
*/

import java.util.Scanner;

class Game
{
	char Matrix[][] = new char[3][3];
	int winnerX=0;
	int winner0=0;
	int count=0;
	
	
	Scanner scan = new Scanner(System.in);
	
	
	Game()
	{
		
		System.out.println("\t\t\t  Welcome");
		System.out.println("\t\t\t  -------");
		System.out.println("\t\t\tTIC-TAC-TOE");
		System.out.println("\t\t\t-----------");
		//System.out.println("\t\t\t\t\t\t\t\tdeveloped by: Aditya Chandeliya\n\n");
		System.out.println("\n\n");
		int i;
		do
		{
			System.out.println("\t\t\tEnter 1 to Start Game...");
			System.out.println("\t\t\tEnter 2 to Exit");
			System.out.print("\t\t\tEnter your Choice:	");
			i = scan.nextInt();
			switch(i)
			{
				case 1:
					this.init();
					this.proceed(1);
					break;
				case 2:
					break;
				default:
					System.out.println("Wrong choice Entered.... try again");
					break;
			}
		}while(i != 2);
	}
	
	
	void init()
	{
		char no = '1';
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				Matrix[i][j] = no;
				no++;
			}
		}
	}
	
	
	void show()
	{
		for(int lol=0 ; lol<200 ; lol++)
		{
			System.out.println();
		}
		
		System.out.println("\t\t________________________________");
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println("\t\t\t");
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print("\t\t"+Matrix[i][j]);
			}
			System.out.println("\n\n");
		}
		System.out.println("\t\t________________________________");
	}
	
	
	int i=0;
	void proceed(int x)
	{
		String temp;
		char place;
		this.show();
		
		
	
		do
		{
			switch(x)
			{
				case 1:
					System.out.print("\n\n\n\t\tEnter place for X (Player 1):");
					temp = scan.next();
					place = temp.charAt(0);
					this.putX(place);
					
					break;
				case 2:
					System.out.print("\n\n\n\t\tEnter place for 0 (Player 2):");
					temp = scan.next();
					place = temp.charAt(0);
					this.put0(place);
					
					break;
			}
			
			this.show();
			x = this.change(x);
		}while(winner0==0 && winnerX==0 && count!=9);
		
		
		System.out.println("\n\n\t\t");
		if(winner0 == 1)
		{
			System.out.println("\t\t\tPlayer Two Won...\n\n\n");
			
			
		}
		else
		{
			if(winnerX == 1)
			{
				System.out.println("\t\t\tPlayer One Won...\n\n\n");
			}
			else
			{
				System.out.println("\t\t\tMatch Draw...\n\n\n");
			}
			
		}
		this.init();
		winnerX=0;
		winner0=0;
		count=0;
		
	}	
	
	void checkWin()
	{
		//Horizontal
		if((Matrix[0][0] == Matrix[0][1]) && (Matrix[0][1] == Matrix[0][2]) )
		{
			if(Matrix[0][0]=='X')
				winnerX = 1;
			else
				winner0 = 1;
		}
		if((Matrix[1][0] == Matrix[1][1]) && (Matrix[1][1] == Matrix[1][2]) )
		{
			if(Matrix[0][0]=='X')
				winnerX = 1;
			else
				winner0 = 1;
		}
		if((Matrix[2][0] == Matrix[2][1]) && (Matrix[2][1] == Matrix[2][2]) )
		{
			if(Matrix[0][0]=='X')
				winnerX = 1;
			else
				winner0 = 1;
		}	
			
			
			
			
		//Vertical
		if((Matrix[0][0] == Matrix[1][0]) && (Matrix[1][0] == Matrix[2][0]))
		{
			if(Matrix[0][0]=='X')
				winnerX = 1;
			else
				winner0 = 1;					
		}
		if((Matrix[0][1] == Matrix[1][1]) && (Matrix[1][1] == Matrix[2][1]))
		{
			if(Matrix[0][0]=='X')
				winnerX = 1;
			else
				winner0 = 1;					
		}	
		if((Matrix[0][2] == Matrix[1][2]) && (Matrix[1][2] == Matrix[2][2]))
		{
			if(Matrix[0][0]=='X')
				winnerX = 1;
			else
				winner0 = 1;					
		}	
			
			
			
		//crossess
		if((Matrix[0][0] == Matrix[1][1]) && (Matrix[1][1] == Matrix[2][2]))
		{
			winnerX = 1;
		}
		if((Matrix[0][2] == Matrix[1][1]) && (Matrix[1][1] == Matrix[2][0]))
		{
			winnerX = 1;
		}
		
	}
	
	void putX(char place)
	{
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				if(Matrix[i][j] == place )
				{
					Matrix[i][j] = 'X';
				}
			}
		}
		count++;
		this.checkWin();
	}
	
	void put0(int place)
	{
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				if(Matrix[i][j] == place )
				{
					Matrix[i][j] = '0';
				}
			}
		}
		count++;
		this.checkWin();
	}
	
	int change(int x)
	{
		switch(x)
		{
			case 1:
				x = 2;
				break;
			case 2:
				x = 1;
				break;
		}
		return x;
	}
		
}

class Main
{
	public static void main(String[] args)
	{
		Game obj = new Game();
	}
}