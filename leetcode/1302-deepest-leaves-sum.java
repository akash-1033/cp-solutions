class Solution {
    public int mx = 0, s = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return s;
    }

    public void dfs(TreeNode root, int h) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (h > mx) {
                mx = h;
                s = root.val;
            } else if (h == mx) {
                s += root.val;
            }
            return;
        }
        dfs(root.left, h + 1);
        dfs(root.right, h + 1);
    }
}
