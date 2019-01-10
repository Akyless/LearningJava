package com.akyless.learning;

import java.util.Scanner;

public class Exercise3 {

public static void main(String[] args) {

 String a = "Выведи мне значение переменной 'q'";
 System.out.println(a);
 int q;
 q = new Scanner(System.in).nextInt();
 System.out.println(q);

 String s = "Выведи мне значение перменной 'w'";
 System.out.println(s);
 int w;
 w = new Scanner(System.in).nextInt();
 System.out.println(w);

 String d = "Выведи мне значение переменной 'e'";
 System.out.println(d);
 int e;
 e = new Scanner(System.in).nextInt();
 System.out.println(e);


    if((q>w)&(q>e)&(w>e)) {
     System.out.println("max = q; min = e");
 } else{
     System.out.println("max = e, min = q");
 }
}
}