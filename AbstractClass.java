public class AbstractClass {
  public static void main(String[] args) {
    Salary e = new Salary("gdc", "龙湖西苑", 110);

    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();
  }
}

class Salary extends Employee {
  public Salary(String name, String address, int number) {
    super(name, address, number);
  }
}

abstract class Employee {
  // Employee
  private String name;
  private String address;
  private int number;

  // 构造函数
  public Employee(String name, String address, int number) {
    System.out.println("Constructing an Employee");
    this.name = name;
    this.address = address;
    this.number = number;
  }

  public double computePay() {
    System.out.println("Inside Employee computePay");
    return 99.99;
  }

  public void mailCheck() {
    System.out.println("Mailing a check to " + this.name + " " + this.address);
  }

  public String toString() {
    return name + " " + address + " " + number;
  }

  public String getName() {
    return name;
  }
}