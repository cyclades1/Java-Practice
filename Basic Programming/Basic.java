import java.util.*;
import java.lang.*;
import java.io.*;

class Basic{

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
		for(int  i = b ;i<= c;i++)
		{
			float data = (float) i/c;
			System.out.print(String.format("%.2f ",data));
		}


	}
}