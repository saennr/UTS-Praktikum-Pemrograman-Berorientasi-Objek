public class segitiga extends bentuk implements operasiMatematika {
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
