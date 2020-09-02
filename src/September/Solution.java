package September;

import java.util.ArrayList;

/**
 * @Author wangqh
 * @Create 2020/9/2
 * @Version 1.0
 */



public class Solution {

    public String serialize(TreeNode root) {
        // write your code here
        if (root == null) {
            return "{}";
        }

        /* 利用for循环将树中结点全部添加到队列里面，利用队列来控制序列化顺序
         * queue不是一个队列，是一个数组只是名字是queue
         */
        ArrayList<TreeNode> queue = new ArrayList<>();

        queue.add(root);
        for (int i = 0; i < queue.size(); i++) {
            // queue是动态数组用get()方法来得到下标对应的数值
            TreeNode node = queue.get(i);

            // 空结点跳过不执行叶子结点添加的操作
            if (node == null) {
                continue;
            }
            // 无需理会叶子结点是不是空，把当前非空结点的叶子结点添加到了队列中
            queue.add(node.left);
            queue.add(node.right);
        }

        // 去掉队列结尾的空结点
        while (queue.get(queue.size() - 1) == null) {
            queue.remove(queue.size() - 1);
        }

        // 根据队列往动态数组里添加相应的值
        // StringBuilder对象是动态对象，允许扩充它所封装的字符串中字符的数量
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(queue.get(0).val);
        // 在for循环前已经将初值加入sb中,所以 i 初值应设为1
        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i) == null) {
                sb.append(",#");
            }
            else {
                sb.append(",");
                sb.append(queue.get(i).val);
            }
        }
        sb.append("}");
        return sb.toString();
    }



    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        // 字符用equals,数值用==
        if (data.equals("{}")) {
            return null;
        }

        // 此处需注意用点截取data的区间
        // 字符串长度用length()
        String[] vals = data.substring(1, data.length() - 1).split(",");
        ArrayList<TreeNode> queue = new ArrayList<>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        /* 新建一节点，节点值为vals[0]
         * Integer.parseInt()将字符串转化为整型
         */

        queue.add(root);
        boolean isLeftChild = true;
        // index是queue的索引
        int index = 0;
        // i 是vals的索引
        for (int i = 1; i < vals.length; i++) {
            // 数组长度用length
            // 此处同样要注意先判断是不是空结点再讨论结点的子结点
            if (!vals[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if (isLeftChild) {
                    // 注意此处index=0，i=1
                    queue.get(index).left = node;
                }
                else {
                    queue.get(index).right = node;
                }
                queue.add(node);
                /* '#'所的代表的空指针不要加入queue,没有任何意义，
                 * 此时for循环遍历的是index，即node的父节点，
                 * for循环接下来还要遍历node来确定node的子节点
                 * 此处不能忘记将node加入queue
                 */
            }
            if (!isLeftChild) {
                index++;
                /* isLeftChild=false时说明此时index对应的结点的右儿子已经添加到队列中了，
                 * 应将index往后移一位
                 */
            }
            // i 每变化一次 isLeftChild 进行一次变化
            isLeftChild = !isLeftChild;
        }

        return root;
    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
