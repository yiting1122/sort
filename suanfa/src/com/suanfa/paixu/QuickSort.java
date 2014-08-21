package com.suanfa.paixu;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 1,54,6,3,78,34,12,45,56,100};
		quickSort(a,0,a.length-1);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static int getMiddle(int[] a,int start,int end) {
		int temp=a[start];
		while(start<end){
			while(end>start&&a[end]>=temp){
				end--;
			}
			a[start]=a[end];
			while(start<end&&a[start]<=temp){
				start++;
			}
			a[end]=a[start];
		}
		a[start]=temp;
		return start;
	}
	
	
	public static void quickSort(int[] a,int start,int end){
		if(start<end){
			int middle=getMiddle(a, start, end);
			quickSort(a, start, middle-1);
			quickSort(a, middle+1, end);
		}
		
	}
	

}
