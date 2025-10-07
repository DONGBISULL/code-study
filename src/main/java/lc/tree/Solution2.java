package main.java.lc.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(result , root);
        return result;
    }

    private void inorder(List<Integer> result, TreeNode treeNode) {
        if (treeNode == null) return;
        inorder(result , treeNode.left);
        result.add(treeNode.val);
        inorder(result, treeNode.right);
    }

}
