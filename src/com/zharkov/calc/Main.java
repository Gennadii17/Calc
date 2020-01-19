package com.zharkov.calc;

public class Main {
    char a = 'a';
    boolean bool = true;

    public static void main(String[] args) {
        /*System.out.print("2+2=" + (2 + 2));
        System.out.print("2+2=" + (2 + 2));
        Sum summingOperation = new Sum();
        System.out.println(summingOperation.run(256.56, 133.154365));*/
        String result = "Hello " + new A().getNumber(9);
        System.out.println(result);
    }


}

class A {
   public int getNumber(int b) {
       return b;
   }
}
