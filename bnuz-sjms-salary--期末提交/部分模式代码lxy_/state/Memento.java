package lxy_.state;

/**
 * @author ChristinaXinny
 * @create 2021-06-06 4:33 下午
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
