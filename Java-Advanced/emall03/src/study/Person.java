package study;

public class Person {
	private int id = 20191004;
	private String name = "김수연";
	public Person() { // 빈 생성자
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}

// 게터, 세터, 생성자