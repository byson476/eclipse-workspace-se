
public class AcademyMemberArrayConstructorMain {
	public static void main(String[] args) {
		AcademyStudent[] students = {
				new AcademyStudent(1, "KIM", "JAVA"),
				new AcademyStudent(2, "LIM", "OFFICE"),
				new AcademyStudent(3, "SIM", "IOS")
		};
		AcademyGangsa[] gangsas = {
				new AcademyGangsa(4, "김강사", "웹디자인"),
				new AcademyGangsa(5, "전강사", "자바")
		};
		AcademyStaff[] staffs = {
				new AcademyStaff(6, "심팀장", "교육"),
				new AcademyStaff(7, "나대리", "회계")
		};
		System.out.println("------------- AcademyMember 전체출력 ------------------");
		for (AcademyStudent student : students) {
			student.print();
		}
		for (AcademyGangsa gangsa : gangsas) {
			gangsa.print();
		}
		for (AcademyStaff staff : staffs) {
			staff.print();
		}
	
			
		
	}
}
