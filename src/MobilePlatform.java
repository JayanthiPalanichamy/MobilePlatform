import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MobilePlatform {
    List<Mobile> mobileArrayList;

    public MobilePlatform(List<Mobile> mobileArrayList) {
        this.mobileArrayList = mobileArrayList;
    }

    public List<Mobile> getMobileArrayList() {
        return mobileArrayList;
    }

    public List<Mobile> filterByOs(String os) {
        return mobileArrayList.stream().filter(x -> x.getOs().equals(os)).collect(Collectors.toList());
    }

    public List<Mobile> filterByBrand(String brand) {
        return mobileArrayList.stream().filter(x -> x.getBrand().equals(brand)).collect(Collectors.toList());
    }

    public List<Mobile> filterByPriceRange(double min, double max) {
        return mobileArrayList.stream().filter(x -> x.getPrice() >= min && x.getPrice() <= max).collect(Collectors.toList());
    }

    public long totalProductsByBrand(String brand) {
        return mobileArrayList.stream().filter(x -> x.getBrand().equals(brand)).count();
    }

    public List<Mobile> sortByPrice() {
        return mobileArrayList.stream().sorted(Comparator.comparingDouble(Mobile::getEffectivePrice)).collect(Collectors.toList());
    }

    public List<Mobile> mobilesWithWidthLessThan(int width) {
        return mobileArrayList.stream().filter(x -> x.getDimensions().getWidth() < width).collect(Collectors.toList());
    }

    public List<Mobile> mobilesWithBackCameraResolutionMoreThan(int resolution) {
        return mobileArrayList.stream().filter(x-> x.getCameraList().stream().filter(y->y.isBack() && y.getResolution()> resolution).count() >0).collect(Collectors.toList());
    }

}
