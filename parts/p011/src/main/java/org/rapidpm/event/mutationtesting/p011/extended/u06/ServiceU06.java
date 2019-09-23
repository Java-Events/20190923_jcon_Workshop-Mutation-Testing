package org.rapidpm.event.mutationtesting.p011.extended.u06;

public class ServiceU06 {

	public static final String[] discardCommonPrefix(String a, String b) {
		String[] ret = {a, b};

		int l = Math.min(a.length(), b.length());

		for (int i = 0; i < l; i++) {
			if (a.charAt(i) == b.charAt(i)) {
				ret[0] = a.substring(Math.min(i + 1,a.length()));
				ret[1] = b.substring(Math.min(i + 1,b.length()));
			} else {
				break;
			}
		}
		return ret;
	}

}
