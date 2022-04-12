import java.io.*;
import java.lang.*;
import java.util.*;

class Task extends Thread{
	public void run(){

		try{
			int number = 5;
			while(number>0){
				System.out.println(number);
				number--;
				Thread.sleep(1000);
			}

		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}
}

class Main{
	public static void main(String [] args){
		Task worker1 = new Task();
		worker1.start();
		try{
			Thread.sleep(1000);
		}
		catch (Exception e){
			System.out.println(e);
		}
		Task worker2 = new Task();
		worker2.start();

	}

}