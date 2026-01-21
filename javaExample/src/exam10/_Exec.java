package exam10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
		
		List<Map<String, String>> list = new ArrayList<>();

		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int mat = 70;
		int tot = kor + eng + mat;
		double avg = tot/3.0;
		Map<String, String> map1 = new HashMap<>();
		map1.put("name", name);
		map1.put("kor", kor + "");
		map1.put("eng", eng + "");
		map1.put("mat", mat + "");
		map1.put("tot", tot + "");
		map1.put("avg", avg + "");
		list.add(map1);

		name = "이성준";
		kor = 40;
		eng = 90;
		mat = 60;
		tot = kor + eng + mat;
		avg = tot/3.0;
		Map<String, String> map2 = new HashMap<>();
		map2.put("name", name);
		map2.put("kor", kor + "");
		map2.put("eng", eng + "");
		map2.put("mat", mat + "");
		map2.put("tot", tot + "");
		map2.put("avg", avg + "");
		list.add(map2);

		name = "장천용";
		kor = 80;
		eng = 65;
		mat = 50;
		tot = kor + eng + mat;
		avg = tot/3.0;
		Map<String, String> map3 = new HashMap<>();
		map3.put("name", name);
		map3.put("kor", kor + "");
		map3.put("eng", eng + "");
		map3.put("mat", mat + "");
		map3.put("tot", tot + "");
		map3.put("avg", avg + "");
		list.add(map3);

		name = "강감찬";
		kor = 90;
		eng = 90;
		mat = 70;
		tot = kor + eng + mat;
		avg = tot/3.0;
		Map<String, String> map4 = new HashMap<>();
		map4.put("name", name);
		map4.put("kor", kor + "");
		map4.put("eng", eng + "");
		map4.put("mat", mat + "");
		map4.put("tot", tot + "");
		map4.put("avg", avg + "");
		list.add(map4);
		
		for (int i=0; i < list.size(); i++) {
			Map<String,String> map = list.get(i);
			
						
			String msg = "";
			msg += "," +map.get("name");
			msg += "," +map.get("kor");
			msg += "," +map.get("eng");
			msg += "," +map.get("mat");
			msg += "," +map.get("tot");
			msg += "," +map.get("avg");
			
			
			
			System.out.println(msg.substring(1));
			
		}

	}

}
