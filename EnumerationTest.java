import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTest {
  public static void main(String[] args) {
    Enumeration<String> days;
    Vector<String> dayNames = new Vector<String>();

    dayNames.add("Sunday");
    dayNames.add("Monday");
    dayNames.add("Tuesday");
    dayNames.add("Wednesday");
    dayNames.add("Thursday");
    dayNames.add("Friday");
    dayNames.add("Saturday");

    days = dayNames.elements();

    System.out.println(dayNames.capacity());
    System.out.println(dayNames.contains("o"));
    System.out.println(dayNames.elementAt(2));

    /**
     * boolean hasMoreElements() 测试此枚举是否包含更多的元素 Object nextElement()
     * 如果此枚举对象至少还有一个元素，则返回此枚举的下一个元素
     * 
     */
    while (days.hasMoreElements()) {
      System.out.println(days.nextElement());
    }
  }
}