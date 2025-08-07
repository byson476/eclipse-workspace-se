
public class MemberMethodThisMain {
	public static void main(String[] args) {
		System.out.println("----------------- mmt1 --------------------");
		MemberMethodThis mmt1 = new MemberMethodThis();
		mmt1.setMemberField1(11);
		mmt1.setMemberField2(22);
		
		System.out.println(mmt1.getMemberField1());
		System.out.println(mmt1.getMemberField2());
		
		System.out.println("----------------- mmt2 --------------------");
		MemberMethodThis mmt2 = new MemberMethodThis();
		mmt2.setMemberField1(33);
		mmt2.setMemberField2(44);
		System.out.println(mmt2.getMemberField1());
		System.out.println(mmt2.getMemberField2());
	}
}
