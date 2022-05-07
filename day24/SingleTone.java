//SINGLETONE EXAMPLE:
//ASSIGNMENT 1:

class Refrigirator{
    static Refrigirator obj=null;
    static int member;
    private Refrigirator(){
        member=0;
    }
    static synchronized Refrigirator getInstance(){
        if(obj==null){
            obj=new Refrigirator();
            System.out.println("Objcet created as refrigirator");
        }
        member++;
        System.out.println("family members is "+member);
        return obj;
    }

}
 class SingleTone {

    public static void main(String[] args) {
        Refrigirator r1= Refrigirator.getInstance();
        Refrigirator r2= Refrigirator.getInstance();
        Refrigirator r3= Refrigirator.getInstance();
        Refrigirator r4= Refrigirator.getInstance();
        Refrigirator r5= Refrigirator.getInstance();
            }
}
