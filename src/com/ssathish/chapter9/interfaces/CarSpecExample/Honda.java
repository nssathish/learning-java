package src.com.ssathish.chapter9.interfaces.CarSpecExample;

public class Honda implements CarSpec {
    @Override
    public int height(String brand) {
        if (brand.equalsIgnoreCase("City")) {
            return 4445;
        }
        return 0;
    }

    @Override
    public int width(String brand) {
        if (brand.equalsIgnoreCase("city")) {
            return 1197;
        }
        return 0;
    }

    @Override
    public void engine(String brand) {
        if (brand.equalsIgnoreCase("city")) {
            System.out.println("i-dTECH");
        }
    }
}
