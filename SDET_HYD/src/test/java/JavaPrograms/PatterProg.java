package JavaPrograms;

public class PatterProg {

	public static void main(String[] args) {
		int space=0;
		int col=5;
		for(int i=1;i<=5;i++) {
			char ch='e';
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=col;k++) {
				System.out.print(ch--);
			}
			System.out.println();
			space++;
			col--;
		}

	}

}
