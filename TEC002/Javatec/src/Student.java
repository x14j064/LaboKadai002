
public class Student extends Person{
String clazz;
	Student(String name, int age, String address,String clazz) {
		super(name, age, address);
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	

	@Override
	void print() {
		super.print();
		System.out.println("�N���X�F" + clazz);
	}
}
