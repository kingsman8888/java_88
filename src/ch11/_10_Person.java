package ch11;

import java.io.Serializable;

public class _10_Person implements Serializable {

	
	private static final long serialVersionUID = 123456789L;

	private String name;
	private String job;

	public _10_Person() {
	}

	public _10_Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 직업 : " + job;
	}
}
