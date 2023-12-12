//Given two arrays a[] and b[] of size n and m respectively. 
//The task is to find the number of elements in the union between these two arrays.
//
//Union of the two arrays can be defined as the set containing
//distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
//
//Note : Elements are not necessarily distinct.
//
//Example 1:
//
//Input:
//5 3
//1 2 3 4 5
//1 2 3
//Output: 
//5
//Explanation: 
//1, 2, 3, 4 and 5 are the
//elements which comes in the union set
//of both arrays. So count is 5.

package Zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class UnionoftwoArrays {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,1,3};
		int n = a.length;
		int m = b.length;
		int res = verify(a,b,n,m);
		System.out.println(res);
	}
	public static int verify(int a[],int b[],int n,int m)
	{
		 List<Integer> unionList = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            if (!unionList.contains(a[i])) {
	                unionList.add(a[i]);
	            }
	        }
	        for (int i = 0; i < m; i++) {
	            if (!unionList.contains(b[i])) {
	                unionList.add(b[i]);
	            }
	        }
		return unionList.size();
		
		///OR./// For time complexity.....
		
		 Set<Integer> unionSet = new HashSet<>();
	     List<Integer> unionList = new ArrayList<>();
	     for (int i = 0; i < n; i++) {
	        unionSet.add(a[i]);
	     }
	     for (int i = 0; i < m; i++) {
	        unionSet.add(b[i]);
	     }
	     unionList.addAll(unionSet);
	     return unionList.size();
	}

}
