import java.util.ArrayList;
import java.util.List;

public class MobileMain {
    public static void main(String[] args) {
        Camera frontCamera = new Camera(8, true, false);
        Camera backCamera = new Camera(12, false, true);
        ArrayList<Camera> cameraArrayList = new ArrayList<>();
        cameraArrayList.add(frontCamera);
        cameraArrayList.add(backCamera);

        Dimensions dimensions = new Dimensions(10, 5, 1);

        Mobile motog4 = new Mobile(1244, "G4 Plus", 12000.0, "Android", 5.0, 2.5, Mobile.Color.RED, "Motorola", 2, 16, true, 5000, cameraArrayList, dimensions);
        Mobile pixel2 = new Mobile(1245, "Pixel 2", 27000.0, "Android", 6.0, 2.2, Mobile.Color.BLACK, "Google", 3, 16, true, 6000, cameraArrayList, dimensions);
        Mobile s3 = new Mobile(1246, "S 3 ", 17000.0, "Android", 5.0, 4.2, Mobile.Color.BLACK, "Samsung", 2, 16, true, 4000, cameraArrayList, dimensions);
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(motog4);
        mobileList.add(pixel2);
        mobileList.add(s3);
        MobilePlatform mobilePlatform = new MobilePlatform(mobileList);
        System.out.println("Android " + mobilePlatform.filterByOs("Android"));
        System.out.println("Price Range " + mobilePlatform.filterByPriceRange(20000.0, 27000.0));
        System.out.println("Price sort " + mobilePlatform.sortByPrice());
        System.out.println("Total no of samsung " + mobilePlatform.totalProductsByBrand("Samsung"));
        System.out.println("Width less than " + mobilePlatform.mobilesWithWidthLessThan(2));
        System.out.println("camera Resolution " + mobilePlatform.mobilesWithBackCameraResolutionMoreThan(10));
        System.out.println("Filter by brand and dimensions width < 2cm "+new MobilePlatform(mobilePlatform.filterByBrand("Google")).mobilesWithWidthLessThan(2));
    }
}