class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return sum * 2 + root.val;
        }
        return dfs(root.left, sum * 2 + root.val) +
                dfs(root.right, sum * 2 + root.val);
    }
}
