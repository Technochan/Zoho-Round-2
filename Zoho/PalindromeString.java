package Zohoexc;

public class PalindromeString {
	class Solution {
	    int isPalindrome(String S) {
	         int start = 0 ; 
	        int end = S.length() -1;
	   
	        while(start < end){
	            char ch1 = S.charAt(start);
	            char ch2 = S.charAt(end);
	            
	            if(ch1==ch2){
	                start++ ;
	                end-- ;
	            }else{
	                return 0 ;
	            }
	        }
	        return 1;
	    }
	};

}
