import java.util.*;
import java.lang.*;
import java.io.*;

class Basic{
	public static void print(int n){
		System.out.println(n);
	}
	public static void print(String s){
		System.out.println(s);
	}
	public static void main(String [] arg){
		Scanner in = new Scanner(System.in);
		int a, b, c = 5;
		b = a = 10;
		while (c<a)
		{
			System.out.println(String.format("%d %d %d",a, b, c));
			b--;
			c++;
		}
		System.out.println("Type hello to print upper and lower format");
		String s = in.next();
		boolean flag = s.equals("hello");
		if(flag){
			System.out.println(s.toUpperCase()+" "+s.toLowerCase());
		}
		else{
			print("you enter something else");
		}
		for(int  i = b ;i<= c;i++)
		{
			float data = (float) i/c;
			System.out.print(String.format("%.2f ",data));
		}
		print("\nenter a number: ");
		int n = in.nextInt();
		int [] ar = new int[n];
		print(String.format("enter %d numbers: ",n));
		int sm = 0;
		for(int i =0;i<n;i++)
		{
			ar[i]= in.nextInt();
			sm += Math.abs(ar[i]);
		}
		print(sm);

	}
}