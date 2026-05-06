import java.util.ArrayList;

public class Transaksi {

    private ArrayList<Barang> daftar = new ArrayList<>();
    private double subtotal;
    private double diskon;
    private double pajak;
    private double total;

    public void tambahBarang(Barang b){
        daftar.add(b);
    }

    public void hitungTotal(){

        subtotal = 0;

        for(Barang b : daftar){
            subtotal += b.getSubtotal();
        }

        // diskon 10% jika subtotal >= 20000
        if(subtotal >= 20000){
            diskon = subtotal * 0.10;
        } else {
            diskon = 0;
        }

        // pajak 11%
        pajak = (subtotal - diskon) * 0.11;

        total = subtotal - diskon + pajak;
    }

    public ArrayList<Barang> getDaftar(){
        return daftar;
    }

    public double getSubtotal(){ return subtotal; }
    public double getDiskon(){ return diskon; }
    public double getPajak(){ return pajak; }
    public double getTotal(){ return total; }
}