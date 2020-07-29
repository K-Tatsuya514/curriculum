package study;

import java.util.Date;

public class monthTest {

    public static void main(String[] args) {

        for(int i = 0; i <= 12; i++) {
            if(i == 0) {
                continue;
            }
            System.out.printf("%02d", i);
        }

        System.out.println("");

        Date date = new Date();
        System.out.println(date);
        System.out.printf("%tY年%<tB%<te日(%<ta)%<tp%<tI時%<tM分", date);

    }

}
