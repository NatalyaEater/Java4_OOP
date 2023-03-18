package org.example;

import java.util.List;

public class Cals <T extends Number> {
    public double sum (T itemsOne,T itemsTwo){
        var sum=itemsOne.doubleValue() + itemsTwo.doubleValue();
        return sum;
    }
    public double del (T itemsOne,T itemsTwo ){
        var del1=itemsOne.doubleValue() / itemsTwo.doubleValue();
        return del1;
    }

    public double multiplication (T itemsOne, T itemsTwo) {

        var mul=itemsOne.doubleValue() * itemsTwo.doubleValue();

        return mul;
    }
    public String binCod(T itemsOne, T itemsTwo){

        return "Значение первого числа = "+Integer.toBinaryString((Integer) itemsOne)+"  ;  "+"\n"+
                "Значение второго числа = "+Integer.toBinaryString((Integer) itemsTwo);
    }




}
