package interfaceinfo;

/*

instanceof means if we are creating an object of Sai it indirectly creating an object of interface P.when the class is implementing P

 */
public class MarkerInterfaceInfo {
    public static void main(String[] args) {

        Sai obj = new Sai();


        if (obj instanceof P)
            obj.show();
        else
            System.out.println("no permission");


    }
}

class Sai implements P {
    void show() {
        System.out.println("SAI KUMAR BANDIGI");
    }
}


interface P {

}

