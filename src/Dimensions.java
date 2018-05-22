public class Dimensions {
    private int length;
    private int breadth;
    private int width;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getWidth() {
        return width;
    }

    public Dimensions(int length, int breadth, int width) {
        this.length = length;
        this.breadth = breadth;
        this.width = width;

    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", width=" + width +
                '}';
    }
}
