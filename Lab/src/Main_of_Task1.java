public class Main2 {
    public static void main(String[] args){
        Parent myParent = new Parent("673380425-2","Mommy","Khon Kaen");
        Child myChild = new Child("673380425-2","Mommy",
                                "Khon Kaen","Oak","KKU");
        
        System.out.println();
        myParent.showPersonalInfo();

        System.out.println();
        myChild.showPersonalInfo();

    }
}
