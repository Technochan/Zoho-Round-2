package Zoho;

public class Kadanes_Algorithm_Maximum_sum_of_SubArray {
	class Solution{
	    long maxSubarraySum(int arr[], int n){
	        long sum = 0;
	        long max = Integer.MIN_VALUE;
	        for(int i=0 ; i<n ;i++){
	            max = Math.max(max,arr[i]);
	        }
	        for(int i=0 ; i<n ;i++){
	            if(arr[i] + sum < 0){
	                sum = 0;
	                continue;
	            }
	            else
	            {
	                sum += arr[i];
	                max = Math.max(sum,max);
	            }
	        }
	        return max;
	    }
	    
	}

}
