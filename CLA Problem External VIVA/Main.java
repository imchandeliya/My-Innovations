/*
	This question is asked in my External viva whaen i was in Sophomore year.
	Problem Statement	:
		-there are blocks in our colleges (like a-block, b-block, f-block etc.)
		-and wo have classrooms names like f104 that mean that classroom is located in f-block 
		 and floor no 1 and room no 4.
		-so we have to give a random sequece of classrooms like - b102 m105 f203 in command line argument
		-this program will sort all the given classrooms accrding to the block- floor and classroom
		
		************ BLOCK NAMES MUST BE WRITTEN IN SMALL LETTERS **************

		example: >> java Main b102 m105 f203
		

*/
/*	Program for Natural Sorting
	Input in Command Line Argument as :b102 m105 f203
	Output as Natural Sorted form
	
	Program By: Aditya Chandeliya
*/


class Main
{
	public static void main(String[] args)
	{
		//Showing Entered Sequence in CLA
		System.out.print("Your Entered Sequence :");
		for(int i=0 ; i<args.length ; i++)
		{
			System.out.print(args[i]+", ");
		}


		//Sorting Blocks Wise
		String temp;
		for(int j=0 ; j<args.length ; j++)
		{
			for(int k=0 ; k<(args.length-j-1) ; k++)
			{
				if(args[k].charAt(0) >= args[k+1].charAt(0))
				{
					temp = args[k+1];
					args[k+1] = args[k];
					args[k] = temp;
				}
			}
		}


		//Sorting Rooms Wise
		for(int j=0 ; j<(args.length-1) ; j++)
		{
			if(args[j].charAt(0) == args[j+1].charAt(0))
			{
				int temp1 = Integer.parseInt(args[j].substring(1,4));
				int temp2 = Integer.parseInt(args[j+1].substring(1,4));
				if(temp1>temp2)
				{
					temp = args[j+1];
					args[j+1] = args[j];
					args[j] = temp;
				}
			}
		}		


		// Showing Sorted Sequence
		System.out.print("\n\nYour Sorted Sequence :");
		for(int i=0 ; i<args.length ; i++)
		{
			System.out.print(args[i]+", ");
		}
	}
}