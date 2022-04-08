import java.lang.*;
import java.util.*;
import java.io.*;

class MyExpection extends Exception{
	public MyExpection(String s){
		super(s);
	}
}

interface StockManage{

	public void addInStock(int number);
	public void removedFromStock(int number) throws MyExpection;
}


class Product implements StockManage{
	private int id;
	static int new_id = 0;
	String type, name;
	float price;
	int count;

	public void addInStock(int number){
		this.count+=number;
	}
	public void removedFromStock(int number) throws MyExpection{
		if(number > this.count){
			throw new MyExpection("Less Stock");
		}
		this.count-=number;
	}

	Product(){
		
		this.id = new_id;
		new_id +=1;
		this.count = 0;
	}
	int getId(){
		return this.id;
	}
	int getCount(){
		return this.count;
	}
	void setDetails(String name, String type, float price){
		this.name = name;
		this.type = type;
		this.price = price;

	}
	void showDetails()
	{
		System.out.println("----Details----");
		System.out.println(String.format("name : %s \ntype: %s\nprice: %.2f", this.name, this.type, this.price));
	}
}


class Phone extends Product{
	String company;
	Phone(){

	}
	void setDetails(String name, String type, String company, float price){
		this.name = name;
		this.type = type;
		this.price = price;
		this.company = company;
	}
	void showDetails()
	{
		System.out.println("----Details----");
		System.out.println(String.format("name : %s \ntype: %s\ncompany: %s\nprice: %.2f", this.name, this.type,this.company, this.price));
	}
}
class Main{

	public static void main(String [] args)
	{
		Product charger = new Product();
		charger.setDetails("iphone charger", "charger", 400);
		charger.showDetails();

		Phone iphone = new Phone();
		iphone.setDetails("iphone X", "mobile","apple", 300000);
		iphone.showDetails();
		System.out.println(String.format("number of iphone : %d", iphone.getCount()));
		System.out.println(iphone.getId());
		try{
			iphone.removedFromStock(2);
		}
		catch(Exception e){
			System.out.println(e);

		}
		
	}

}