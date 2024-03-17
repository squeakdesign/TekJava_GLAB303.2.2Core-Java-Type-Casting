public class Main {
    public static void main(String[] args) {
        //implicit typecasting
        int x=20;
        double y=40.5;
        long p=30;
        float q=10.60f;
        // int z=x+y; //Error
        double z=x+y;
        System.out.println("sum of two numbers "+z);
        // long r=p-q;  //error
        float r=p-q;
        System.out.println("subtraction of two numbers "+r);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
// Expression:
        double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
        System.out.println("result = " + result);


        double d1 = 100.04;


        // explicit type casting
        long l = (long)d1;
        int i1 = (int)l;
        System.out.println("Double value "+d1);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i1);

        byte b1;
        int z1 = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b1 = (byte) z;
        System.out.println("z = " + z1 + " b = " + b1);
        System.out.println("Conversion of double to int.");

        z1 = (int) dou;
        System.out.println("dou = " + dou + " b = " + z1);
        System.out.println("Conversion of double to byte.");

        b1= (byte) dou;
        System.out.println("dou = " + dou + " b = " + b1);



    }
}
