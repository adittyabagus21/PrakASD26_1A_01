public class SortingMain01 {
    public static void main(String[] args) {

        int[] a = {20, 10, 2, 7, 12};

        Sorting01 dataurutan1 = new Sorting01(a, a.length);

        System.out.println("Data awal:");
        dataurutan1.tampil();
        dataurutan1.bubbleSort();

        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurutan1.tampil();
    }
}