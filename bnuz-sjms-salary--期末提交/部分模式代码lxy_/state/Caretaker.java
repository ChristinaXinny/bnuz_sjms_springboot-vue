package lxy_.state;

/**
 * @author ChristinaXinny
 * @create 2021-06-06 4:35 下午
 */
public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

}
