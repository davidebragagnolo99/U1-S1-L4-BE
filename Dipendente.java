public class Dipendente {
    public double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
        double stipendioComplessivo = dipendente.stipendio + (oreStraordinario * dipendente.importoOrarioStraordinario);
        return stipendioComplessivo;
    }

    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.stipendio;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo orario straordinario: " + importoOrarioStraordinario);
        System.out.println("Livello: " + livello);
        System.out.println("Dipartimento: " + dipartimento);
    }

    public Livello promuovi() {
        if (livello == Livello.OPERAIO) {
            livello = Livello.IMPIEGATO;
            stipendio = stipendioBase * 1.2;
        } else if (livello == Livello.IMPIEGATO) {
            livello = Livello.QUADRO;
            stipendio = stipendioBase * 1.5;
        } else if (livello == Livello.QUADRO) {
            livello = Livello.DIRIGENTE;
            stipendio = stipendioBase * 2;
        } else {
            System.out.println("Impossibile promuovere un dipendente di livello DIRIGENTE.");
        }
        return livello;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}
