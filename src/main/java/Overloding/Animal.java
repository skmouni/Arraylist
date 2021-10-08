package Overloding;

public class Animal {
    String colour = "white";

    void eating() {
        System.out.println("Eating......");
    }


    static class Dog extends Animal{
        String colour= "black";
        void displycolour(){
            System.out.println(colour);
            System.out.println(super.colour);
        }

        void eating() {
            System.out.println("Eating Bread....");

        }
        public static void main(String args[]){
            Dog d=new Dog();
           d.displycolour();//black
            d.eating();

        }
    }

}
