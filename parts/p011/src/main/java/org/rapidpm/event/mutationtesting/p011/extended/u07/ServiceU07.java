package org.rapidpm.event.mutationtesting.p011.extended.u07;

public class ServiceU07 {
    public static final String[] discardCommonPrefix(String a , String b) {
        int l = Math.min(a.length(), b.length());
        int pos = 0;
        while((pos < l) && (a.charAt(pos) == b.charAt(pos))) pos++;
        return new String[] {a.substring(pos), b.substring(pos)};
    }
}
