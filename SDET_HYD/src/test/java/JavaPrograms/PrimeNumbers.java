package JavaPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
	  int primecount=0;
	  for(int i=1;i<=10;i++) {
		  int count=0;
		  for(int j=1;j<=i;j++) {
			  if(i%j==0) {
				  count++;
			  }
		  }
		  if(count==2) {
			  primecount++;
		  }
		 
	  }
	  System.out.print(primecount+" ");
	}

}
