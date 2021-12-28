package seulki.lee;

public class BioCalendar2 {
    public static final int PHYSICAL = 23;

        // double phyval = 100*Math.sin((days%index)*Math.PI/index);
        // static 메서드 선언 - 객체생성 없이 호출 가능
        public static double getBioRhythm(long days, int index, int max) {
            return max * Math.sin((days % index) * 2 * Math.PI / index);
        }

    public static void main(String[] args) {
            int days = 1200;
            double phyval = getBioRhythm(days, PHYSICAL, 100);
            System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
    }
}
