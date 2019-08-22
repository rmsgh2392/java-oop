package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.services.MemberService;
import com.bitcamp.domains.MemberBean;
public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입 \n"
					+ "2.마이페이지\n"
					+ "3.비번변경\n"
					+ "4.회원탈퇴")) {
			case "0" :
				JOptionPane.showMessageDialog(null,"시스템 종료하겠습니다.");
				return;
			
			case "1":
				String spec = JOptionPane.showInputDialog("이름, 아이디, 비번, 주민번호, 혈액형, 핸드폰번호, 키, 몸무게");
				System.out.println("********** "+ spec);
				String[] arr = spec.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				member.setBlood(arr[4]);
				member.setPhoneNumber(arr[5]);
				member.setCm(Double.parseDouble(arr[6]));
				member.setKg(Double.parseDouble(arr[7]));
				
//				String msg =service.join(member);
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				
				break;
			case "3":
				
				
				break;
			case "4":
				
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.list());
				
				break;
				
				
				
				
				
				
				
			default:
				break;
			}
		}
	}

}
