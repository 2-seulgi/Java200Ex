package seulki.lee;
// 사용자 정의 클래스 - 파일명과 다르기 때문에 public 사용x
class JLocation{
    public double lat; // 0.0으로 초기화
    public double lng; // 0.0으로 초기화
}
public class JavaUserDefinedType {
    public static void main(String[] args) {
        double latitude = 37.5212;
        double longitude = 127.0074;

        /**
        사용자 정의 객체를 생성함.
        JLocation 타입의 JLocation생성하고 jloc으로 호출
         */
        JLocation jloc = new JLocation();
        jloc.lat = latitude; // 값을 대입
        jloc.lng = longitude; // 값을 대입

        JLocation newLoc = jloc; // 객체를 대입
        System.out.println(newLoc.lat);
    }
}
