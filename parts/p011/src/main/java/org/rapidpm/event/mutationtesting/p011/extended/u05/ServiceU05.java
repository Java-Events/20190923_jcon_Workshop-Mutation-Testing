package org.rapidpm.event.mutationtesting.p011.extended.u05;

public class ServiceU05 {

  public static final String[] discardCommonPrefix(String a , String b) {
      int length = Math.min(a.length(), b.length());
      int prefix = -1;
      for (int i=0; i < length; i++) {
          if (a.charAt(i) != b.charAt(i)) {
              break;
          }
          prefix = i;
      }
      return new String[]{a.substring(prefix+1), b.substring(prefix+1)};
  }

}
