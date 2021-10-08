package Practice;

public class ControlStatements {
    public static void main(String args[]){
        //conditional statements
        //if condition
        int a=10;
        int b=20;
        if(a<b){
            System.out.println("a is smaller value");
            //else if condition
            int c=30;
            int d=20;
            if(c<d){
                System.out.println("small value is:"+c);
            }
            else {
                System.out.println("small value is:"+d);
                //nested if
                int age=60;
                if(age<50){
                    System.out.println("you are young");
                }else {
                    System.out.println("you are old");
                }

            }
        }
    }
}
