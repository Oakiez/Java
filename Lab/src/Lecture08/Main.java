// 673380425-2 นายวงศธร ธน.ยอด
package Lecture08;

public class Main {
    public static void main(String[] args){
        Company myCompany = new Company("Oak Co.,","673380425-2");
        myCompany.add(new Manager(001,"Mark",200));
        myCompany.add(new Developer(002,"Kom",200));
        myCompany.add(new Tester(003,"Notch",250));
        
        System.out.format("Company Name : %s\n",myCompany.getName());
        System.out.format("Company Tel : %s\n",myCompany.getTel());
        myCompany.showAllEmployee();
    }
}
