public class SortingMain01 {
    public static void main(String[] args) {

        int[] a = {20, 10, 2, 7, 12};
        Sorting01 dataurutan1 = new Sorting01(a, a.length);

        System.out.println("Data awal:");
        dataurutan1.tampil();
        
        dataurutan1.bubbleSort();
        System.out.println("Data setelah Bubble Sort:");
        dataurutan1.tampil();

        int[] b = {30, 20, 2, 8, 14};
        Sorting01 dataurutan2 = new Sorting01(b, b.length);

        System.out.println("\nData awal 2:");
        dataurutan2.tampil();

        dataurutan2.selectionSort();

        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC):");
        dataurutan2.tampil();
    }
}