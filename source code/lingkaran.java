public class lingkaran extends bentuk implements operasiMatematika {
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
