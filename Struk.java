public class Struk {

    public void cetak(Kasir k, Pelanggan p, Transaksi t){

        System.out.println("===== STRUK BELANJA =====");
        System.out.println("Kasir      : " + k.nama);
        System.out.println("Pelanggan  : " + p.nama);
        System.out.println("--------------------------");

        for(Barang b : t.getDaftar()){
            System.out.printf("%-10s x%-2d = Rp%,.0f\n",
                b.getNama(),
                b.getQty(),
                b.getSubtotal()
            );
        }

        System.out.println("--------------------------");

        System.out.printf("Subtotal : Rp%,.0f\n", t.getSubtotal());
        System.out.printf("Diskon   : Rp%,.0f\n", t.getDiskon());
        System.out.printf("Pajak    : Rp%,.0f\n", t.getPajak());
        System.out.printf("Total    : Rp%,.0f\n", t.getTotal());
    }
}