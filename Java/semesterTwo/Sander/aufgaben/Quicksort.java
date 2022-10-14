package aufgaben;

public class Quicksort {

    private void qsort(int[] daten, int links, int rechts) {
        if (links < rechts) {
            for (int i = links; i <= rechts; i++) {
                int l = links;
                int r = rechts;
                int x = daten[(links + rechts) / 2];
                while (l < r) {
                    while (daten[l] < x) { l++; }
                    while (daten[r] > x) { r--; }
                    if (l <= r) {
                        swap(daten, l, r);
                        l++;
                        r--;
                    }
                }
                qsort(daten, links, r);
                qsort(daten, l, rechts);
            }
        }
    }

    private void swap (int[] liste, int pos1, int pos2) {
        int l1 = liste[pos1];
        int l2 = liste[pos2];
        liste[pos1] = l2;
        liste[pos2] = l1;
    }

    public static void main(String[] args) {
        Quicksort q1 = new Quicksort();
        int[] zahlen = {8, 4, 2, 5, 7, 9, 0, 3, 6};
        int n = zahlen.length;

        q1.qsort(zahlen, 0, n-1);

        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i]);
            if (i < zahlen.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}