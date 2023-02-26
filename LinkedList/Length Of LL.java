For a given singly linked list of integers, find and return its length. Do it using an iterative method


public class Solution {

	public static int length(LinkedListNode<Integer> head){
		int count=0;
		LinkedListNode <Integer> temp  = head;
		temp = head;
		while(temp!=null){
			count++;
			temp = temp.next;
		}return count;
	}
}
