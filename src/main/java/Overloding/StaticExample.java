package Overloding;

public class StaticExample {
    static int a = 10;//this is static method
    int b = 20;//this is non ststic method

    static void m1() {

        System.out.println("this is m1-is static method");
    }

    void m2() {
        System.out.println("this is m2-is non static method");


    }

    void m3() {
        System.out.println("this is m3 method non  static method");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String args[]) {

        System.out.println(StaticExample.a);
        StaticExample.m1();
        // static method  access only static veriables &methods(not non static variables){
// ststic method can also access non static methods through objec
        StaticExample se = new StaticExample();
        System.out.println(se.b);//this is non static method
        se.m2();
        se.m3();
    }
}
