package OverridingExe;

public class SBI extends Bank {
    double rateofIntrest()
    {
        return 8.8;
    }
    public static void main(String args[]){
        SBI sbi=new SBI();
       double intrest = sbi.rateofIntrest();
        System.out.println(intrest);
        Bank bank=new ICICI();
        System.out.println(bank.rateofIntrest());


    }



}
