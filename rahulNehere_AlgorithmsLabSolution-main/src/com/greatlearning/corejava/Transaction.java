package com.greatlearning.corejava;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array: ");
		//size = how many transaction we are taking
		int size = scan1.nextInt();
		int transactions[] = new int[size]; 
		System.out.println("Enter the values of Transaction: ");
		/*
		 * transactions[0].transactions[1]..transactions[2]..transactions[3]....transactions[size]
		 */
		for(int i=0;i<size;i++)
		{
			//we are taking the transactions
			transactions[i] = scan1.nextInt();
		}
		System.out.println("Enter the total number of targets that is to be achieved: ");
		//we are taking the targets to be achieved
		int targetNo = scan1.nextInt();  
		
		while(targetNo > 0)
		{
			int flag = 0;
			int target;
			System.out.println("Enter the value of target: ");
			target = scan1.nextInt();
			long sumOfTransactions = 0;
			
			for(int i=0;i<size;i++)
			{
				sumOfTransactions = sumOfTransactions + transactions[i];
				if(sumOfTransactions >= target)
				{
					System.out.println("Traget achieved after "+(i+1)+" transactions: ");
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println("Given target is not achieved.");
			}
			// we keep decrementing the target number until we are out of targets which user have entered
			targetNo--;
		}
		System.out.println("You have finished your target.");
	}

}
