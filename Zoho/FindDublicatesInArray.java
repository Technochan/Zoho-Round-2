package Zoho;

import java.util.*;

public class FindDublicatesInArray {
	public static void main(String[] args) 
	{
		int arr[] = {3,4,12,3,12,3,4,4,12,7,11,6,5};
		int N = arr.length;
		ArrayList a1 = new ArrayList();
		a1 = duplicates(arr,N);
		System.out.println(a1);
	}
	
	public static ArrayList<Integer> duplicates(int arr[], int n)
	{
		ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                // If the element is already in the set, it's a duplicate.
                duplicates.add(num);
            }
        }

        ArrayList<Integer> sortedDuplicates = new ArrayList<>(duplicates);
        Collections.sort(sortedDuplicates);

        if (sortedDuplicates.isEmpty()) {
            sortedDuplicates.add(-1);
        }

        return sortedDuplicates;
	        }
	

	

	
}
