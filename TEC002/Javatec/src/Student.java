
public class Student extends Person{
String clazz;
	Student(String name, int age, String address,String clazz) {
		super(name, age, address);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	

	@Override
	void print() {
		super.print();
		System.out.println("クラス：" + clazz);
	}
}
