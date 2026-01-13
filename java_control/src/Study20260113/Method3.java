package Study20260113;

import java.util.Arrays;

public class Method3 {

	public static void main(String[] args) {
		
		
//		// 아래와같이 만들었을때 객체의 공간이 만들어지는게 아닌
//		// 참조변수의 공간이 만들어짐
//		User[] users = new User[5];
//		users[0].setName("이순신");
//		// 자바에서 set의 의미는 입력을 의미하고
//		// get의 의미는 출력을 의미한다
//		
//		System.out.println(users[0].getName());
//	
//		users[0] = new User("lees","51512","이순신","25245884" );
		
		User[] users = { 
				new User("lee","1231","이순신","22548525"),
				new User("sung","2512","이성계","88459962"),
				new User("king","9995","세종","99511952"),
				new User("brus","5658","이소룡","84845126"),
				new User("chan","9514","강감찬","48512637"),
		};
		
		UserService us = new UserService();
		us.findId(users);
		
		us.findPassword(users);
		
		System.out.println(Arrays.toString(users));
		
		us.login(users);
		
		
		
		

	}

}
