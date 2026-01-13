package Study20260113;

import java.util.Scanner;

public class UserService {
	
	private Scanner sc = new Scanner(System.in);

	//아이디 찾기 메서드
	//이름을 입력하여 아이디찾기 할것
	public void findId(User[]users) {
		System.out.println("=====아이디 찾기=====");
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		for( User user : users) {
			if (user.getName().equals(name)) {
				System.out.println("id : "+user.getId());
				break;
			}
		}
		
	}
	
	//비밀번호 찾기 메서드
	// 아이디와 연락처를 입력하면 비밀번호를 변경할수있다.
	public void findPassword(User[]users) {
		System.out.println("==== 비밀번호 찾기 ====");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("연락처 입력 : ");
		String tell = sc.nextLine()	;
		
		boolean isDis = true;
		for (User user:users) {
			if (user.getId().equals(id)&&user.getTel().equals(tell)) {
				System.out.println("변경할 비밀번호 : ");
			    String qw = sc.nextLine();
			    user.setPasword(qw);
			    isDis = false;
			    break;
			}
			
		}
		if (isDis) {
			System.out.println("일치하는 정보가 없습니다. 다시 입력하세요");
		}
				
	}
	
	//로그인 메서드
	// 아이디와 비밀번호를입력하여 로그인 하기
	// 아이디와 비밀번호가 일치하면 "로그인 성공" 출력
	// 일치하지 않으면 "아이디 또는 비밀번호가 잘못되었습니다" 출력

	public void login(User[]users) {
		System.out.print("아이디를 입력해주세요 : ");
		String userid = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		String userpw = sc.nextLine();
		
		User temp = isID(users, userid);
		if (temp == null ) {
			System.out.println("아이디또는 비밀번호가 잘못되었습니다");
		}else if (temp.getPasword().equals(userpw)) {
			System.out.println("로그인성공");
		}else {
			
		}
		
		
//		boolean notlog =true;
//		for(User user:users) {
//			if (user.getId().equals(userid)&&user.getPasword().equals(userpw)) {
//				System.out.println("로그인성공");
//				notlog = false;
//				break;
//			}
//		}
//		if (notlog)
//			System.out.println("아이디 또는 비밀번호가 잘못되었습니다");
		
	}
	
	
	//일치하는 아이디가 있는지 확인하는 메서드
	private User isID(User[]users, String id) {
		for (User user:users) {
			if (user.getId().equals(id))return user;
			//아이디가 일치하는 User 객체를 반환
		}
		
		return null;//일치하는 아이디가 없다면 null을 반환
	}

}


//데이터 저장 관리하기 위한 클래스에서
//데이터 필터링 이나 , 파일저장(DB), 불러오기
// 등등 을 수행 하지 않는다.
// 데이터 저장 관리하기 위한 클래스에서는
// 저장에 관해 메서드를 주로 만들고
// 데이터 변환에 대해서만 만든다.
// 받아야할 데이터가 다른곳에서도 사용될 정보라면 매게변수로 받고
// 해당 클래스 외에 다른곳에 사용이 안된다면 해당 메서드안에서 만드는것이 좋다