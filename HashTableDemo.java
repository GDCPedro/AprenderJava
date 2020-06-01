import java.util.*;

public class HashTableDemo {
  /**
   * Hashtable类提供了一种在用户定义键结构的基础上来组织数据的手段。
   * 例如，在地址列表的哈希表中，你可以根据邮政编码作为键来存储和排序数据，而不是通过人名。 哈希表键的具体含义完全取决于哈希表的使用情景和它包含的数据。
   */
  public static void main(String[] args) {

    /**
     * Hashtable除了从Map接口定义的方法外，还定义了： void clear(); Object clone(); boolean
     * contains(Object value); boolean containsKey(Object key); boolean
     * containsValue(Object value); Enumeration elements( ) 返回此哈希表中的值的枚举。
     * Enumeration keys( ) 返回此哈希表中的键的枚举。 Object get(Object key)
     * 返回指定键所映射到的值，如果此映射不包含此键的映射，则返回 null. 更确切地讲，如果此映射包含满足 (key.equals(k)) 的从键 k 到值
     * v 的映射，则此方法返回 v；否则，返回 null。 boolean isEmpty( ) 测试此哈希表是否没有键映射到值。 void rehash( )
     * 增加此哈希表的容量并在内部对其进行重组，以便更有效地容纳和访问其元素。
     */

    // 创建一个hashmap
    Hashtable<Object, Object> balance = new Hashtable<Object, Object>();

    Enumeration<Object> names;
    Enumeration<Object> elements;
    String str;
    double bal;

    balance.put("Zara", 34.34);
    balance.put("Mahnaz", 56.56);
    balance.put("Mike", 78.78);

    // show all balance in hash table
    names = balance.keys();

    while (names.hasMoreElements()) {
      str = (String) names.nextElement();

      System.out.println(str + ": " + balance.get(str));
    }

    System.out.println();

    // Deposit 1000 into Mike`s account
    bal = ((Double) balance.get("Mike")).doubleValue();
    balance.put("Mike", bal + 1000);

    System.out.println("Mike: " + balance.get("Mike"));

    elements = balance.elements();
    while (elements.hasMoreElements()) {
      System.out.println(elements.nextElement());
    }
  }
}