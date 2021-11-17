import java.awt.*;
import java.util.ArrayList;

/**
 * Project name(项目名称)：算法_二叉搜索树的查找
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 21:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@SuppressWarnings("all")
public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        if (args.length == 0)
        {
            BSTree tree = new BSTree();
            ArrayList<Integer> tmp = new ArrayList<>();
            tree.insert(1);
            tmp.add(1);
            tree.insert(5);
            tree.insert(4);
            tree.insert(3);
            tree.insert(2);
            tree.insert(6);
            tmp.add(5);
            tmp.add(4);
            tmp.add(3);
            tmp.add(2);
            tmp.add(6);
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
        else
        {
            int pos = 1;
            try
            {
                BSTree tree = new BSTree();
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int i = 0; i < args.length; i++)
                {
                    tree.insert(Integer.parseInt(args[i]));
                    tmp.add(Integer.parseInt(args[i]));
                    pos++;
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
            catch (Exception e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("参数传递错误！！！ 请检查第" + pos + "个参数");
            }
        }
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
