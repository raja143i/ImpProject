package JavaPrograms;

public class Adding2Arrays {

	public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int b[]= {7,8,9,10,11};
	int length=a.length;
	if(a.length<b.length) {
		length=b.length;
	}
	for(int i=0;i<length;i++) {
		try {
			System.out.print(a[i]+b[i]+"  ");
		}
		catch(Exception e) {
			if(a.length>b.length) {
				System.out.print(a[i]+" ");
			}
			else {
				System.out.print(b[i]+" ");
			}
		} 
	}

	}

}
