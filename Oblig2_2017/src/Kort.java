
public abstract  class Kort {
private String navn;
private int PIN;
private static int kortnummer;
private boolean sperretKort;

protected Kort(String navn, int pIN, boolean sperretKort) {
	super();
	this.setNavn(navn);
	setPIN(pIN);
	this.setSperretKort(sperretKort);
	
Kort.setKortnummer((int) (Math.random() * 15));
	

}

public String getNavn() {
	return navn;
}

public void setNavn(String navn) {
	this.navn = navn;
}

public int getPIN() {
	return PIN;
}

public void setPIN(int pIN) {
	PIN = pIN;
}

public static int getKortnummer() {
	return kortnummer;
}

public static void setKortnummer(int kortnummer) {
	Kort.kortnummer = kortnummer;
}

public boolean isSperretKort() {
	return sperretKort;
}

public void setSperretKort(boolean sperretKort) {
	this.sperretKort = sperretKort;
}
public boolean isSperret (){
	return sperretKort;
}

@Override
public String toString() {
	return "Kort [navn=" + navn + ", PIN=" + PIN + ", sperretKort=" + sperretKort + "]";

}
 public abstract boolean sjekkPIN();

}





