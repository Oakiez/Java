package Lab06;

public class Child extends Parent{
	private String nickname;
	private String university;
	
	public Child() {super();};
	public Child(String id, String name, String city, String nickname, String university) {
		super(id,name,city);
		this.nickname = nickname;
		this.university = university;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	public String getUniversity() {
		return this.university;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	
	@Override
	public void showPersonalInfo(){
		super.showPersonalInfo();
		
		System.out.println("\t Nicknamme: " + this.nickname);
		System.out.println("\t University: " + this.university);
	}
}
