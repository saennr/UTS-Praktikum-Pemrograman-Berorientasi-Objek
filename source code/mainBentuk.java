public class mainBentuk {
    public static void main(String[] args) {
        System.out.println("\tOPERASI MATEMATIKA");
        System.out.println("===============================");

        persegi p = new persegi(3);
        System.out.println("\nPERSEGI");
        System.out.println("-------------");
        p.infoBentuk();
        System.out.println("Luas Persegi : " + p.hitungLuas());
        p.setSisi(5);
        System.out.println("\nSetelah Mengubah Nilai Sisi :");
        System.out.println("Sisi Persegi : " + p.getSisi());
        System.out.println("Luas Persegi : " + p.hitungLuas());

        lingkaran l = new lingkaran(5);
        System.out.println("\nLINGKARAN");
        System.out.println("-------------");
        l.infoBentuk();
        System.out.println("Luas Lingkaran : " + l.hitungLuas());
        l.setJariJari(8);
        System.out.println("\nSetelah Mengubah Nilai jari-jari :");
        System.out.println("Jari - jari Lingkaran \t: " + l.getJariJari());
        System.out.println("Diameter Lingkaran \t: " + l.hitungDiameter());
        System.out.println("Luas Lingkaran \t\t: " + l.hitungLuas());

        segitiga s = new segitiga(8, 5);
        System.out.println("\nSEGITIGA");
        System.out.println("-------------");
        s.infoBentuk();
        System.out.println("Luas Segitiga : " + s.hitungLuas());
        s.setAlas(5);
        s.setTinggi(2);
        System.out.println("\nSetelah Mengubah Nilai Alas dan Tinggi :");
        System.out.println("Alas Segitiga   : " + s.getAlas());
        System.out.println("Tinggi Segitiga : " + s.getTinggi());
        System.out.println("Luas Segitiga \t: " + s.hitungLuas());

        jajarGenjang j = new jajarGenjang();
        System.out.println("\nJAJAR GENJANG");
        System.out.println("------------------");
        j.infoBentuk();
        System.out.println("Keliling Jajar Genjang : " + j.hitungKeliling());
        j.setA(5);
        j.setB(3);
        System.out.println("\nSetelah Mengubah Nilai Alas dan Sisi Miring :");
        System.out.println("Alas Jajar Genjang \t  : " + j.getA());
        System.out.println("Sisi Miring Jajar Genjang : " + j.getB());
        System.out.println("Keliling Jajar Genjang \t  : " + j.hitungKeliling());
    }
}
