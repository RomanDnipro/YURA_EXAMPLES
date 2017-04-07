package april07.adapter;

public class Connection {

    public static void main(String[] args) {

        DVI computer = new DVI();
        VGA monitor = new DviToVga(computer);
        monitor.getPicture();

    }

}
