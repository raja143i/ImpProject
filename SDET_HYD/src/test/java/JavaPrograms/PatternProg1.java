package JavaPrograms;

public class PatternProg1 {

	public static void main(String[] args) {
		int col=5;
		for(int i=1;i<=5;i++) {
			int num=5;
			char ch='a';
			for( int j=1;j<=col;j++) {
				if(i%2==0) {
					System.out.print   (ch++);
				}
				else {
					System.out.print(num--);
				}
				
			}
			System.out.println();
			col--;
		}

	}

}
