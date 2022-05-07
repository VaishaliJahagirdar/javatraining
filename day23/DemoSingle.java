	//This code demonstrates how the Singleton pattern can be used to create a counter to
//provide unique sequential numbers, such as might be required for use as primary keys in a
//database
class Sequence {
    static int counter;
    static Sequence obj = null;
    private Sequence() {
        counter = 0;
    }
    static synchronized Sequence getInstance() {
        if (obj == null) {
            obj = new Sequence();
        }
        return obj;
    }
    static synchronized int getCount(){
        counter++;
        return counter;
    }
}
public class DemoSingle {
    public static void main(String[] args) {
        Sequence s=Sequence.getInstance();

    }
}
