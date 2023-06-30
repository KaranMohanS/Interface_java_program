public class multipleinheritance {
    public static void main(String[] args) {
        employe ob=new employe();
        ob.companyname();
        ob.branchname();
        ob.managername();
        ob.employenme();
        ob.empolyesalary();

    }
    
}
interface company{      //parent class
    abstract void companyname();
}
interface branch{      //parent class
    abstract void branchname();
}
interface manager{     //parent class
    abstract void managername();
}
class employe implements company,branch,manager{   //child class
    public void companyname(){
        System.out.println("companyname - ZOHO");
    }
    public void branchname(){
        System.out.println("branch - Coimbatore");
    }
    public void managername(){
        System.out.println("managername - sri");
    }
    public void employenme(){
        System.out.println("employename - karan");
    }
    public void empolyesalary(){
        System.out.println("salary - 30000");
    }
}