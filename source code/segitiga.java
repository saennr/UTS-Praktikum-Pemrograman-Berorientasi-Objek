public class segitiga extends bentuk implements operasiMatematika {
    private int alas;
    private int tinggi;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
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
