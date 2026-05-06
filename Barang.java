public class Barang {

    private String nama;
    private double harga;
    private int qty;

    public Barang(String nama, double harga, int qty){
        this.nama = nama;
        this.harga = harga;
        this.qty = qty;
    }

    public double getSubtotal(){
        return harga * qty;
    }

    public String getNama(){
        return nama;
    }

    public int getQty(){
        return qty;
    }
}