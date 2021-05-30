package Market;

import java.util.Arrays;
import java.util.Comparator;

public class TabletDemo {
    private Tablet[] New = new Tablet[3];

    public TabletDemo(Tablet aNew, Tablet aNew1) {
        New[0] = aNew;
        New[1] = aNew1;
    }

    public TabletDemo() {
        Tablet tablet1 = new Tablet();
        tablet1.setMark("Apple");
        tablet1.setScreen_diagonal( 10 );
        tablet1.setColor("pink_gold");
        Tablet tablet2 = new Tablet();
        tablet2.setMark ("Sumsung");
        tablet2.setScreen_diagonal( 8 );
        tablet2.setColor ("black");
        Tablet tablet3 = new Tablet();
        tablet3.setMark("Lenovo");
        tablet3.setScreen_diagonal(10);
        tablet3.setColor("silver");
        New[0] = tablet1;
        New[1] = tablet2;
        New[2] = tablet3;

        Arrays.sort(New,new SortByMark());

    }

    public Tablet[] getNew() {
        return New;
    }

    public void setNew(Tablet[] aNew) {
        New = aNew;
    }

    @Override
    public String toString() {
        return "TabletDemo{" +
                "New=" + Arrays.toString(New) +
                '}';
    }
    class SortByMark implements Comparator<Tablet> {
        @Override
        public int compare(Tablet a, Tablet b) {
            return a.getMark().compareTo(b.getMark());

        }
    }
}

