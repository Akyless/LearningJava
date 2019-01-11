package com.akyless.learning;

import java.util.Scanner;

public class Exercise3 {

public static void main(String[] args) {

 System.out.println("Please input q:");
 int q = new Scanner(System.in).nextInt();
 System.out.println("Please input w:");
 int w = new Scanner(System.in).nextInt();
 System.out.println("Please input e:");
 int e = new Scanner(System.in).nextInt();

 System.out.println("q=" +q);
 System.out.println("w=" +w);
 System.out.println("e=" +e);

 System.out.println("max=" + Math.max(q,e));
 System.out.println("min=" + Math.min(q,w));

    if((q>w)&(q>e)&(w>e)) {
     System.out.println("max = q; min = e");
    } else if(q<e) {
     System.out.println("max = e, min = q");
    }

    if((q>w)&(q>e)&(w<e)) {
        System.out.println("max = q; min = w");
    } else if(q<w) {
        System.out.println("max = w; min = q");
    }

    if((q>w)&(q<e)&(e>w)) {
        System.out.println("max = e; min = w");
    } else if(q>e) {
        System.out.println("max = w; min = e");
    }

    if((q>w)&(q<e)&(e<w)) {
        System.out.println("max = e; min = q");
    } else if(e>w) {
        System.out.println("max = q; min = e");
    }

    if((q<w)&(w>e)&(e>q)) {
        System.out.println("max = w; min = q");
    } else if(w<e) {
        System.out.println("max = q; min = w");
    }

    if((q<w)&(w>e)&(e<q)) {
        System.out.println("max = w; min = e");
    } else if(q>w) {
        System.out.println("max = e; min = w");
    }

    if((q<w)&(w<e)&(q<e)) {
        System.out.println("max = e; min = q");
    } else if(q>w) {
        System.out.println("max = q; min = e");
    }

}
}