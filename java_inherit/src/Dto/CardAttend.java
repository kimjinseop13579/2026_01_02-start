package Dto;

import Able.Attendance;

public class CardAttend implements Attendance {

	private boolean person = false; // 처음에는 퇴실상태
	
	
	
	@Override
	public void checkIn() {
		person = true; //출석 했다
		System.out.println("카드 출석 완료");
		
	}

	@Override
	public void checkOut() {
		person = false;
		System.out.println("카드퇴실 완료");
		
	}

	@Override
	public boolean isPresent() {
	
		return person;
	}
	

}
