import java.util.ArrayList;

public class ListOfEmployess {
    String fname,sname,email,period,phonenumber,salary;

    public ListOfEmployess(String fname, String sname, String email, String period, String phonenumber, String salary) {
        this.fname = fname;
        this.sname = sname;
        this.email = email;
        this.period = period;
        this.phonenumber = phonenumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ListOfEmployess{" +
                "fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", period='" + period + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<ListOfEmployess>Employees;
        Employees=new ArrayList<>();

        ListOfEmployess emp1=new ListOfEmployess("liz","lung'ania","@liz.com","2 years","0799023456","100000");
        ListOfEmployess emp2=new ListOfEmployess("Tina","Mulaku","@mulaku.com","1 year","0799023556","95000");
        ListOfEmployess emp3=new ListOfEmployess("Brian","Wamlambez","@wamlambez.com","2 years","0799023458","50000");
        ListOfEmployess emp4=new ListOfEmployess("Jane","Doe","@jane.com","10 months","0799023356","67000");
        ListOfEmployess emp5=new ListOfEmployess("John","Doe","@doe.com","2 years","0799021256","230000");
        ListOfEmployess emp6=new ListOfEmployess("liz","Semerian","@semerian.com","1 years 8 months","0799028956","840000");
        ListOfEmployess emp7=new ListOfEmployess("Rose","Enane","@enane.com","1.5 years","0799024556","70000");
        ListOfEmployess emp8=new ListOfEmployess("Joy","line","@line.com","5 months","0756023456","40000");
        ListOfEmployess emp9=new ListOfEmployess("eric","mugure","@mugure.com","8 months","0706023456","60000");
        ListOfEmployess emp10=new ListOfEmployess("berit","chanzu","@chanzu.com","2 months","0879023456","20000");

        Employees.add(emp1);
        Employees.add(emp2);
        Employees.add(emp3);
        Employees.add(emp4);
        Employees.add(emp5);
        Employees.add(emp6);
        Employees.add(emp7);
        Employees.add(emp8);
        Employees.add(emp9);
        Employees.add(emp10);

        System.out.println(Employees.toString());
    }
}
