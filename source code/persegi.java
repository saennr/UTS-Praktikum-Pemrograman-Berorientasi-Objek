public class persegi extends bentuk implements operasiMatematika {
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
