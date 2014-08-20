package com.suanfa.paixu;

public class InsertSort {

	public static void main(String[] args) {
		  int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		  a=insertSort(a);
		  for(int i:a){
			  System.out.println(i);
		  }
	}
	
	public static int[] insertSort(int[] args){
		for(int i=1;i<args.length;i++){
			int temp=args[i];
			int j=i-1;
			while(j>=0&&args[j]>temp){
				args[j+1]=args[j];
				j--;
			}
			args[++j]=temp;
		}
		
		return args;
	}

}
