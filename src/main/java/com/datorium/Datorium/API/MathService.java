package com.datorium.Datorium.API;

public class MathService {
    public int sum(int a, int b){
        int sum = a +b;
        if (sum>100){
            return 0;
        }
        return sum;

    }

}
