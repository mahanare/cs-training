package basics.nitya;

public class StringCompare {

	private static void StringComp(String a, String b) {

		String s1 = "clemsonuniv";
		String s2 = "clems";

		for (int i = 0; i < s1.length(); i++) {

			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (c1 == c2) {
				System.out.println("Match found");
				if (i == s2.length() - 1)
					break;
			} else
				System.out.println("Match not found");
		}
	}

	public static void main(String[] args) {

		StringComp("a", "b");
	}

}
