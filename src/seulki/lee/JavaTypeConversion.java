package seulki.lee;

public class JavaTypeConversion {
    public static void main(String[] args) {
        String slat = " 37.52127     ";
        // String slat = "hello";
        // 공벡제거 후 double 타입으로 변환. trim()은 양쪽 공백을 제거
        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}
