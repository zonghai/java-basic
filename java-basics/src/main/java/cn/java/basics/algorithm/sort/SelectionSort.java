/**
 * 
 */
package cn.java.basics.algorithm.sort;

/**
 * @author thinkpad 
 * 	选择排序算法。
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arrays = { 9, 8, 7, 6, 5, 3, 4 };
		SelectionSort s = new SelectionSort();
		// 简单的排序算法
		 s.simpleSelectionSort(arrays);
	}

	/**
	 * 简单选择排序方式。
	 * 
	 * 
	 * @param arrays
	 */
	public void simpleSelectionSort(int[] arrays) {
		int length = arrays.length;
		for (int i = 0; i < length; i++) {
			int index = selectSamllIndex(arrays, i, length);
			int temp = arrays[i];
			arrays[i] = arrays[index];
			arrays[index] = temp;
			for (int ii : arrays) {
				System.out.print(ii + " ");
			}
			System.out.println();
		}
	}

	// 获取最小值的index位置。
	private int selectSamllIndex(int[] arrays, int start, int length) {
		int index = start;
		for (int i = start; i < length; i++) {
			if (arrays[index] > arrays[i]) {// 每次都与最小的index位置的数据进行比对。
				index = i;
			}
		}
		return index;
	}
}
