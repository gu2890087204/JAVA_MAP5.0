package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
* Map 集合的获取功能
*   V get(Object key) 根据键获取值
*   Set<K> ketSet() 获取所有键的集合
*   Collection<V> values() 获取所有值的集合
*
* */
public class JAVA_MAP03 {
    public static void main(String[] ages){
        //创建集合对象
        Map<Integer, String> map=new HashMap<Integer, String>();

        //添加元素
        map.put(1,"小李");
        map.put(2,"小张");
        map.put(3,"小顾");

        //V get(Object key) 根据键获取值
        System.out.println(map.get(1));
        System.out.println(map.get(4));//如果没没有该键值，则输出null

        System.out.println("-".repeat(20));

        //Set<K> ketSet() 获取所有键的集合
        Set<Integer> keySet=map.keySet();
        for (Integer key : keySet){
            System.out.println(key);
        }


        System.out.println("-".repeat(20));

        //Collection<V> values() 获取所有值的集合
        Collection<String> values= map.values();
        for (String value: values) {
            System.out.println(value);
        }

    }
}
