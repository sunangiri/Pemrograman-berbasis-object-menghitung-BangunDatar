
package risqi.hitung;
public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    @Override
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }
}
