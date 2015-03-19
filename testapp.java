package assign1;


import java.util.*;
import java.util.Scanner;
class AssemblyLine
{
	public  void caller(int a1[],int a2[],int t1[],int t2[],int e1,int e2,int x1,int x2,int noOftimes,int noOfstations)
	{

		int optimalTime,lineNo,k;
		int[] f1,f2,l1,l2;
		f1=new int[noOfstations];
		f2=new int[noOfstations];
		l1=new int[noOfstations];
		l2=new int[noOfstations];
		f1[0]=e1+a1[0];
		f2[0]=e2+a2[0];
		System.out.println("\n\t\t\t***  INPUTS  ***\n");
		System.out.println("\nAssembly times for stations on line 1");
		
		int ii=1;
		
		//System.out.print("\nAssembly Time ---> ");
		for(int i=0;i<noOfstations;i++){
			System.out.print("station "+ii+" -> "+a1[i]+ "\n");
			ii++;
		}


		System.out.println("\n\nAssembly times for stations on line 2");
		ii=1;
		for(int i=0;i<noOfstations;i++){
			System.out.print("station "+ii+" -> "+a2[i]+ "\n");
			ii++;
		}

		for(int j=1;j<noOfstations;j++)
		{
			if((f1[j-1]+a1[j]) <=(f2[j-1]+t2[j-1]+a1[j]))
			{
				f1[j]=f1[j-1]+a1[j];l1[j]=1;
			}
			else
			{
				f1[j]=f2[j-1]+t2[j-1]+a1[j]; l1[j]=2;
			}
			if((f2[j-1]+a2[j])<=(f1[j-1]+t1[j-1]+a2[j]))
			{
				f2[j]=f2[j-1]+a2[j]; l2[j]=2;
			}
			else
			{
				f2[j]=f1[j-1]+t1[j-1]+a2[j];l2[j]=1;
			}
		}

		if(f1[noOftimes]+x1 < f2[noOftimes]+x2)
		{
			optimalTime=f1[noOftimes]+x1;lineNo=1;
		}
		else
		{
			optimalTime=f2[noOftimes]+x2;lineNo=2;
		}

		System.out.println();
		int jj=1;
		System.out.print("\nf1  ---> \n");
		for(int i=0;i<noOfstations;i++){
			
			System.out.print("station "+jj+" -> "+f1[i]+ "\n");
			jj++;}
		System.out.println();
		System.out.print("f2  ---> \n");
		jj=1;
		for(int i=0;i<noOfstations;i++){
			System.out.print("station "+jj+" -> "+f2[i]+ "\n");
			jj++;}
		System.out.println();
		System.out.println();
		System.out.print("l1  ---> ");
		for(int i=1;i<noOfstations;i++)
			System.out.print(l1[i]+ " ");
		System.out.println();
		System.out.print("l2  ---> ");
		for(int i=1;i<noOfstations;i++)
			System.out.print(l2[i]+ " ");

		System.out.println();
		System.out.println();
		System.out.println("Entry Times \n e1="+e1+"\n e2="+e2);
		System.out.println("\nExit Times \n x1="+x1+"\n x2="+x2);
		System.out.println("\n\t\t\t***  OUTPUTS  ***\n");

		System.out.println("Optimal Time ->  "+optimalTime);
		System.out.println("Optimal line -> "+lineNo);

		System.out.println("\n\t\t\t***  Optimal Shortest Path  ***\n");
		System.out.println("Line ->"+lineNo+" Station -> "+ noOfstations);
		//k=l;
		for(int j=noOftimes;j>=1;j--)
		{

			if (lineNo==1)
			{
				lineNo=l1[j];
				System.out.println("Line ->"+(lineNo)+" Station -> "+(j)+" ");
			}
			else
			{
				lineNo=l2[j];
				System.out.println("Line ->"+(lineNo)+" Station -> "+(j)+" ");
			}
		}
		System.out.println();

	}
}
