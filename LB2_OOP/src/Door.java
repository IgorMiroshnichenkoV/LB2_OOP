public class Door {
    String material;
    int height;
    int width;
    String color;
    boolean open;
    boolean close;

    void open() {
        open = true;
    }

    void close() {
        close = true;
    }

    void paint(String color) {
        this.color = color;
    }

    void size(int height, int width) {
        this.height = height;
        this.width = width;
    }
}
