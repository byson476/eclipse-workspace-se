import java.util.Iterator;

public class AcademyMemberTypeCastingArrayMain {
	public static void main(String[] args) {
		AcademyMember[] members= {
				new AcademyStudent(1,"KIM","ANDROID"),
				new AcademyStudent(2,"LEE","JAVA"),
				new AcademyStudent(3,"JUN","LINUX"),
				new AcademyGangsa(4, "박샘", "빅데이타"),
				new AcademyGangsa(5, "김샘", "클라우드"),
				new AcademyStaff(6,"박원장","원장"),
				new AcademyStaff(7,"심팀장","교무")
				
		};
		System.out.println("--------AcademyMember 전체출력-----------");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		System.out.println(" ## enhanced for");
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
		
		System.out.println("------------instanceof------------");
		/*
		 연산자 : instanceof
		  - 형태     : 참조변수 instanceof 클래스이름(type)
		  - 연산결과 : true or false
		  - ex> AcademyMember m = new AcademyStudent(1,"김","리눅스");
		        boolean isStudentObject = m instanceof AcademyStudent;
		 */
		AcademyMember m = new AcademyStaff(90, "스태프", "홍보");
		if(m instanceof AcademyStaff) {
			AcademyStaff tempStaff = (AcademyStaff) m;
			String depart = tempStaff.getDepart();
			System.out.println("스텝부서 : " + depart);;
			
		}
		System.out.println("--------AcademyMember배열에 있는 객체중 AcademyStudent 객체만 출력 -----");
		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStudent) {
				academyMember.print();
				AcademyStudent tempStudent = (AcademyStudent) academyMember;
				String ban = tempStudent.getBan();
				System.out.println(">>학생반 :: " + ban);
				
			}
		}
	}
}
