public class SortingMain01 {
    public static void main(String[] args) {

        int[] a = {20, 10, 2, 7, 12};
        Sorting01 dataurutan1 = new Sorting01(a, a.length);

        System.out.println("Data awal:");
        dataurutan1.tampil();
        dataurutan1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan Bubble Sort:");
        dataurutan1.tampil();

        int[] b = {30, 20, 2, 8, 14};
        Sorting01 dataurutan2 = new Sorting01(b, b.length);

        System.out.println("\nData awal 2:");
        dataurutan2.tampil();
        dataurutan2.selectionSort();
        System.out.println("Data sudah diurutkan dengan Selection Sort:");
        dataurutan2.tampil();

        int[] c = {40, 10, 4, 9, 3};
        Sorting01 dataurutan3 = new Sorting01(c, c.length);

        System.out.println("\nData awal 3:");
        dataurutan3.tampil();
        dataurutan3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC):");
        dataurutan3.tampil();
    }
}