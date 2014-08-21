package com.suanfa.paixu;

public class MergeSort {
	public static void main(String[] args) {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		mergeSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int middle = (end + start) / 2;
			mergeSort(a, start, middle);
			mergeSort(a, middle + 1, end);
			merge(a, start, middle, end);
		}
	}

	public static void merge(int[] a, int start, int middle, int end) {
		int center = middle + 1;
		int left = start;
		int right = end;
		int b[] = new int[a.length];
		int i = start;
		while (left <= middle && center <= right) {
			if (a[left] <= a[center]) {
				b[i++] = a[left++];
			} else {
				b[i++] = a[center++];
			}

		}
		while (left <= middle) {
			b[i++] = a[left++];
		}
		while (center <= end) {
			b[i++] = a[center++];
		}

		for (int j = start; j < i; j++) {
			a[start++] = b[j];
		}
	}

}
