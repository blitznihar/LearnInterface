package com.blitznihar.app.implementation;

import java.util.ArrayList;
import java.util.List;

import com.blitznihar.app.interfaces.IFibonaci;

public class Fibonaci implements IFibonaci {

    @Override
    public List<Integer> getFiboUntil(int intUntil) {
        ArrayList<Integer> listFibonaci = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int k = 0; 
        
        
        return calculateFibo(intUntil, listFibonaci, i, j, k);
    }
    private ArrayList<Integer> calculateFibo(int intUntil, ArrayList<Integer> listFibonaci, int i, int j, int k) {
        if(k<intUntil)
        {
            listFibonaci.add(k);
            k= getNextFibonaci(i,j);
            i=j;
            j=k;   
            calculateFibo(intUntil, listFibonaci, i, j, k);
        }
        return listFibonaci;
    }
    public static Integer getNextFibonaci(Integer startValue, Integer endValue){
        Integer nextValue = 0;
        if(startValue==0 && endValue==0)
        nextValue = 1;
        else
        nextValue =startValue+endValue;
        return nextValue;
    }
    public static void print(List<Integer> fibo){
        for (Integer x : fibo) {
            System.out.println(x);    
        }
    }
}