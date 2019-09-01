package com.blitznihar.app;
import com.blitznihar.app.implementation.Fibonaci;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fibonaci.print(new Fibonaci().getFiboUntil(10));
    }
}
