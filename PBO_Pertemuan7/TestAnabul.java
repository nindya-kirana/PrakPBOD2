import java.util.ArrayList;
public class TestAnabul {
    public static void main(String[] args) {
        Anabul a1= new Kucing();
        Anabul a2 = new Anjing();
        Anabul a3 = new Burung();

        ArrayList<Anabul> h = new ArrayList<>();
        h.add(a1);
        h.add(a2);
        h.add(a3);

        for (Anabul hewan : h) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println("=================================");
        }
    }
}
