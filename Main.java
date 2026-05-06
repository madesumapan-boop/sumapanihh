import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Nama Kasir: ");
        Kasir k = new Kasir(input.nextLine());

        System.out.print("Nama Pelanggan: ");
        Pelanggan p = new Pelanggan(input.nextLine());

        Transaksi t = new Transaksi();

        int pilih;
        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Selesai & Cetak Struk");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            if(pilih == 1){
                System.out.print("Nama Barang: ");
                String nama = input.nextLine();

                System.out.print("Harga: ");
                double harga = input.nextDouble();

                System.out.print("Qty: ");
                int qty = input.nextInt();
                input.nextLine();

                Barang b = new Barang(nama, harga, qty);
                t.tambahBarang(b);
            }

        }while(pilih != 2);

        t.hitungTotal();

        Struk s = new Struk();
        s.cetak(k, p, t);

        input.close();
    }
}