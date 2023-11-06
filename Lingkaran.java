/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package risqi.hitung;
public class Lingkaran extends BangunDatar {

    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public void hitungLuas() {
        luas = Math.PI * jari * jari;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * Math.PI * jari;
    }
}
