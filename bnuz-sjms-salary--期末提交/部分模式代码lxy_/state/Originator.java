package lxy_.state;

/**
 * @author ChristinaXinny
 * @create 2021-06-06 4:33 下午
 */
public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return "";
    }

    public void setState(String state) {
    }
}

