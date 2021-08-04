package string;

public class Reverse {

	public static void main(String[] args) {
		String str=new String("StringHandling");
	
		char ch[]=str.toCharArray();
		String rev="";
		for (int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.reverse());

	}

}
