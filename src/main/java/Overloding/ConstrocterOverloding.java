package Overloding;

public class ConstrocterOverloding {

    ConstrocterOverloding(int a,int b)
    {
        System.out.println(a+b);
    }
    ConstrocterOverloding(int a,double b)
    {
        System.out.println(a+b);

    }
    ConstrocterOverloding(double a,int b)
    {
        System.out.println(a+b);

    }
    ConstrocterOverloding(int a,int b,int c)
            {
                System.out.println(a+b+c);
    }

    public static void main(String args[]){
        ConstrocterOverloding co=new ConstrocterOverloding(10,39.65);



    }
}
