package test;   // 오타
	public class _19_Student{

	private String studentID;
	private String name;
	private String email;

	

	public _19_Student(String studentID, String name,String email ){ // String 빼먹음
		this.studentID = studentID;
		this.name =  name;
		this.email = email;
	}

	public void setStudentID(String studentID){
		this.studentID = studentID ;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;  //오타
	}
	public String getStudentID(){
		return studentID;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	@Override
	public String toString(){  // void로 만듬 
		return "studentID: " + studentID + ", Name: " + name + ", email" + email; 
		}
}
