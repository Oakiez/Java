public class Main2 {
    public static void main(String[] args){
        Parent myParent = new Parent("000000","Mommy","Khon Kaen");
        Child myChild = new Child("673380425-2","Wongsathon Thanayod",
                                "Khon Kaen","Oak","KKU");
        
        System.out.println("===== Parent =====");
        myParent.showPersonalInfo();
        
        System.out.println();
        System.out.println("===== Child =====");
        myChild.showPersonalInfo();

    }
}
