class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int val) { 
        data = val; 
        }
}
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> node = new ArrayList<>();
        if (root == null) return node;
        node.addAll(postorderTraversal(root.left));                    
        node.addAll(postorderTraversal(root.right));
        node.add(root.data);  
        return node;
    }
}
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution sol = new Solution();
        System.out.println(sol.postorderTraversal(root));
    }
}