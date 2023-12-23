package practise_stream;

interface Main1 {

    void show();

}


public class Lambda {
    public static void main(String[] args) {


        Main1 obj = () -> {
            System.out.println("show method called..");
        };

        obj.show();

    }
}
