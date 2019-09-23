/*
 * (c) Copyright 2019 codecentric AG
 */
package org.rapidpm.event.mutationtesting.p011.extended.u12;

public class DemoLength {

   public  static int length(String a , String b) {
        int l = a.length() < b.length() ? a.length() : b.length();
        return l;
    }
}
