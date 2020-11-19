package map;

import java.util.HashMap;
import java.util.Map;
/*
 * MAP 集合的基本功能
 *   V put(K key,V value) 添加元素
 *   V remove(Object key) 根据键删除键值对元素
 *   void clear() 移除所有的键值对元素
 *   boolean containsKey(Object key) 判断集合是否包含指定的键
 *   boolean containsValue(Object value) 判断集合是否包含指定的值
 *   boolean isEmpty() 判断集合是否为空
 *   int size() 集合的长度，也就是集合中键值对的个数
 * */
public class JAVA_MAP02 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();

        //V put(K key,V value)添加元素
        System.out.println(map.put("小顾","顾风"));//返回值为String类型
        map.put("小乐","李乐");
        map.put("小王","王一");

        //v remove(K key,V value) 根据键删除键值对元素
        System.out.println(map.remove("小乐"));//返回值为String类型（有此类型的值返回删除的对应键值的元素）
        System.out.println(map.remove("汪汪"));//（无此类型的键值返回null）

        //void clear() 移除所有的键值对元素
        map.clear();

        //boolean containsKey(Object key) 判断集合是否包含指定的键
        System.out.println(map.containsKey("小顾")); //包含输出true，不包含输出false

        //boolean containsValue(Object value) 判断集合是否包含指定的值
        System.out.println(map.containsValue("顾风"));//包含输出true，不包含输出false

        //boolean isEmpty() 判断集合是否为空
        System.out.println(map.isEmpty());//空为true，不是空为false

        //int size()
        System.out.println(map.size());//输出个数

        //输出集合对象
        System.out.println(map);

    }
}
