package InheritanceDemo;

public class EmpTest {

	public static void main(String[] args) {
		Developer e= new Developer();
		e.dept="CS";
		e.empID=1234;
		e.name="XYZ";
		e.workFromHome();
		e.workFromOffice();
		e.developCode("QWER");
		Tester t= new Tester("ABC");
	}

}
