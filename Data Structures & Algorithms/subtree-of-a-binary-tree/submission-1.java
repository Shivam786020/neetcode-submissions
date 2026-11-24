class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;        // empty subtree is always a subtree
        if (root == null)    return false;       // main tree exhausted, no match
        if (sameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot)
            || isSubtree(root.right, subRoot);
    }

    private boolean sameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;          // one null, one not
        if (a.val != b.val)         return false;          // value mismatch
        return sameTree(a.left, b.left) && sameTree(a.right, b.right);
    }
}