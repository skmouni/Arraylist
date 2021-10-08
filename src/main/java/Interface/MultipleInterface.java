package Interface;

interface  ABC{
    int x=100;
    void m1();
}
interface  XYZ{
    int y=200;
    void m2();
}


public class MultipleInterface implements ABC,XYZ {


    public static void main(String args[]) {
    }

    public void m1() {
        System.out.println(x);
    }

    public void m2() {
        System.out.println(y);
        MultipleInterface mi=new MultipleInterface();
        mi.m1();
        mi.m2();

    }
}

