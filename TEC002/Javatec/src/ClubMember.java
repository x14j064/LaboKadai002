
public class ClubMember extends Student {
String club;
	ClubMember(String name, int age, String address, String clazz,String club) {
		super(name, age, address, clazz);

	}

	

	@Override
	void print() {
		super.print();
		System.out.println("•”Šˆ“®"+ club);
	}
}
