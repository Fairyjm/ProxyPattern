package com.Proxy;

public class Pursuit  implements GiveGift {
private SchoolGirl girl;
	
	public Pursuit(SchoolGirl mm) {
		this.girl = mm;
	}
 
	@Override
	public void giveDolls() {
		System.out.println("ËÍÄãÑóÍŞÍŞ"+girl.getName());
	}
 
	@Override
	public void giveFlowers() {
		System.out.println("ËÍÄãÏÊ»¨"+girl.getName());
	}
 
	@Override
	public void giveCHocolate() {
		System.out.println("ËÍÄãÇÉ¿ËÁ¦"+girl.getName());
	}
 
}
 
/**
 * Å®º¢
 */
class SchoolGirl {
	private String name;
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}



}
