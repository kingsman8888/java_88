package ch08;
//379page
public class _09_Person {
	
		private String name;
		private int age;
		
		// 생성자 오버로딩 
		
		//디폴트생성자
		public _09_Person(){}
		
		// 이름만 입력받는 매개변수 생성자
		public _09_Person(String name) {
			this.name = name;
		}
		// 이름 나이를 입력받는 매개병수생성자 
		public _09_Person(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
