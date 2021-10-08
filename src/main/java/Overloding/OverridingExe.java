package Overloding;

class Bank{
        double rateofIntrest(){
            return 0;
        }
        static class SBI extends Bank
        {

            double rateofIntrest()
            {
                return 9.7;

                }
                class ICICI extends Bank
                {

                    double rateofIntrest()
                    {
                        return 8.8;
                    }
                }
                class Axis extends Bank{
                    double rateofIntrest() {
                        return 7.9;

                    }
                }
            }

    }

public class OverridingExe {

    public static void main(String args[]){

      /*  Bank.SBI sbi=new Bank.SBI();
        System.out.println(sbi.rateofIntrest());
     Bank.ICICI icici=new Bank.ICICI();
        System.out.println(icici.rateofInterest());
        AXIS.axis=new AXIS();
        System.out.println(axis.ratiofIntrest());*/
       /* ICICI ic=new ICICI()*/
    }
}





