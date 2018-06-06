import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MobilePlatform {
    List<Mobile> mobileList;

    public MobilePlatform(List<Mobile> mobileList) {
        this.mobileList = mobileList;
    }

    public List<Mobile> filterByOs(String os) {
        return mobileList.stream().filter(mobile -> os.equals(mobile.getBrand())).collect(Collectors.toList());
    }

    public List<Mobile> filterByBrand(String brand) {
        return mobileList.stream().filter(mobile -> brand.equals(mobile.getBrand())).collect(Collectors.toList());
    }

    public List<Mobile> filterByPriceRange(double min, double max) {
        return mobileList.stream().filter(mobile -> mobile.getPrice() >= min && mobile.getPrice() <= max).collect(Collectors.toList());
    }

    public long totalProductsByBrand(String brand) {
        return mobileList.stream().filter(mobile -> brand.equals(mobile.getBrand())).count();
    }

    public List<Mobile> sortByPrice() {
        return mobileList.stream().sorted(Comparator.comparingDouble(Mobile::getEffectivePrice)).collect(Collectors.toList());
    }

    public List<Mobile> mobilesWithWidthLessThan(int width) {
        return mobileList.stream().filter(mobile -> mobile.getDimensions().getWidth() < width).collect(Collectors.toList());
    }

    public List<Mobile> mobilesWithBackCameraResolutionMoreThan(int resolution) {
        return mobileList.stream().filter(mobile -> mobile.getCameraList().stream().filter(y -> y.isBack() && y.getResolution() > resolution).count() > 0).collect(Collectors.toList());
    }

}
