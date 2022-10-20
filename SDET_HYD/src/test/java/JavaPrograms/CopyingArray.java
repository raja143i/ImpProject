package JavaPrograms;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				b[i]=a[i];
			}
		}

		System.out.println(Arrays.toString(a));

		System.out.println(Arrays.toString(b));
	}

}
