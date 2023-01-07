public class Car {
    private String name;
    private String brand;
    private int year;
    private int total_distance;
    public Car (String name, String brand, int year, int total_distance) {
        this.name=name;
        this.brand=brand;
        this.year=year;
        this.total_distance=total_distance;
    }
    public void install_name (String name) {
        this.name=name;
    }
    public String return_name() {
        return this.name;
    }

    public void install_brand (String brand) {
        this.brand=brand;
    }
    public String return_brand() {
        return this.brand;
    }

    public void install_year (int year) {
        this.year=year;
    }
    public int return_year() {
        return this.year;
    }

    public void install_total_distance (int total_distance) {
        this.total_distance=total_distance;
    }
    public int return_total_distance() {
        return this.total_distance
    }

    public void trip (int x) {
        this.total_distance=this.total_distance+x;
    }
}