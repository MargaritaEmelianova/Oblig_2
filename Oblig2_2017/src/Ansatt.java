import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ansatt extends Kort {

	private String fornavn;
	private String etternavn;
	protected Ansatt(String navn, int pIN) {
		super(navn, pIN);
		
	}
	
void setFullNavn(){

String[] nameArray = navn.split(" ", 2);
setFornavn(nameArray [0]); setEtternavn(nameArray [1]);
}
@Override
	public boolean sjekkPIN(int pin) {
		Calendar calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY), day = calendar.get(Calendar.DAY_OF_WEEK);
		return !isSperret() && ((hour < 17 && hour > 7 && day >= 2 && day <= 6) || (PIN == getPIN()));
	}

public String getFornavn() {
	return fornavn;
}

public void setFornavn(String fornavn) {
	this.fornavn = fornavn;
}

public String getEtternavn() {
	return etternavn;
}

public void setEtternavn(String etternavn) {
	this.etternavn = etternavn;
}



}
