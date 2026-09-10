class Solution {
    int mx = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return mx;
    }

    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[] { 0, 0 };
        }
        int[] a = dfs(root.left);
        int[] b = dfs(root.right);
        if ((root.val + a[0] + b[0]) / (1 + a[1] + b[1]) == root.val) {
            mx++;
        }
        return new int[] { root.val + a[0] + b[0], 1 + a[1] + b[1] };
    }
}
