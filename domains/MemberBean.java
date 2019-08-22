package com.bitcamp.domains;

public class MemberBean {
	private String name,id,pw,ssn,blood,phonenumber;
	private double cm , kg ;
	
//	public MemberBean() {}
//	기본생성자 구조 눈엔 안보이지만 컴파일러가 로딩될 떄 기본생성자를 생성해준다.
	
	public void setName(String name) {
		this.name = name;//this생략가능
	}
	public String getName() {
		return this.name;//this생락가능
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setPhoneNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPhoneNumber() {
		return this.phonenumber;
	}
	public void setCm(double cm) {
		this.cm = cm;
	}
	public double getCm() {
		return this.cm;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public double getKg() {
		return this.kg;
	}
	@Override
	public String toString() {
		//이름, 아이디, 비번, 주민번호, 혈액형, 핸드폰번호, 키, 몸무게
		return String.format("[회원정보: \n"
				+ "이름 : %s\n"
				+ "아이디 : %s\n"
				+ "비번 : %s\n"
				+ "주민번호 : %s\n"
				+ "혈액형 : %s형\n"
				+ "핸드폰번호 : %s\n"
				+ "키 : cm %s\n"
				+ "몸무게 : kg %s]\n",name,id,pw,ssn,blood,phonenumber,cm,kg);
	}
}
