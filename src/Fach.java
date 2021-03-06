import java.util.*;


public class Fach {
    private String name;
    private int wochenstunden;                                               //Laut UML Diagramm haben alle Schulstufen die gleiche Stundenanzahl. Lösung z.B. Hashtable key: Schulstufe    value: Wochenstundenanzahl
    private Raumtyp raumanforderung;
    private Set<Klasse> klasse = new LinkedHashSet<Klasse>();                     //Kein TreeSet, da kein Komparator vorhanden      LinedHashSet, um doppelte speicherung zu vermeiden, sowie Einfügereinfolge zu behalten
    private Set<Lehrer> lehrer = new LinkedHashSet<Lehrer>();                     // - || -
    private List<Belegung> belegung = new LinkedList<Belegung>();

    public Fach(String nam, int wochenstd, Raumtyp raum, Set<Klasse> klas, Set<Lehrer> leh, Set<Belegung> bel){
        name = nam;
        wochenstunden = wochenstd;
        raumanforderung=raum;
        klasse.addAll(klas);
        lehrer.addAll(leh);
        belegung.addAll(bel);
    }

    public String getName() {
        return name;
    }

    public int getWochenstunden() {
        return wochenstunden;
    }

    public void addKlasse(Klasse adding) {
        klasse.add(adding);
    }

    public void deleteKlasse(Klasse removing) {
        klasse.remove(removing);
    }

    public Raumtyp getRaumanforderung() {
        return raumanforderung;
    }

    public void addLehrer(Lehrer adding) {
        lehrer.add(adding);
    }

    public void deleteLehrer(Lehrer removing) {
        lehrer.remove(removing);
    }

    public void addBelegung(Belegung bel) {
        belegung.add(bel);
    }

    public List<Belegung> getBelegung() {
        return belegung;
    }

    public void removeBelegung(Belegung toRemove) {
        belegung.remove(toRemove);
    }
}
