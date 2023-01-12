package esd4;

public class Dipendente {
	
	public static double stipendioBase = 1000;
	
	private static String matricola;
	private static double stipendio;
	private static double importoOrarioStraordinario;
	private static Livello livello;
	private static Dipartimento dipartimento;
	
	//----------CONSTRUCTOR1
	
	public Dipendente(String matricola, Dipartimento dipartimento) {
   
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
	}
	
	//----------CONSTRUCTOR2
	
	public Dipendente(String matricola, Dipartimento dipartimento, double stipendio, double importoOrarioStraordinario,
            Livello livello) {
       
		this(matricola, dipartimento);
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        
    }

	public static double getStipendioBase() {
		return stipendioBase;
	}

	public static String getMatricola() {
		return matricola;
	}

	public static double getStipendio() {
		return stipendio;
	}

	public static double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public static Livello getLivello() {
		return livello;
	}

	public static Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	public static void setLivello(Livello livello) {
		Dipendente.livello = livello;
	}
	

	//-----------------METODO STAMPA
	public void stampaDatiDipendente() {
	System.out.println("Matricola: " + this.matricola);
	System.out.println("Stipendio: " + this.stipendio);
	System.out.println("Livello: " + this.livello);
	System.out.println("Dipartimento: " + this.dipartimento);
	System.out.println("Importo orario straordinario: " + this.importoOrarioStraordinario);

		System.out.println("-----------------------------------------------------------------");
	}
	
	public Livello promuovi() {
		if (this.livello == Livello.OPERAIO) {
			this.livello = Livello.IMPIEGATO;
			this.stipendio = Dipendente.stipendioBase * Livello.IMPIEGATO.getMoltiplicatoreStipendio();
			return Livello.IMPIEGATO;
		}else if(this.livello == Livello.IMPIEGATO) {
			this.livello = Livello.QUADRO;
			this.stipendio = Dipendente.stipendioBase * Livello.QUADRO.getMoltiplicatoreStipendio();
			return Livello.QUADRO;
		}else if(this.livello == Livello.QUADRO) {
			this.livello = Livello.DIRIGENTE;
			this.stipendio = Dipendente.stipendioBase * Livello.DIRIGENTE.getMoltiplicatoreStipendio();
			return Livello.DIRIGENTE;
		}else {
			this.livello = Livello.DIRIGENTE;
			this.stipendio = Dipendente.stipendioBase * Livello.DIRIGENTE.getMoltiplicatoreStipendio();
			System.out.println("Impossibile avanzare di carriera, sei dirigente!");
			return Livello.DIRIGENTE;
		}
	}
	
	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}
	

	public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
		double stipendio = dipendente.getStipendio();
		double straordinario = dipendente.getImportoOrarioStraordinario() * oreStraordinario;
		return stipendio + straordinario;
	}
	
}















