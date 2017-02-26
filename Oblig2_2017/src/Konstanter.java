
public interface Konstanter {

	 void settFornavn(String fornavn);
	 String hentFornavn();
	 void settEtternavn(String etternavn);
	 String hentEtternavn();
	 void setFulltNavn(String fornavn, String etternavn);
	 String hentFulltNavn();
	 double beregnKreditt();
	 double beregnBonus();
	 double fastFaktor = 0;
}
