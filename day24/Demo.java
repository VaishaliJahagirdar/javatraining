//EXAMPLE OF FACTORY DESIGN PATTERN
//ASSIGNMENT NO.2


abstract class Mobile{

    abstract void calculatePrise();
}
class Apple extends Mobile{

    @Override
    void calculatePrise() {
       System.out.println("Calculate cost of Apple mobile"); 
    }
    
}
class OnePluse extends Mobile{

    @Override
    void calculatePrise() {
       System.out.println("Calculate cost of Onepluse mobile"); 
    }
    
}
class MobileFactory{
    static Mobile getAccount(String type){
        Mobile obj=null;
        if(type.equalsIgnoreCase("Apple")){
            obj=new Apple();
        }else if (type.equalsIgnoreCase("Onepluse")){
            obj=new OnePluse();
        }

        return obj;
    }
}
 class Demo {
public static void main(String[] args) {

    Mobile ob1=MobileFactory.getAccount("Apple");
    
    Mobile ob2=MobileFactory.getAccount("OnePluse");
    ob1.calculatePrise();
    ob2.calculatePrise();
}    
}
