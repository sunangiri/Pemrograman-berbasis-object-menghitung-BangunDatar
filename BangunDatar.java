
package risqi.hitung;
public abstract class BangunDatar {

    protected double luas;
    protected double keliling;

    public abstract void hitungLuas();

    public abstract void hitungKeliling();

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
}
