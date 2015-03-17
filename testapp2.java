package assign1;

import java.util.Scanner;

public class testapp2 {

	public static void main(String[] args) {
		int noOfstations;
		
		
	int[] a1={8,2,3,8,8,1,3,2},a2={6,5,6,2,5,1,7,9};
	int [] t1={1,3,1,5,4,2,1},t2={2,1,6,2,4,2,4};
	noOfstations=a1.length;
	int	noOftimes=t1.length;	
		
	int e1=2,e2=2,x1=4,x2=3;
	AssemblyLine obj = new AssemblyLine();
    obj.caller(a1,a2,t1,t2,e1,e2,x1,x2,noOftimes,noOfstations);

	}

}
