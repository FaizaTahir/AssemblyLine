package assign1;

import java.util.Scanner;

public class testapp {

	public static void main(String[] args) {
		int noOfstations;
		//int [] a1;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Number of stations on line 1 and line 2\n");
		noOfstations = in.nextInt();
		
		//////////////// assigning a1 a2 values ////////////////
		
		int noOftimes=noOfstations-1;
		 int [ ] a1 = new int[noOfstations];
		 int [ ] a2 = new int[noOfstations];
		
		System.out.print("---> Assembly times for stations on line 1\n");
		for(int i=0; i<noOfstations;i++){
			System.out.print("Enter time a1[ station : "+ (i+1)+"]\n");
			a1[i]=in.nextInt();
			
		}
		
		System.out.print("---> Assembly times for stations on line 2\n");
		for(int i=0; i<noOfstations;i++){
			System.out.print("Enter time a2[ station : "+ (i+1)+"]\n");
			a2[i]=in.nextInt();
		}
		////////////////////////    ////////////////////////
		
	//int[] a1={7,9,3,4,8,4},a2={8,5,6,4,5,7}
	//int [] t1={2,3,1,3,4},t2={2,1,2,2,1};

		
		int [ ] t1 = new int[noOfstations-1];
		 int [ ] t2 = new int[noOfstations-1];
		 
		 ///////////////////////////// assigning t1 t2 values /////////
		
		System.out.print("---> Transfer times for stations on line 1\n");
		for(int i=0; i<noOftimes;i++){
			System.out.print("Enter time t1[ from station : "+ (i)+"]\n");
			t1[i]=in.nextInt();
			
		}
		
		System.out.print("---> Transfer times for stations on line 2\n");
		for(int i=0; i<noOftimes;i++){
			System.out.print("Enter time t2[ from station : "+ (i)+"]\n");
			t2[i]=in.nextInt();
		}
		
		
		
		
	int e1,e2,x1,x2;

	System.out.println("Enter entry time for station 1: e1 : \n");
	e1=in.nextInt();
	System.out.println("Enter entry time for station 2: e2 : \n");
	e2=in.nextInt();
	System.out.println("Enter exit time for station 1: x1 : \n");
	x1=in.nextInt();
	System.out.println("Enter exit time for station 2: x2 : \n");
	x2=in.nextInt();
	AssemblyLine obj = new AssemblyLine();
    obj.caller(a1,a2,t1,t2,e1,e2,x1,x2,noOftimes,noOfstations);

	}

}
