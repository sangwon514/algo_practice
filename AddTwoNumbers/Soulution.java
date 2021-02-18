package AddTwoNumbers;

public class Soulution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int cal = 0;
        ListNode sumlist = new ListNode(0);
        ListNode sumlisthead = sumlist;
        ListNode prevlist = null;
        while(l1 != null || l2 != null) {
        	
        	if(l1 != null && l2 == null) {
        		sum = sumlist.val + l1.val ;
        	}else if(l1 == null && l2 != null) {
        		sum = sumlist.val + l2.val;
        	}else {
        		sum = l1.val + l2.val + sumlist.val;
        	}
        	
        	if(sum<10) {
        		sumlist.val=sum;
        		cal = 0;
        	}else {
        		sumlist.val = sum%10;
        		cal = 1;
        	}
        	if(l1 != null) {
        	l1 = l1.next;
        	}
        	if(l2 != null) {
        	l2 = l2.next;
        	}
        	sumlist.next = new ListNode(cal);
        	prevlist = sumlist;
        	sumlist = sumlist.next;
        }
        if(sumlist.val == 0) {
        	prevlist.next = null;
        }
        
        return sumlisthead;
    }
}
