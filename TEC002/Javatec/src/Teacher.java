
public class Teacher extends Person {
String depertment;
Teacher(String name, int age, String address,String depertment) {
		super(name, age, address);
		this.depertment = depertment;
		
	}



@Override
void print() {
	super.print();
	System.out.println("�w�ȁF" + depertment);
}


}
