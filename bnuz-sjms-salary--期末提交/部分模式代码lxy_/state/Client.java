package lxy_.state;

/**
 * @author ChristinaXinny
 * @create 2021-06-06 4:32 下午
 */
public class Client {
    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker();

    public static void main(String[] args) {
        o.setState("On");
        c.saveMemento(o.createMemento());
        o.setState("Off");
        // Restore saved state
        o.restoreMemento(c.retrieveMemento());
    }

}
