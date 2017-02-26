import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ansatt extends Kort implements Konstanter {

	private String fornavn;
	private String etternavn;
	private double timelønn;
	private double datoAnsettelse;

	protected Ansatt(String navn, int pIN) {
		super(navn, pIN);

	}

	public boolean sjekkPIN(int pin) {
		Calendar calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY), day = calendar.get(Calendar.DAY_OF_WEEK);
		return !isSperret() && ((hour < 17 && hour > 7 && day >= 2 && day <= 6) || (PIN == getPIN()));
	}

	public void settFornavn(String fornavn) {

	}

	public String hentFornavn() {
		return fornavn;
	}

	public void settEtternavn(String etternavn) {

	}

	@Override
	public String hentEtternavn() {
		return etternavn;
	}

	@Override
	public void setFulltNavn(String fornavn, String etternavn) {
		String[] nameArray = navn.split(" ", 2);
		fornavn = nameArray[0];
		etternavn = nameArray[1];

	}

	@Override
	public String hentFulltNavn() {

		return navn;
	}

	@Override
	public double beregnKreditt() {

		return timelønn * fastFaktor;
	}

	@Override
	public double beregnBonus() {

		return fastFaktor * datoAnsettelse;
	}

}
