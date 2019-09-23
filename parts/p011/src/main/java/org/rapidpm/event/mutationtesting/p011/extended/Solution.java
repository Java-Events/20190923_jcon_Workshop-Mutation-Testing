package org.rapidpm.event.mutationtesting.p011.extended;

public class Solution {
  public String[] discardCommonPrefix(String a, String b) {
    final String[] ret = new String[2];
    int            l;
    if (a.length() < b.length()) {
      l = a.length();
    } else {
      l = b.length();
    }

    int position = 0;
    for (; position < l; position++) {
      final char charA = a.charAt(position);
      final char charB = b.charAt(position);
      if (charA != charB) {
        break;
      }
    }

    if (position >= a.length()) {
      ret[0] = "";
    } else {
      ret[0] = a.substring(position);
    }

    if (position >= b.length()) {
      ret[1] = "";
    } else {
      ret[1] = b.substring(position);
    }
    return ret;
  }
}
