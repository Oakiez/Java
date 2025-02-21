// 673380425-2 นายวงศธร ธน.ยอด Section 4
package Lab11.AllTask;

import java.util.*;

public class Company {
    private int id;
    private String companyName;

    public Company(){}
    public Company(int id, String companyName){
        this.id = id;
        this.companyName = companyName;
        List<String> departments = new ArrayList<>();
    }

    public int getId(){
        return this.id;
    }
    public String getCompanyName(){
        return this.companyName;
    }
}
