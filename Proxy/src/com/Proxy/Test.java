package com.Proxy;
/**
 * ������
 * @author 15806
 *
 */
public class Test {
	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("������");
		
		Proxy daili = new Proxy(girl);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveCHocolate();
	}


}
