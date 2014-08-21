package com.suanfa.paixu;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 1,54,6,3,78,34,12,45,56,100};
		a = bubbleSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static int[] bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}
