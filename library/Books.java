package library;

public class Books {
	String title,author,publisher;
	int price;
	public Books(String name,String auth,String pub,int pri){
		title=name; author=auth;publisher=pub;price=pri;
	}
	
	public String toString() {
		String temp="Title: "+title+" Author: "+author+" Publisher: "+publisher+" Price: "+price;
		return temp;
	}
	

}
