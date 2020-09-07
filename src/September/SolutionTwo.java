package September;

/**
 * @author: 王其浩
 * @ClassName: SolutionTwo
 * @Description:
 * @Date 2020/9/7
 * @version:
 */
public class SolutionTwo {

    public TreeNode maxNode(TreeNode root) {
        // write your code here
        TreeNode l;
        TreeNode r;
        if(root == null){
            return null;
        }

        l = maxNode(root.left);
        r = maxNode(root.right);

        if(l != null) {
            //如果根节点的值小于左子树的根节点的值，就交换
            if(root.val < l.val) {
                root = l;
            }
        }
        if(r != null) {
            //如果根节点的值小于左子树的根节点的值，就交换
            if(root.val < r.val) {
                root = r;
            }
        }
        return root;
    }
}
