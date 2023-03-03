// Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
// Note: If array size is even, take first mid as root.
// Input format:
// The first line of input contains an integer, which denotes the value of n. The following line contains n space separated integers, that denote the values of array.
// Output Format:
// The first and only line of output contains values of BST nodes, printed in pre order traversal.
// Constraints:
// Time Limit: 1 second
// Sample Input 1:
// 7
// 1 2 3 4 5 6 7
// Sample Output 1:
// 4 2 1 3 6 5 7 

public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			if(n==0){
				return null;
			}
			BinaryTreeNode<Integer> root = SortedArrayToBST2(arr, n,0,n-1);
			return root;
		}
		public static BinaryTreeNode<Integer> SortedArrayToBST2(int[]arr,int n , int start,int end){
          
		   if(n==0){
			   return null;
		   }
		   if(n==1){
			   BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[start]);
			   return root;
		   }

		   else{
			   
			   int mid = (start+end)/2;
			  
			    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
				root.left = SortedArrayToBST2(arr, (end-start)/2,start,mid-1);
				
				root.right = SortedArrayToBST2(arr,end-mid,mid+1,end);
				return root;


		   }
		}
	}
