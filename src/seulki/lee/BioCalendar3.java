package seulki.lee;
// non-static 메서드(멤버)
public class BioCalendar3 {
    public static final int PHYSICAL = 23;
    //멤버 메서드 선언 - new를 사용해 객체를 생성해야한다.
    public double getBioRhythm(long days, int index, int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }

    public static void main(String[] args) {
        int days = 1200;
        BioCalendar3 bio3 = new BioCalendar3(); //객체 생성
        //멤버 메서드 호출
        double phyval = bio3.getBioRhythm(days,PHYSICAL,100);
        System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);

    }
}
