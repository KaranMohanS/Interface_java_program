public class interfacedemo {
    public static void main(String[] args) {
     employe ob=new employe();
     ob.softwaredev();
     ob.softwaredevname();
     ob.softwaredevsalary();
     ob.hardwaredev();
     ob.hardwaredevname();
     ob.hardwaredevsalary();
        
    }
    
}
interface company{
    abstract void softwaredev();  //abstract method
    abstract void hardwaredev();  //declaration
}
class employe implements company{
    public void softwaredev(){          //overriding
        System.out.println("developing software");  //definition
    }
    public void softwaredevname(){
        System.out.println("name - karan");
    }
        void softwaredevsalary(){
            System.out.println("salary - 60000");

        }
    
    public void hardwaredev(){
        System.out.println("developing hardware");
    }
    public void hardwaredevname(){
        System.out.println("name - mohan");
    }
    void hardwaredevsalary(){
        System.out.println("salary - 30000");

    }
      
    
}
