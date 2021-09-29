package ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _10_SeriallizationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * 550page 직렬화 - 인스턴스의 정보를 그대로 저장하거나 네트워크를 통해 전송 - 인스턴스의 내용(인스턴스 변수값)을 연속 스트림으로
		 * 만드는 것이다. - 스트림으로 만들어야 파일에 쓸수 있고, 네트워크 전송 할 수 있다. - implements Serializable :
		 * 직렬화 구현내용을 명시한다. - transient : 해당 인스턴스의 해당 변수는 직렬화 되고 복원되는 과정에서 제외된다.
		 * 
		 * 역직렬화 - 저장된 인스턴스 정보를 출력한다.
		 * 
		 */

		_10_Person yoo = new _10_Person("유치훈", "대표이사");
		_10_Person cho = new _10_Person("추신수", "상무이사");

		// FileOutStream 바이트 단위로 파일에 자료를 쓴다.

		FileOutputStream fos;
		try {
			fos = new FileOutputStream("E:\\Dev88\\fileTest\\10_serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(yoo);
			oos.writeObject(cho);

			FileInputStream fis = new FileInputStream("E:\\Dev88\\fileTest\\10_serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			_10_Person per1 = (_10_Person) ois.readObject();
			_10_Person per2 = (_10_Person) ois.readObject();

			System.out.println(per1);
			System.out.println(per2);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		System.out.println("종료 ");

	}

}
