package topic7;

public class Binaerbaum {

    // Methode zur Berechnung der Höhe des Baums
    public static int hoeheBaum(BaumKnoten wurzel) {
        if (wurzel == null) {
            return 0;
        }
        // Rekursive Berechnung der Höhe des linken und rechten Teilbaums
        int hoeheLinks = hoeheBaum(wurzel.links);
        int hoeheRechts = hoeheBaum(wurzel.rechts);

        // Rückgabe der größeren Höhe plus eins für die aktuelle Ebene
        return Math.max(hoeheLinks, hoeheRechts) + 1;
    }

    public static void main(String[] args) {
        // Erstellen des Baums
        BaumKnoten wurzel = new BaumKnoten(1);
        wurzel.links = new BaumKnoten(2);
        wurzel.rechts = new BaumKnoten(3);
        wurzel.links.links = new BaumKnoten(4);
        wurzel.links.rechts = new BaumKnoten(5);
        wurzel.rechts.links = new BaumKnoten(6);
        wurzel.rechts.rechts = new BaumKnoten(7);

        // Berechnung der Höhe des Baums
        int hoehe = hoeheBaum(wurzel);
        System.out.println("Die Höhe des Baums ist: " + hoehe);
    }
}

