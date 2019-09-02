
public class MaximumDepthOfBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		return longestPath(root);
	}

	public int longestPath(TreeNode root) {
		int left = 1;
		int right = 1;
		if (root == null) {
			return 0;
		}
		if (root != null) {

			if (root.left != null) {
				left = longestPath(root.left) + 1;
			}

			if (root.right != null) {
				right = longestPath(root.right) + 1;
			}
		}

		return Math.max(left, right);
	}
}
