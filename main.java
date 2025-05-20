
interface USB{
    void connect();
    void unconnect();
}
class Mouse implements USB{
    public void connect(){
        System.out.println("키보드 연결");
    }
}
class Keyboard implements USB{
    public void connect(){
        System.out.println("키보드를 연결합니다");
    }
}
public class main{
    public static void main(String[] args) {
        USB device = new Mouse();
        device.connect();
    }
}





