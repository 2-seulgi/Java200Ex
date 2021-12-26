package seulki.lee;

public class Letters {
    public static void main(String[] args) {
        char a = '닳';
        String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
        int letternum = letter.length();
        int loc = letter.indexOf(a);
        System.out.printf("\"%s\"=> %d자이며, '%c'는 %d번째 있다.\n", letter,letternum,a,loc);
        System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letter,loc,a);
    }
}
