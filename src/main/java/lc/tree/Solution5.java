package main.java.lc.tree;

public class Solution5 {

    public static void main() {

    }

    public static int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }


    private static int maxDepth(TreeNode node, int depth) {
        if (node == null) return depth;
        System.out.println("========================");
        System.out.println("visit node=" + node.val + ", depth=" + depth);
        int left = maxDepth(node.left, depth + 1);
        int right = maxDepth(node.right, depth + 1);
        System.out.println("[node=" + node.val + ", depth=" + depth + "] left depth : " + left);
        System.out.println("[node=" + node.val + ", depth=" + depth + "] right depth : " + right);
        return Math.max(left, right);
    }

}
