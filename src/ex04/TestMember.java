package ex04;

class Member {
	//Field 는 전부 private
	// access modifier (public, private, protected, package) 를 안 붙이면 package level 이다
	// package level 변수 : 같은 폴더에서 변수 공유
	private int id;
	private String name;
	private String email;
	
	
	//Constructor
	public Member() {
		
	}
	
	public Member(int id, String name, String email) {
	 // 기본 생성자 Member() 호출함 this : 나 자신
	//super(); // super : 부모클래스 -> parent, super() : 부모 클래스 기본 생성자 호출
	this.id = id;
	this.name = name;
	this.email = email;
	}

	// override methods
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	// Setter 함수 : 외부 클래스에서 내부 Field 에 값을 넣는 방법
	// Getter 	  : 외부 클래스로 내부 Field 의 값을 내보내는 방법
	
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

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



} // class end
public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId(1);
		m1.setName("박찬호");
		m1.setEmail("parkch@lotte.com");
		System.out.println(m1);
		
		String name1 = m1.getName();
		System.out.println("m1의 이름:" + m1.getId());
		
		Member m2 = new Member(2, "강호동", "kanghd@lg.com");
		System.out.println(m2);
		m2.setEmail("kanghd@samsung.com");
		//m2.email = "kanghd@samsung.com"; // not visible
		System.out.println(m2);
		System.out.println("m2의 이름: " + m2.getId());
		System.out.println("m2의 이름: " + m2.getName());
		System.out.println("m2의 이름: " + m2.getEmail());

	}

}
