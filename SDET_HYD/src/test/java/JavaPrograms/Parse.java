package JavaPrograms;

public class Parse {

	public static void main(String[] args) {
		
	String s="120";
	
	int i=Integer.parseInt(s);
	System.out.println(i);
	System.out.println(i+1);
     
	double d=Double.parseDouble(s);
	System.out.println(d+1.2);
	
	boolean b=Boolean.parseBoolean(s);
	System.out.println(b);
	
	short s1=Short.parseShort(s);
	System.out.println(s1);
	
	byte b1=Byte.parseByte(s);
	System.out.println(b1);
	
	long l=Long.parseLong(s);
	System.out.println(l);
	
	String e="12os";
	int y=Integer.parseInt(e);
	System.out.println(e);
	
	}

}
