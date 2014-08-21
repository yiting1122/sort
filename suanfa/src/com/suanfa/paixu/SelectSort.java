package com.suanfa.paixu;

public class SelectSort {

	public static void main(String[] args) {
		int a[] = { 1, 54, 6, 3, 78, 34, 12, 45, 56, 100 };
		a = selectSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static int[] selectSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int pos = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < temp) {
					temp = a[j];
					pos = j;
				}
			}
			a[pos] = a[i];
			a[i] = temp;

		}
		return a;
	}

}
