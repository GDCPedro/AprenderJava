import java.util.*;

public class MapDemo {
  public static void main(String[] args) {
    Map<Object, Object> m1 = new HashMap<Object, Object>();

    m1.put("Zara", 8);
    m1.put("Clara", 818);
    m1.put("Alan", 9);
    m1.put("Mike", 919);

    System.out.println();
    System.out.println("Map Elements");
    System.out.println("\t" + m1);

    /**
     * boolean containsKey(Object k) 如果此映射包含指定键的映射关系，则返回true
     */

    System.out.println(m1.containsKey("Alan"));
    System.out.println(m1.containsKey("Gdc"));

    /**
     * boolean containsValue(Object v) 如果此映射将一个或多个键映射到指定值，则返回true
     */
    System.out.println(m1.containsValue(919));
    System.out.println(m1.containsValue(918));

    /**
     * Set entrySet() 返回此映射中包含的映射关系的 Set 视图。
     */
    System.out.println(m1.entrySet());

    /**
     * Object remove(Obeject k) 如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
     */
    try {
      m1.remove("Gdc");
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
    }
    System.out.println(m1.remove("Alan"));
    System.out.println("\t" + m1);

    m1.clear();

    System.out.println("\t" + m1);
  }
}