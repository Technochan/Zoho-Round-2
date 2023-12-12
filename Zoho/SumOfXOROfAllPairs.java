package Zoho;

public class SumOfXOROfAllPairs {
	class Solution{
	    public long sumXOR (int arr[], int n) {
	        long result = 0;
	        
	        for (int i = 0; i < 32; i++) {
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if ((arr[j] & (1 << i)) != 0) {
	                    count++;
	                }
	            }
	            result += (1 << i) * count * (n - count);
	        }
	        return result;
	    }
	}

}
