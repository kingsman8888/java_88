package test;

public class _11_StudentInfo{
	public static void main(String[] agrs){

	_11_Student[] student = new _11_Student[5];  // 세미콜론 빼먹음

	student[0] = new _11_Student("202101","김병현",42,"야구");
	student[1] = new _11_Student("202102","박찬호",48,"골프");
	student[2] = new _11_Student("202103","유희관",35,"방송");
	student[3] = new _11_Student("202104","최희섭",39,"축구");
	student[4] = new _11_Student("202105","이용규",36,"운전");


	for (int i = 0; i<student.length; i++){
		student[i].showInfo();
	}
	

	
	
	

}



}