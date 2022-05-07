interface A {

    void add(int x,int y);
}
class Test implements A{

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }
    
}
 class Demo3 {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.add(10, 20);

        A ob1=new A() {

            @Override
            public void add(int x, int y) {
                System.out.println(x+y);
                
            }
            
        };
        ob1.add(100, 200);
    }
}



@FunctionalInterface
 interface A<T> {
    T add(T x,T y);
}
public class Demo4 {
    public static void main(String[] args) {
    
        A<Integer> ob=(x, y) -> x+y;
        
        System.out.println(ob.add(200, 300));
       
    }
}
