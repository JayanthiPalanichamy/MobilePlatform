public class Camera {
    private double resolution;
    private boolean first;
    private boolean back;

    public Camera(double resolution, boolean first, boolean back) {
        this.resolution = resolution;
        this.first = first;
        this.back = back;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isFirst() {
        return first;
    }

    public boolean isBack() {
        return back;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "resolution=" + resolution +
                ", first=" + first +
                ", back=" + back +
                '}';
    }
}
