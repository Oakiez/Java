public class Child extends Parent{
    //---- Attributes
    private String nickname;
    String university;
    
    //---- Constructors
    public Child(){ super();}
    public Child(String securityID, String name, String city,String nickname, String university){
        super(securityID,name,city);
        this.nickname = nickname;
        this.university = university;
    }

    //---- Getters/Setters
    public String getNickname(){
        return this.nickname;
    }
    public String getUString(){
        return this.university;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setUniversity(String university){
        this.university = university;
    }

    //---- Methods
    public void showPersonalInfo(){
        System.out.println("Print from Child >> ...");
		System.out.println("\t Nickname: " + this.nickname);
		System.out.println("\t university: " + this.university);
    }


}
