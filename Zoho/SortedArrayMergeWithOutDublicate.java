package Zohoexc;
import java.util.Arrays;
public class SortedArrayMergeWithOutDublicate {
	


	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 6, 9};
	        int[] array2 = {2, 4, 5, 10};

	        int[] mergedArray = mergeArrays(array1, array2);

	        System.out.println("Array1: " + Arrays.toString(array1));
	        System.out.println("Array2: " + Arrays.toString(array2));
	        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	    }

	    public static int[] mergeArrays(int[] array1, int[] array2) {
	        int[] mergedArray = new int[array1.length + array2.length];

	        int i = 0, j = 0, k = 0;

	        while (i < array1.length && j < array2.length) {
	            if (array1[i] < array2[j]) {
	                mergedArray[k++] = array1[i++];
	            } else {
	                mergedArray[k++] = array2[j++];
	            }
	        }

	        while (i < array1.length) {
	            mergedArray[k++] = array1[i++];
	        }

	        while (j < array2.length) {
	            mergedArray[k++] = array2[j++];
	        }

	        return mergedArray;
	    }
	}



