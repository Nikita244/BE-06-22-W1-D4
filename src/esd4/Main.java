package esd4;

public class Main {

	public static void main(String[] args) {
		Dipendente w1 = new Dipendente("416B" , Dipartimento.PRODUZIONE);
        w1.stampaDatiDipendente();
        w1.promuovi();
        w1.stampaDatiDipendente();/*stampa promozione*/
        System.out.println("Il tuo stipendio base è di euro: " + w1.calcolaPaga(w1));
        System.out.println("Il tuo stipendio compreso gli straordinari è di euro: " + w1.calcolaPaga(w1, 5));
        
	}

}
