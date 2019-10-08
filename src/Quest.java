
public class Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g="capge";
//		String g1="capgemini";
		System.out.println((g.hashCode()));
		g=g.concat("penis");
		System.out.println((g.hashCode()));
		
		StringBuffer buf = new StringBuffer("capge");
		System.out.println(buf.hashCode());
		buf.append("penis");
		System.out.println(buf.hashCode());
		System.out.println(buf);
		StringBuilder bd = new StringBuilder("capge");
		System.out.println(bd.hashCode());
		bd.append("penis");
		System.out.println(bd.hashCode());
	
	}

}
