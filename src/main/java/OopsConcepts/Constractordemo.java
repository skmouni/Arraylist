package OopsConcepts;

public class Constractordemo {


  int x;
  int y;
  Constractordemo() //defolt constracter
  {
   x = 10;
   y = 20;
  }

    public Constractordemo(int a, int b) {
    }

    void display()
  {
   System.out.println(x+y);
  }
  public static void main(String args[]) {
   Constractordemo cm = new Constractordemo();//invokes defoult constractor
   cm.display();
      Constractordemo cm1=new Constractordemo();
      cm1.display();
      Constractordemo cm2=new Constractordemo(100,200);
      cm2.display();

  }
}





