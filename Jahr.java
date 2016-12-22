/**
 * 21.12.2016
 * Created by user Schalk (Lukas Schalk).
 */

public class Jahr {
    private int jahr;

    public Jahr(int jahr) {
        this.jahr = jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public int getJahr() {
        return this.jahr;
    }

    public boolean isSchaltjahr() {
        return this.jahr % 4 == 0 && (this.jahr % 100 != 0 || this.jahr % 400 == 0);
    }
}
