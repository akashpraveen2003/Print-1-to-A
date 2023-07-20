package print_1_to_N;

import java.util.Scanner;
/*
	 You are given an integer A, print 1 to A using using recursion.
	
	Note :- After printing all the numbers from 1 to A, print a new line.
	
	Input 1:
	A = 10
	
	Input 2:
	A = 5
	
	Output 1:
	1 2 3 4 5 6 7 8 9 10
	
	Output 2:
	1 2 3 4 5
 */
public class Print_1_to_N {
	
	private static void print(int i) {
		if(n==1)
		{
			System.out.print(n+" ");
			return ;
		}
		print(n-1);
		System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		print(n);
	}
}
