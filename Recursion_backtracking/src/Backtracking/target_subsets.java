package Backtracking;

import java.util.Scanner;

public class target_subsets {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int[5];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int tar=s.nextInt();
		String set="";
		printTargetSumSubsets( arr, 0,  set, 0,tar);       //sos=sum so far

	}

  public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
	  if(idx==arr.length) {
		  
		  if(sos==tar) {
			  System.out.println(set);
		  }
		  return;
	  }
	  
	  
	  printTargetSumSubsets(arr, idx+1, set + arr[idx]+ ", ", sos+arr[idx], tar); //do option hai ya to set mai aaye ya set mai na aaaye.naya recursion naye level se start hoga.
	  printTargetSumSubsets(arr, idx+1, set, sos, tar);
	  
	  
	  
        
    }
}
