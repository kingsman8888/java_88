package test; // 오타

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;  //  빼먹음

	public class _19_StudentInfo{

	public static void main(String[] args){   // String 오타
	
	HashMap <String, _19_Student> stu = new HashMap<String, _19_Student>();


	stu.put("101",new _19_Student("101", "김수현", "kim@gmail.com"));
	stu.put("102",new _19_Student("102", "정우성", "jung@daum.com"));
	stu.put("103",new _19_Student("103", "오종혁", "oh@naver.com"));

	
	System.out.println("====Entry=====");
	
	// 1명변경
	stu.put("103",new _19_Student("103", "김동현", "kim@naver.com"));

	// 1명삭제
	stu.remove("102");

	// 1명 추가
	stu.put("104",new _19_Student("104", "아이유", "iu@daum.com"));

	for (Map.Entry<String, _19_Student> aa : stu.entrySet()){
		String key = aa.getKey();
		_19_Student value = aa.getValue(); // value 담는 값을 String으로 넣음

		System.out.println(key + value);
	}

	// 3) iterator를 이용한 출력 
	
	System.out.println("===iterator====");
	
	stu.put("105",new _19_Student("105", "강수현", "kang@gmail.com"));
	stu.put("106",new _19_Student("106", "이지혜", "lee@nate.com"));
	stu.put("107",new _19_Student("107", "추신수", "choo@lycos.com"));	

	stu.remove("106");

	Iterator<String> ir = stu.keySet().iterator();  // keySet 빼먹음
	
	while(ir.hasNext()){  // ) 빼먹음

		 String student = ir.next();
		 _19_Student stud= stu.get(student);  // 키값을 넣을 곳을 빼먹음

		System.out.print(stud + " ");
		System.out.println(" ");
	}
	}
}