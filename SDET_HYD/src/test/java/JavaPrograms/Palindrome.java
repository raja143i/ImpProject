package JavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int num=131; int rev = 0,rem; int temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(temp==rev) {
		System.out.println("palindrome");
		}
		else { 
			System.out.println("not palinndrome");
		}
	}

}
