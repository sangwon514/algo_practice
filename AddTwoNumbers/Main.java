package AddTwoNumbers;


//주어진 두개의 리스트 노드를 거꾸로 읽어서 더한뒤 출력
public class Main {
	public static void main(String[] args) {
		Soulution s = new Soulution();
		int[] list1 = {1};
		int[] list2 = {9,9,9,9,9};
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode l1head = l1;
		ListNode l2head = l2;
		l1.val=list1[0];
		l2.val=list2[0];
		if(list1.length>1) {
		for(int i=1;i<list1.length;i++) {
			l1.next = new ListNode(list1[i]);
			l1=l1.next;
		}
		}
		for(int i=1;i<list2.length;i++) {
			l2.next = new ListNode(list2[i]);
			l2=l2.next;
		}
		
		ListNode sumnode = s.addTwoNumbers(l1head, l2head);
		System.out.print("[");
		for(;sumnode != null; sumnode = sumnode.next) {
			System.out.print(sumnode.val);
			if(sumnode.next != null) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
