package JavaPrograms;

public class Sum {

	public static void main(String[] args)  {
		int num=568; 
	     while(num>9) {
	    	 int sum=0;
	     while(num!=0)
	     {
	    	sum=sum+num%10;
	    	num=num/10;
	     }
	     num=sum;
   System.out.println(sum);
	}}}
