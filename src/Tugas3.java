public class Tugas3 {
    public static void main(String[] args) {
   int[] Bilangan ={1,9,8,7,6,5,4,45,67,86,56,34,46,76,67,82,54,2,11,12,13,45,78,98,67,56,43,90,99,87,67,67,55,44,81,79,80,10,90,60,40,30,33,44,45,23,12,13,16,19};
        System.out.println("Jumlah Nilai dalam Array ini = " + Bilangan.length);// untuk mengatahui banyaknya nilai pada array
        System.out.println("Daftar tidak berurutan dari array saya");
        displayValues (Bilangan);// menampilkan nilai awal
        selectionSort (Bilangan);// mengurutkan nilai dari terkecil
        displayValues (Bilangan);// menampilkan nilai yang sudah di urutkan
}
    static void selectionSort (int [] Bilangan){
        int indexMin = 0;
        for(int a =0; a<Bilangan.length;a++){
            indexMin=a;
            for(int b=a+1;b<Bilangan.length;b++){
                if(Bilangan[b]<Bilangan[indexMin]){
                    indexMin=b;
                }
            }
            int temp = Bilangan [a];
            Bilangan [a]=Bilangan [indexMin];
            Bilangan [indexMin] = temp;
        }
        System.out.println("Daftar sudah berurut menggunakan Selection Sort");
    }
    static void displayValues (int[]Bilangan){
        for (int a =0;a<Bilangan.length; a++){
            System.out.print(Bilangan[a]+ " ");
        }
        System.out.println("\n");
    }
}
