
public class AcademyMemberArrayOverringMain {
	public static void main(String[] args) {
		AcademyStudent[] students = new AcademyStudent[3];
		students[0] = new  AcademyStudent(1, "KIM", "JAVA");
		students[1] = new  AcademyStudent(2, "LIM", "OFFICE");
		students[2] = new  AcademyStudent(3, "SIM", "IOS");
		
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		gangsas[0] = new AcademyGangsa(4, "김강사", "웹디자인");
		gangsas[1] = new AcademyGangsa(5, "정강사", "빅데이터");
		
		AcademyStaff[] staffs = new AcademyStaff[2];
		staffs[0] = new AcademyStaff(6, "심팀장", "교육부");
		staffs[1] = new AcademyStaff(7, "나대리", "회계부");
		
		System.out.println("---------------AcademyMembe전체출력-----------------");
		System.out.println("---------------Student-----------------");
		for (AcademyStudent academyStudent : students) {
			academyStudent.print();
		}
		System.out.println("---------------Gangsa-----------------");
		for (AcademyGangsa academyGangsa : gangsas) {
			academyGangsa.print();
		}
		System.out.println("---------------Staff-----------------");
		for (AcademyStaff academyStaff : staffs) {
			academyStaff.print();
		}
	}
}
