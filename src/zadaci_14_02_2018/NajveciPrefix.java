package zadaci_14_02_2018;

public class NajveciPrefix {
	public static String najveciPrefix(String s1, String s2) {
		String prefix = "";
		if (s1.length() > s2.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		int i = 0;
		while (s1.charAt(i) == s2.charAt(i)) {
			prefix += s1.charAt(i);
			i++;
		}
		return prefix;

	}

	public static void main(String[] args) {
		String s1 = "Dobrodošli u Doboj.";
		String s2 = "Dobrodošli u Tuzlu.";
		System.out.println(najveciPrefix(s1, s2));
	}

}
