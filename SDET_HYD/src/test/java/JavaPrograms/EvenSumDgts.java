package JavaPrograms;

public class EvenSumDgts {

	public static void main(String[] args) {
     int i=456;
     int rem=0; 
     int sum=0;
     while(i!=0) {
    	 rem=i%10;
    	 if( rem%2==0)
    	 {
    		 sum=sum+rem;
    	 }
    	 i=i/10;
     }
      System.out.println(sum);
	}

}
