package JavaPrograms;

public class BoxingAndUnBoxingClasses {

	public static void main(String[] args) {
		//Boxing
	   int a=12;
	   Integer i=Integer.valueOf(a);
	   System.out.println(i);
	   byte b=1;
	   Byte b1=Byte.valueOf(b);
	   System.out.println(b1);
	   boolean bn=true;
	   Boolean bn1=Boolean.valueOf(bn);
	   System.out.println(bn1);
         //Auto Boxing
	   int in=25;
	   Integer in1=in;
	   System.out.println(in1);
	   double d=20.2;
	   Double d1=d;
	   System.out.println(d1);
	   
	   //UnBoxing
	   int i1=16;
	   Integer i11=Integer.valueOf(i1);
	   int i2=i11.intValue();
	   System.out.println(i2);
	   
	   float f=1.2f;
	   Float f1=Float.valueOf(f);
	   float f2=f1.floatValue();
	   System.out.println(f2);
	   
	   // Unboxing 2nd way
	   Integer t=18;
	   int t1=t.intValue();
	   System.out.println(t1);
	   
	   Short s=25;
	   short s1=s.shortValue();
	   System.out.println(s1);
	   
	   // UnBoxing 3rd way create an object of WC
	   
	   Integer r=new Integer(100);
	   int r1=r.intValue();
	   System.out.println(r1);
	   
	   Double l=new Double(1.2);
	   double l1=l.doubleValue();
	   System.out.println(l1);
	   
	   //Auto UnBoxing
	   Integer e=20;
	   int e1=e;
	   System.out.println(e1);
	   
	   Character c='a';
	   char c1=c;
	   System.out.println(c1);
	   
	   // Auto UnBoxing 2nd way
	   int n=new Integer(30);
	   System.out.println(n);
	   
	   char h=new Character('R');
	   System.out.println(h  );
	   
	}

}
