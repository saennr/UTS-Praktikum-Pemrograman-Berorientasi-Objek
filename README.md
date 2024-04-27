interface operasiMatematika {
    double hitungLuas();
}

abstract class bentuk {
    public abstract void infoBentuk();
}

class persegi extends bentuk implements operasiMatematika {
    private int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return getSisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void infoBentuk() {
        System.out.println("Persegi dengan sisi " + sisi);
    }
}

class lingkaran extends bentuk implements operasiMatematika {
    private double phi = 3.14;
    private int jariJari;
    private int diameter;

    public lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public setPhi(double phi){
        this.phi = phi;
    }

    public getPhi(){
        return phi;
    }

    public setJariJari(int jariJari){
        this.jariJari = jariJari;
    }

    public setDiameter(int diameter){
        this.diameter = diameter;
    }

    public getDiameter(){
        return diameter;
    }

    public double hitungDiameter() {
        return 2 * jariJari;
    }

    @Override
    public double hitungLuas() {
        return phi * jariJari * jariJari;
    }

    @Override
    public void infoBentuk() {
        System.out.println("Lingkaran dengan jari - jari " + jariJari + " dan diameter " + hitungDiameter());
    }
}

class segitiga extends bentuk implements operasiMatematika {
    private int alas;
    private int tinggi;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public setAlas(int alas){
        this.alas = alas;
    }

    public getAlas(){
        return alas;
    }

    public setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public getTinggi(){
        return tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public void infoBentuk() {
        System.out.println("Segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }
}

class jajarGenjang extends bentuk {
    private int a = 10; // a = alas
    private int b = 6; // b = sisi miring

    public jajarGenjang() {

    }

    public setA(int a){
        this.a = a;
    }

    public getA(){
        return a;
    }

    public setB(int b){
        this.b = b;
    }

    public getB(){
        return b;
    }

    public int hitungKeliling() {
        return 2 * a + 2 * b;
    }

    @Override
    public void infoBentuk() {
        System.out.println("Jajar Genjang dengan alas " + a + " dan sisi miring " + b);
    }
}

public class mainBentuk {
    public static void main(String[] args) {
        System.out.println("\tOPERASI MATEMATIKA");
        System.out.println("===============================");

        persegi p = new persegi(3);
        System.out.println("\nPERSEGI");
        System.out.println("-------------");
        p.infoBentuk();
        System.out.println("Luas Persegi : " + p.hitungLuas());

        lingkaran l = new lingkaran(5);
        System.out.println("\nLINGKARAN");
        System.out.println("-------------");
        l.infoBentuk();
        System.out.println("Luas Lingkaran : " + l.hitungLuas());

        segitiga s = new segitiga(8, 5);
        System.out.println("\nSEGITIGA");
        System.out.println("-------------");
        s.infoBentuk();
        System.out.println("Luas Segitiga : " + s.hitungLuas());

        jajarGenjang j = new jajarGenjang();
        System.out.println("\nJAJAR GENJANG");
        System.out.println("------------------");
        j.infoBentuk();
        System.out.println("Keliling Jajar Genjang : " + j.hitungKeliling());
    }
}
