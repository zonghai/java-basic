/**
 * 
 */
package cn.java.basics.algorithm.sort;

/**
 * @author thinkpad
 * 冒泡排序 （交换排序的一种）
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arrays = {10,9,8,7,6};
		BubbleSort b = new BubbleSort();
		b.bubbleSort(arrays);
		for(int i:arrays)
			System.out.println(i);
	}

	public void bubbleSort(int[] arrays){
		for(int i =0 ;i < arrays.length; i++){
			for(int j = i ; j < arrays.length ; j++){
				if(arrays[i] > arrays[j]){
					int temp = arrays[i];
					arrays[i] = arrays[j];
					arrays[j] = temp; 
				}
				for(int ii:arrays)
					System.out.print(ii + " ");
				System.out.println();
			}
		}
	}
}
