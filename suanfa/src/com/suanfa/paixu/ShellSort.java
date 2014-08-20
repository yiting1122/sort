package com.suanfa.paixu;

public class ShellSort {

	public static void main(String[] args) {
		int a[] = { 1,54,6,3,78,34,12,45,56,100};
		a = shellSort(a, a.length);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static int[] shellSort(int[] a, int d) {
		while (d > 1) {
			d = (int) Math.ceil(d / 2);
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i= i+ d) {
					int temp = a[i];
					int j = i - d;
					for (; j>= 0 && temp < a[j]; j = j - d) {
						a[j+d] = a[j];
					}
					a[j + d] = temp;
				}
			}		
			
		}
		return a;
	}

}
