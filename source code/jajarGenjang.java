public class jajarGenjang extends bentuk {
    private int a = 10; // a = alas
    private int b = 6; // b = sisi miring

    public jajarGenjang() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
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
