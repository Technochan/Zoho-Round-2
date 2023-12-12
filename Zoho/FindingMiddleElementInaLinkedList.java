package Zohoexc;

public class FindingMiddleElementInaLinkedList {
	class Solution
	{
	    int getMiddle(Node head)
	    {
	        ArrayList<Integer> arr = new ArrayList<>();
	        
	        Node temp = head;
	        int cnt = 0;
	        while(temp !=null){
	            cnt++;
	            arr.add(temp.data);
	            temp = temp.next;
	        }
	        cnt = (cnt%2==0) ? ++cnt : cnt;
	        return arr.get(cnt/2);
	    }
	}


}
