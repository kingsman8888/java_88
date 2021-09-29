package test;
public class _20_Student{ // 이름,점수정보 
	
	 private String name;
   	 private int score;
   	 
   	public _20_Student () {} // 디폴트 생성자 않넣음

	public _20_Student(String name, int score){
		this.score = score;
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}

 	  // Student  출력정보
  	public void printStudentInfo() {
		System.out.println("이름 : " + name + ", 점수 : " + score);
	}

}