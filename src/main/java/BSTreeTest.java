import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project name(项目名称)：算法_二叉搜索树的查找
 * Package(包名): PACKAGE_NAME
 * Class(类名): BSTreeTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 21:11
 * Version(版本): 1.0
 * Description(描述)：
 * 测试输入：1 5 4 3 2 6
 * 预期输出
 * 删除前树中的结点：1 5 4 3 2 6
 * 删除后树中的结点：5 4 3 2
 * false true true true true false
 */

public class BSTreeTest
{
    public static void main(String[] args)
    {
        BSTree tree = new BSTree();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> tmp = new ArrayList<>();
        while (in.hasNext())
        {
            int item = in.nextInt();
            tree.insert(item);
            tmp.add(item);
        }
        System.out.print("删除前树中的结点：");
        tree.preOrder();
        System.out.println();
        tree.delete(tmp.get(0));
        tree.delete(tmp.get(tmp.size() - 1));
        System.out.print("删除后树中的结点：");
        tree.preOrder();
        System.out.println();
        for (Integer key : tmp)
        {
            System.out.print(tree.search(key) + " ");
        }
    }
}
