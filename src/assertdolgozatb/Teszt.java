package assertdolgozatb;
//k.l.
public class Teszt {
    public void assertEgyformaSzavak() {
        // ekv. osztályok tesztelése
        Fuggvenyek fuggvenyek = new Fuggvenyek();
        String[] szavak1 = {"Anna", "Kitti", "Sári"};
        assert fuggvenyek.egyformaSzavak(szavak1).equals("") : "Hiba: Az eredmény nm üres.";
        String[] szavak2 = {"körte", "alma", "1111"};
        assert fuggvenyek.egyformaSzavak(szavak2).equals("alma") : "Hiba: Az eredmény nem 'alma'.";
        String[] szavak3 = {"teszt", "", "", "1111"};
        assert fuggvenyek.egyformaSzavak(szavak3).equals("") : "Hiba:Az eredmény nm üres.";
    }
}