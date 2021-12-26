package seulki.lee;

public class BioCalendar {
    // 상수, 상수값은 변경할 수 없다.
    public static final int PHYSICAL = 23;
    public static void main(String[] args) {
        System.out.println(PHYSICAL);
        int index=PHYSICAL;
        int day = 1200;
        // Math.Pi 3.14에서 정의된 상수
        double vals=(day % index) * 2 * Math.PI / index;
        // System.out.println(vals + "라디안");
        System.out.println(Math.toDegrees(vals)+"도");

    }
}
