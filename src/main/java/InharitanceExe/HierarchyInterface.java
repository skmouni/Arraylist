package InharitanceExe;
class  perent{
    int a;
    void disply(){
        System.out.println(a);
    }
     static class child1 {

         public int y;
         int x;

        void show() {
            System.out.println(x);
        }

         public void display() {
         }

         class child2 {
            int y;

            void print() {
                System.out.println(y);

            }
        }
    }
}

public class HierarchyInterface {
    public static <childc1> void main(String[] args){

        perent.child1 c1=new perent.child1();
                c1.y=100;
                c1.x=200;
                c1.show();
                c1.display();


        
    }
}
