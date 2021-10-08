package Overloding;

public class ThiskeyWord {

    int a,b;
    void getvalues(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void  printvalues(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]){
        ThiskeyWord th=new ThiskeyWord();
        th.getvalues(10,20);
        th.printvalues();

    }
}
