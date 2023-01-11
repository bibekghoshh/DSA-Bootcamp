package com.bibek;

public class ElectricityBill {
    public static void main(String[] args) {
        int unit=89;
        double billtopay=0;
        if(unit<100 && unit>0){
            billtopay=unit*5.26;
        } else if (unit<200 && unit>100) {
            billtopay=100*5.26+(unit-100)*5.80;
        } else if (unit<300 && unit>200) {
            billtopay=100*5.26+100*5.80+(unit-200)*6.50;
        }else {
            billtopay=00*5.26+100*5.80+100*6.50+(unit-300)*7;
        }
        System.out.println(billtopay);
    }
}
