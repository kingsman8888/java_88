package test;
public class _06_Worker {
	
	// 멤버변수
		private int sabun;
		private String name;
		private int age;

		// 기본 생성자 
		public _06_Worker() {}
		
		// 매개변수 생성자 
		public _06_Worker(int sabun, String name, int age) {
		this.sabun = sabun;
		this.name = name;
		this.age = age;
		}

		//setter 멤버메서드
		public void setSabun(int sabun) {   // void 넣지 않음
		this.sabun = sabun; 
		}
		public void setName(String name) { // void 넣지 않음 name오타
		this.name = name; 
		} 
		public void setAge(int age) {  // void 넣지 않음
		this.age = age; 
		}


		// showInfo(){} 출력
		public void showInfo(){
		System.out.println("사번 : " + sabun);   //System에서 s 소문자로 넣음   
		System.out.println("이름 : " + name);  //System에서 s 소문자로 넣음   //println에서 t 빼먹음
		System.out.println("나이 : " + age);  //System에서 s 소문자로 넣음   //println에서 t 빼먹음
		}
} // 블럭 빼먹음
