package main.java.lc.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(result, root);
        return result;
    }

    private void preorder(List<Integer> result, TreeNode treeNode) {
        if (treeNode == null) return;
        result.add(treeNode.val);
        preorder(result, treeNode.left);
        preorder(result, treeNode.right);
    }

}
