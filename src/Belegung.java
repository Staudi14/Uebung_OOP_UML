import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

//Belegung enthält 1 Fach und 1 Raum
//Raum und Fach enthalten Listen auf ihre Belegungen
//Keine unidirectionale verbindung sondern bidirectional, da ansonst kein Lehrer.exportStundenplan() möglich.

//Lehrer hinzugefügt für eindeutige Zuweisung

public class Belegung {
    private int unterrichtsEinheit;
    private Raum raum;
    private Fach fach;
    private DayOfWeek unterrichtsTag;
    private Lehrer lehrer;

    public Belegung(int unterrichtsEinh, Raum rau, Fach fa, DayOfWeek untTag, Lehrer lehr){
        unterrichtsEinheit = unterrichtsEinh;
        raum = rau;
        fach = fa;
        unterrichtsTag = untTag;
        lehrer = lehr;
    }

    public Unterrichtstag getWochentag() {
        String s = unterrichtsTag.getDisplayName(TextStyle.FULL, new Locale("de")).toUpperCase();
        return Unterrichtstag.valueOf(s);
    }

    public Klasse getKlasse() {
        return raum.getKlasse();
    }

    //Everything for UnterrichtsEinheit

    public void setUnterrichtsEinheit() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.parse("7:50")) && time.isBefore(LocalTime.parse("8:40"))) {
            unterrichtsEinheit = 1;
        } else if (time.isAfter(LocalTime.parse("8:40")) && time.isBefore(LocalTime.parse("9:30"))) {
            unterrichtsEinheit = 2;
        } else if (time.isAfter(LocalTime.parse("9:40")) && time.isBefore(LocalTime.parse("10:30"))) {
            unterrichtsEinheit = 3;
        } else if (time.isAfter(LocalTime.parse("10:30")) && time.isBefore(LocalTime.parse("11:20"))) {
            unterrichtsEinheit = 4;
        } else if (time.isAfter(LocalTime.parse("11:20")) && time.isBefore(LocalTime.parse("12:10"))) {
            unterrichtsEinheit = 5;
        } else if (time.isAfter(LocalTime.parse("12:20")) && time.isBefore(LocalTime.parse("13:10"))) {
            unterrichtsEinheit = 6;
        } else if (time.isAfter(LocalTime.parse("13:10")) && time.isBefore(LocalTime.parse("14:00"))) {
            unterrichtsEinheit = 7;
        } else if (time.isAfter(LocalTime.parse("14:00")) && time.isBefore(LocalTime.parse("14:50"))) {
            unterrichtsEinheit = 8;
        } else if (time.isAfter(LocalTime.parse("15:00")) && time.isBefore(LocalTime.parse("15:50"))) {
            unterrichtsEinheit = 9;
        } else if (time.isAfter(LocalTime.parse("15:50")) && time.isBefore(LocalTime.parse("16:40"))) {
            unterrichtsEinheit = 10;
        }


    }

    public void setUnterrichtsEinheit(LocalTime time) {

        if (time.isAfter(LocalTime.parse("7:50")) && time.isBefore(LocalTime.parse("8:40"))) {
            unterrichtsEinheit = 1;
        } else if (time.isAfter(LocalTime.parse("8:40")) && time.isBefore(LocalTime.parse("9:30"))) {
            unterrichtsEinheit = 2;
        } else if (time.isAfter(LocalTime.parse("9:40")) && time.isBefore(LocalTime.parse("10:30"))) {
            unterrichtsEinheit = 3;
        } else if (time.isAfter(LocalTime.parse("10:30")) && time.isBefore(LocalTime.parse("11:20"))) {
            unterrichtsEinheit = 4;
        } else if (time.isAfter(LocalTime.parse("11:20")) && time.isBefore(LocalTime.parse("12:10"))) {
            unterrichtsEinheit = 5;
        } else if (time.isAfter(LocalTime.parse("12:20")) && time.isBefore(LocalTime.parse("13:10"))) {
            unterrichtsEinheit = 6;
        } else if (time.isAfter(LocalTime.parse("13:10")) && time.isBefore(LocalTime.parse("14:00"))) {
            unterrichtsEinheit = 7;
        } else if (time.isAfter(LocalTime.parse("14:00")) && time.isBefore(LocalTime.parse("14:50"))) {
            unterrichtsEinheit = 8;
        } else if (time.isAfter(LocalTime.parse("15:00")) && time.isBefore(LocalTime.parse("15:50"))) {
            unterrichtsEinheit = 9;
        } else if (time.isAfter(LocalTime.parse("15:50")) && time.isBefore(LocalTime.parse("16:40"))) {
            unterrichtsEinheit = 10;
        }


    }

    public void setUnterrichtsEinheit(int i) {
        unterrichtsEinheit = i;
    }

    public int getUnterrichtsEinheit(){
        return unterrichtsEinheit;
    }


    //Everything for Fach
    public void addFach(Fach newFach) {
        fach = newFach;
    }

    public Fach getFach() {
        return fach;
    }


    //Everything for unterrichtsTag
    public void setUnterrichtsTag(DayOfWeek x) {
        unterrichtsTag = x;
    }

    public DayOfWeek getUnterrichtsTag() {
        return unterrichtsTag;
    }

    //Everything for Raum
    public void setRaum(Raum x) {
        raum = x;
    }

    public Raum getRaum() {
        return raum;
    }

    //Everything for Lehrer

    public void setLehrer(Lehrer lehrer) {
        this.lehrer = lehrer;
    }

    public Lehrer getLehrer(){
        return lehrer;
    }
}

//Sinvoller mit DayOfWeek, da diese bereits sinvolle funtionen enthält.
enum Unterrichtstag {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
}

