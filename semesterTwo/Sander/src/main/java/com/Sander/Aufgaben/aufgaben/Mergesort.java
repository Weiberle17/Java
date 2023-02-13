package aufgaben;

public class Mergesort {
    public static void main(String[] args) {
        int i,ia,ib,ic;
        // Felder werden durch Zuweisen von Zahlen initialisiert
        // Einlesen ueber Tastatur geht natuerlich auch!
        int a[]= {11,13,15,17,19};
        int b[]= {2,4,6,8,10};
        int c[] = new int[10];
        // Ausgabe der zu sortierenden Felder
        for (ia=0;ia<5;ia++) {
            System.out.printf("%d ",a[ia]);
        }
            System.out.printf("\n");
        for (ib=0;ib<5;ib++) {
            System.out.printf("%d ",b[ib]);
        }
            System.out.printf("\n");
        // Durchlaufe beide Felder, vergleiche aktuelle Elemente
        // schreibe das kleinere nach Feld c
        // lies von dem Feld, von dem das kleinere Element kam
        // das naechste Element
        // Vorsicht, falls ein Feld komplett abgearbeitet ist
        // Dann muss der Rest des noch nicht vollstaendig abgearbeiteten
        // Feldes ins neue Feld c kopiert werden !
        ia=0; 
        ib=0;
        for (ic=0;ic<10;ic++) {
            // Testausgabe, um Fehler zu finden
            System.out.printf("ia:%d(%d) ib:%d(%d)\n",ia,a[ia],ib,b[ib]);
            if (a[ia] < b[ib]) { 
                if (ia<=4) {
                    c[ic]=a[ia];
                }
            ia++;
            } else { 
                if (ib<=4) {
                    c[ic]=b[ib];
                }
            ib++;
            }
            System.out.printf("ic:%d(%d)\n",ic,c[ic]);
            // Abbruch der Schleife, falls ein Feld komplett abgearbeitet
            if ((ia==5) || (ib==5)) break;
        }
        // Feld a komplett abgearbeitet, kopiere Rest von b nach Feld c
        if ((ia==5) && (ib<=4)) {
            for (i=ib;i<5;i++) { 
                ic++;
                c[ic]=b[i];
            }
        }
        // Feld b komplett abgearbeitet, kopiere Rest von a nach Feld c
        if ((ib==5) && (ia<=4))
            for (i=ia;i<5;i++) {
                ic++;
                c[ic]=a[i];
            }
        // Testausgabe
        System.out.printf("ia: %d, ib: %d, ic: %d\n",ia,ib,ic);
        // Ausgabe der sortierten Zahlenfolge
        for (ic=0;ic<10;ic++) {
            System.out.printf("%d ",c[ic]);
        }
    System.out.printf("\n");
    }
}