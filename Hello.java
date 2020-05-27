/* 
 * Java类的继承是单继承, 只能继承一个类
 * 使用implements关键字可以变相的使Java具有多继承的特性
 * 类可以继承接口
 * 使用super关键字来实现对父类成员的引用，引用当前对象的父类
*/
public class Hello extends World {
  public static void main(String[] args) {
    // int ten = 10;
    // int twenty = 20;
    // int thirty = 30;
    // int[] numbers = { 1, 2, 3, 4, 5 };

    Integer fourty = 40;

    /*
     * while (ten < 20) { System.out.println(ten); ten++; System.out.println("\n");
     * }
     */

    /*
     * do { System.out.println(twenty); twenty++; System.out.println("\n"); } while
     * (twenty < 30);
     */

    /*
     * for (int i = 0; i < thirty; i++) { System.out.println(i);
     * System.out.println("\n"); }
     */

    /*
     * for (int x : numbers) { System.out.println(x); System.out.println(","); }
     */

    System.out.println(fourty.toString());

    World world = new World();

    world.sayHelloWorld();

    Country country = new Country();

    country.helloTest();
  }

}

class Country extends World {
  void sayHelloWorld() {
    System.out.println("hello wolrd，from child");
    // super.sayHelloWorld();
    ;
  }

  void helloTest() {
    this.sayHelloWorld();
    super.sayHelloWorld();
  }
}

class World {
  void sayHelloWorld() {
    System.out.println("hello wolrd，from parent");
  }
}
