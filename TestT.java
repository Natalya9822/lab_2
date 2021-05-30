package Market;

import java.util.Arrays;
import java.util.Comparator;

public class TestT {
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet();
        tablet1.setMark ("Apple");
        tablet1.setScreen_diagonal( 10 );
        tablet1.setColor("gold");

        //System.out.println(tablet1.toString());
        Tablet tablet2 = new Tablet();
        tablet2.setMark ("Xiaomi");
        tablet2.setScreen_diagonal( 9 );
        tablet2.setColor("black");
        //System.out.println(tablet2.toString());
        TabletDemo tabletDemo = new TabletDemo(tablet1, tablet2);
        TabletDemo tabletDemo1 = new TabletDemo();
        System.out.println(tabletDemo1.toString());
        System.out.println(tabletDemo.toString());
    }
}


