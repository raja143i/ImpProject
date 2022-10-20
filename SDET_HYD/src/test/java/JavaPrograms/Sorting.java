package JavaPrograms;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {12,5,6,4,58,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
     		System.out.println(Arrays.toString(a));

	}    

}  
