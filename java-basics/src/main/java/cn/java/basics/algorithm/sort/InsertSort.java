/**
 * 
 */
package cn.java.basics.algorithm.sort;

/**
 * @author thinkpad
 *
 *         插入排序算法 基本思想: 将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
 *         即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入， 直至整个序列有序为止。
 *
 *         要点：设立哨兵，作为临时存储和判断数组边界之用
 *         效率：时间复杂度：O（n^2）
 *        插入排序还有  二分(折半)插入排序  2-路插入排序
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arrays = { 5, 9, 8, 4, 7, 6 };
		InsertSort insert = new InsertSort();
		insert.insertSort(arrays);
		for (int i : arrays)
			System.out.print(i +" ");
	}
	//直接插入排序算法
	public void insertSort(int arrays[]) {
		if (arrays == null || arrays.length < 2) {
			return;
		}
		//把数组分成两部分的数组 进行操作
		//把数组的第一个值当成 子数组 然后 对后面的 子数组的值与 第一个子数组中的值进行比较。
		
		int length = arrays.length;
		//i=1 执行循环之后 第一个子数组的第一个值是最小的了 
		//i=2时 找到整个数组中第二小的数据。然后 current的值永远都是子数据最大的值
		for (int i = 1; i < length; i++) {
			int current = arrays[i];
			int position = i;
			int j = i - 1;
			for (; j >= 0; j--) {
				if (arrays[j] > current) {
					arrays[j + 1] = arrays[j];
					position -= 1;
				}
			}
			arrays[position] = current;
			
			for (int ii : arrays)
				System.out.print(ii+" ");
			System.out.println();
		}
		
	}
}