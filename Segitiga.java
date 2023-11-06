
package risqi.hitung;
public class Segitiga extends BangunDatar {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = (alas * tinggi) / 2;
    }

    @Override
    public void hitungKeliling() {
        keliling = alas + tinggi + tinggi;
    }
}
