class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int s = 0;
        if (root.val % 2 == 0 && root.left != null) {
            if (root.left.left != null) {
                s += root.left.left.val;
            }
            if (root.left.right != null) {
                s += root.left.right.val;
            }
        }
        if (root.val % 2 == 0 && root.right != null) {
            if (root.right.left != null) {
                s += root.right.left.val;
            }
            if (root.right.right != null) {
                s += root.right.right.val;
            }
        }
        return s + dfs(root.left) + dfs(root.right);
    }
}
