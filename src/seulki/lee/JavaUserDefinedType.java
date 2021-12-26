package seulki.lee;

class JLocation{
    public double lat;
    public double lng;
}
public class JavaUserDefinedType {
    public static void main(String[] args) {
        double latitude = 37.5212;
        double longitude = 127.0074;

        JLocation jloc = new JLocation();
        jloc.lat = latitude;
        jloc.lng = longitude;

        JLocation newLoc = jloc;
        System.out.println(newLoc.lat);
    }
}
