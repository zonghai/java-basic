/**
 * 
 */
package cn.java.basics.algorithm.sort;

/**
 * @author thinkpad
 * 
 *         快速排序。（交换排序的一种 共两种 ：快速排序和冒泡排序）
 */
public class QuickSort {

	public static void main(String[] args) {
			QuickSort q = new QuickSort();
			int[] arrays ={10,9,8,7,6,5};
			q.quickSort(arrays, 0, arrays.length -1 );
	}

	public void quickSort(int[] arrays, int start, int end) {
		if (start >= end) {
			return;
		}

		int i = start;
		int j = end;
		int value = arrays[i];
		boolean flag = true;
		while (i != j) {
			if (flag) {
				if (value > arrays[j]) {
					System.out.println("从头开始的打印--  " + i +" " + j);
					swap(arrays, i, j);
					snp(arrays);
					flag = false;
				} else {
					j--;
				}
			} else {
				if (value < arrays[i]) {
					System.out.println("从头开始的打印  " + i +" " + j);
					swap(arrays, i, j);
					snp(arrays);
					flag = true;
				} else {
					i++;
				}
			}
		}
		snp(arrays);
		quickSort(arrays, start, j - 1);
		quickSort(arrays, i + 1, end);
	}

	public void snp(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
	}

	private void swap(int[] arrays, int i, int j) {
		int temp;
		temp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = temp;
	}

}
