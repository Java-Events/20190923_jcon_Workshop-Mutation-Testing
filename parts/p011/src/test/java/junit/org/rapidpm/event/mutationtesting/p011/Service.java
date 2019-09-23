package org.rapidpm.event.mutationtesting.p011.extended.u09;

public class Service {

	public static final String[] discardCommonPrefix(String a, String b) {
		String[] ret = {a, b};
		
		int pos = 0;
		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				pos++;
			}
		}
		
		ret[0] = a.substring(pos);
		ret[1] = b.substring(pos);
		
		return ret;
	}
}
