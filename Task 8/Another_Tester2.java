package start;

import core.Tester;

public class Another_Tester2 {

	public static void main(String[] args) {
		String name = "Ivan";
		String surname = "Petrov";
		int expirienceInYears = 5;
		String englishLevel = "A1";
		int salary = 150;
		// �������������
		Tester tester = new Tester(name, surname, expirienceInYears, englishLevel, salary);
		// ����� get- c ������������� *friendly �������� ������ ������ ������ core
		System.out.println(tester.getName() + " " + tester.getSurname() + " " + tester.getExpirienceInYears() + " "
				+ tester.getEnglishLevel() + " " + tester.getSalary());
		// ����� set- c ������������� *friendly �������� ������ ����� ������ core
		tester.setName(name);
		tester.setSurname(surname);
		tester.setExpirienceInYears(expirienceInYears);
		tester.setEnglishLevel(englishLevel);
		tester.setSalary(salary);
		// ���������� ������� �����, �.�. ����� � ������������� *friendly � �� ��������
		// ������ � ������ core
		System.out.println(tester.expirienceInMonth());
		// ���������� ������� �����, �.�. ����� � ������������� *protected � �� ��������
		// ������ � ������ core
		tester.informationaboutTester();
		// ����� � ������������ *public �������� ��������
		tester.allInformationaboutTester();
		// ���������� ������� �����, �.�. ����� � ������������� *private
		// � �� �������� ������ ������ ������ Tester
		tester.supplementnSalary();
	}

}
