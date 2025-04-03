package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Mobile {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		ArrayList<Mobile> list = new ArrayList<Mobile>();
		Mobile[] m = new Mobile[10];
		m[0] = new Mobile("Redmi","MJ1200",20000,8);
		m[1] = new Mobile("Realmi","MJ1234",15000,6);
		m[2] = new Mobile("SamSung","S24",120000,16);
		m[3] = new Mobile("Apple","16Pro",100000,8);
		m[4] = new Mobile("One Pluse","NORD",18000,6);
		m[5] = new Mobile("IQ","IQ16",22000,8);
		m[6] = new Mobile("Nokia","nokia17",12000,4);
		m[7] = new Mobile("LG","lg171",8000,6);
		m[8] = new Mobile("VIVO","V564",7000,6);
		m[9] = new Mobile("OPPO","op8987",9000,6);
		
		list.add(m[0]);
		list.add(m[1]);
		list.add(m[2]);
		list.add(m[3]);
		list.add(m[4]);
		list.add(m[5]);
		list.add(m[6]);
		list.add(m[7]);
		list.add(m[8]);
		list.add(m[9]);
		
        System.out.println("Eneter the Brand : ");
		String s = sc.next();
		Function.find_mobile_by_brand(s,list);
		
		System.out.println("Enter The Lower_Price : ");
		int price_ll = sc.nextInt();
		System.out.println("Enter The Upper_Price : ");
		int price_ul = sc.nextInt();
		Function.display_mobile_details(price_ll,price_ul,list);
		
		System.out.println("Eneter Ram Rang : ");
		int ram = sc.nextInt();
		System.out.println("Enter the price : ");
		int price = sc.nextInt();
		Function.display_mobile(ram,price,list);
		
		sc.close();
	}

}
