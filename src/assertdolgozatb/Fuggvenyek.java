package assertdolgozatb;
//k.l.
public class Fuggvenyek {
    //a lista alapján adja meg az elsőt, ami egyforma hosszú az előtte lévővel, ha nincs üreset.
    //szolista a tömb, a return az első, vagy üres szöveg lesz.
    public String egyformaSzavak(String[] szolista) {
        for (int i = 0; i < szolista.length - 1; i++) {
            String curr = szolista[i];
            String kov = szolista[i + 1];
            if (curr.length() == kov.length()) {
                return curr;
            }
        }
        return "";
    }
}