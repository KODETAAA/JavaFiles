
public abstract class Main implements InterfaceSet {
	public static void main(String[] args) {
		Set s1 = new Set();
		Set s2 = new Set();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(6);
		System.out.println(s1.isElemementof(2));
		System.out.println(s1.isElemementof(10));
	}
}
