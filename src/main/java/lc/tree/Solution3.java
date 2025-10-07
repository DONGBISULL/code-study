package main.java.lc.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(result, root);
        return result;
    }

    private void postorder(List<Integer> result, TreeNode root) {
        if (root == null) return;
        postorder(result, root.left);
        postorder(result, root.right);
        result.add(root.val);
    }

}
