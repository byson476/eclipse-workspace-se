package com.itwill03.포함;
public class DvdMemberArray {
    private int no;//회원번호
    private String name;//회원이름
    private String phoneNum;//전화번호
	private Dvd rentDvd;//빌린dvd
	private Dvd[] dvds;//빌린dvd들

	public DvdMemberArray() {}
	public DvdMemberArray(int no, String name, String phoneNum, Dvd rentDvd) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
		this.rentDvd = rentDvd;
	}

	/*
	<<기능>>
	  회원정보출력 
	 */
	public void print(){
		System.out.println(">>회원정보");
		System.out.println(this.no + "\t" + this.name + "\t" + this.phoneNum);
		System.out.println("\t>>" + this.name + "님의 대출DVD목록");
		/*
		if(this.dvds!=null)
		{
			for (Dvd dvd : dvds) {
				if(dvd!=null)
					dvd.print();
			}
		}
		else
			System.out.println("\t빌린 DVD가 없습니다");
		*/
		if(this.dvds==null) {
			System.out.println("\t빌린 DVD가 없습니다");
			return;
		}

		for (Dvd dvd : dvds) {
			if(dvd!=null)
				dvd.print();
		}

    }

	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Dvd getRentDvd() {
		return rentDvd;
	}
	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	public Dvd[] getDvds() {
		return dvds;
	}
	public void setDvds(Dvd[] dvds) {
		Dvd[] tempDvds = new Dvd[3];
		if(dvds!=null && dvds.length>0) {
			for (int i = 0; i < 3; i++) {
				tempDvds[i]=dvds[i];
			}
		}
		else
			tempDvds = null;
		this.dvds = tempDvds;
	}
}
