//For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		int count = 0;
		while(head!=null){
			
			if(count==i){
				System.out.print(head.data);

			}head = head.next;
			count++;
		}
	}
}
