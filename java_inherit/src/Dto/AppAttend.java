package Dto;

import Able.Attendance;

public class AppAttend implements Attendance {
	
	private boolean presont = false; //출석상태

	@Override
	public void checkIn() {
		presont = true;
		System.out.println("앱 출석 완료");
		
		
	}

	@Override
	public void checkOut() {
		presont = false;
		System.out.println("앱퇴실 완료");
		
	}

	@Override
	public boolean isPresent() {
		
		return presont;
	}

}
