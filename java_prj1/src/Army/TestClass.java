package Army;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestClass {

	@Test
	public void test1() {
		ArrayList<String> al = new ArrayList<>();
		al.add("Andaman and Nicobar Island");
		al.add("Delhi");
		al.add("Jammu and Kashmir");
		al.add("Chandigarh");
		al.add("Puducherry");
		al.add("Lakshadweep");
		al.add("Ladakh");
		String n = "Rv";
		int a = 23;
		String l = "USA";
		String res = Armed_Force.test(n, a, l, al);
		assertTrue(res.equals("Rv is eligible"));
	}
	@Test
	public void test2() {
		ArrayList<String> al = new ArrayList<>();
		al.add("Andaman and Nicobar Island");
		al.add("Delhi");
		al.add("Jammu and Kashmir");
		al.add("Chandigarh");
		al.add("Puducherry");
		al.add("Lakshadweep");
		al.add("Ladakh");
		String n = "Hp";
		int a = 15;
		String l = "Trichy";
		String res = Armed_Force.test(n, a, l, al);
		assertFalse(res.equals("Hp is eligible"));
	}

}
