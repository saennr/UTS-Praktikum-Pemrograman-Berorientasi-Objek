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
