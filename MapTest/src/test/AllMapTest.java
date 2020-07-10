package test;

import java.util.HashMap;
import java.util.Map;

public class AllMapTest {
    /**
     * Map:双列数据，存储key-value的数据  ---类似于高中的函数y=f(x)
     *   HashMap:作为Map的主要实现类；线程不安全，效率高；可以存储null的key和value
     *      LinkedHash:保证在遍历map元素时，可以按照添加的元素顺序实现遍历。
     *          原因:在原有的HashMap底层结构基础上，添加一对指针，指向前一个和后一个元素。
     *          对于频繁的遍历操作，此类执行的效率高于HashMap。
     *      TreeMap:保证按照添加的key-value进行排序，实现排序遍历。按照key进行排序，可以自然排序和定制排序。
     *              底层使用红黑树
     *      HashTable:作为古老的实现类；线程安全，效率低；不能存储null的key和value
     *      Properties:常用来处理配置文件。key和value都是String类型
     *
     *
     * Map结构理解：
     *      Map中的key：无序的、不可重复的，使用Set存储所有的key    自己写的类作为HahMap的key要重写对应类的equals()和hashCode()方法（以HashMap为例）
     *      Map中的value：无序的、可重复的，使用Collection存储所有的value
     *      一个键值对：key-value构成了一个Entry对象。
     *      Map中的entry：无序的、不可重复的，使用Set存储所有的entry。
     *
     * @param args
     */
    public static void main(String[] args) {
        Map map = new HashMap<String,Object>();
        Map map1 = new HashMap();

        map1.put("name","zhangsan");
        map1.put("age",23);
        map1.put("name","lisi");
        map1.put("age",22);
        map1.put("name","wangwu");
        map1.put("age",25);
        System.out.println(map1);
    }
}
