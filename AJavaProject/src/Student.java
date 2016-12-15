public class Student extends Person {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1266532679991812877L;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}
}
