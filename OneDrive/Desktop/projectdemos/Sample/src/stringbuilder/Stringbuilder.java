package stringbuilder;

public class Stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Sun and Moon");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" and Stars");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//insert
		sb.insert(1,"sun");
		System.out.println(sb);
		
		
		//replace
		sb.replace(4, 7, "jupiter");
		System.out.println(sb);
		
		//delete
		sb.delete(4, 7);
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		
		
		//capacity
		System.out.println(sb.capacity());
		
		sb.append("Solarsystem");
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		
		//charat
		System.out.println(sb.charAt(4));
		
		//length
		System.out.println(sb.length());
		
		//substring
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(4, 13));
		System.out.println(sb.subSequence(3, 9));
		
		
		

	}

}
