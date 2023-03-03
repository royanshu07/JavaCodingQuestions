// Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
// Note: Duplicate elements should be kept in the right subtree.
// Input format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format :
// The first and only line of output contains either true or false.
// Constraints :
// Time Limit: 1 second
// Sample Input 1 :
// 3 1 5 -1 2 -1 -1 -1 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
// Sample Output 2 :
// false


//1stApproach
public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if (root == null) {
			return true;
		}
		int LeftMax = maximum(root.left);
		int RightMin = minimum(root.right);

		if (root.data <= LeftMax) {
			return false;
		}
		if (root.data > RightMin) {
			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);

		if (isLeftBST && isRightBST) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}

}





//2nd Approach
import java.util.*;
class result{
	int min;
	int max;
	Boolean bl;

	public  result (int max,int min,Boolean bl){
		this.min=min;
		this.max= max;
		this.bl = bl;
	}
}

public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
      
	   result ans = isBST2(root);
	   return ans.bl;
	  }

	public static result isBST2(BinaryTreeNode<Integer> root) {
	    result rootans = new result(Integer.MIN_VALUE,Integer.MAX_VALUE,false);
	   	if(root==null){
            rootans.bl = true;
			return rootans;
		}
		result left = isBST2(root.left);
		result right = isBST2(root.right);
		int max = Math.max(left.max,right.max);
		rootans.max= Math.max(max,root.data);
		int min = Math.min(left.min,right.min);
		rootans.min= Math.min(min,root.data);
		if(root.data>left.max && root.data<right.min){
			if(right.bl&&left.bl){
				rootans.bl = true;
				return rootans;
			}
			
			
		}
		return rootans;
		
      
	}}


//Approach 3
Check limit
