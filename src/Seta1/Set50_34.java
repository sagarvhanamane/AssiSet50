package Seta1;

public class Set50_34 {

	public static void main(String[] args) {
		 String s1 = "Forget";

		    getvalues(s1);
		  }
		  public static void getvalues(String s1) {
		    StringBuffer sb = new StringBuffer();
		    int l = s1.length();
		    if (l % 2 == 0) {
		      for (int i = 0; i < s1.length() - 1; i=i+2) {
		        char a = s1.charAt(i);
		        char b = s1.charAt(i + 1);
		        sb.append(b).append(a);
		      }
		      System.out.println(sb);
		    } else {
		      for (int i = 0; i < s1.length() - 1; i = i + 2) {
		        char a = s1.charAt(i);
		        char b = s1.charAt(i + 1);
		        sb.append(b).append(a);
		      }
		      sb.append(s1.charAt(l - 1));
		      System.out.println(sb);
		    }

	}

}
