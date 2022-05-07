/*3
Create an ArrayList which will be able to store only numbers like int,float,double,etc, but not any 
other data typ*/



class Test<T extends Number>{
    T i;
    void set(T x){
        i=x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }

}
 class Assignment3 {
    public static void main(String[] args) {
          Test<Integer> t1=new Test<>();
    
      t1.set(100);
    
      t1.show();
      Test<Float> t2=new Test<>();
      t2.set(1.10f);
      t2.show();
       Test<Double> t3=new Test<>();
      t3.set(1.101021);
      t3.show();
      
      // Test<Short> t4=new Test<>();
      //t4.set(-1);
     // t4.show();
      // Test<Long> t5=new Test<>();
     // t5.set(10000000);
    //  t5.show();
       //Test<Byte> t6=new Test<>();
      //t6.set(2);
      //t6.show();
      
    }
}
