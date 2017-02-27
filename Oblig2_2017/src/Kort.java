
public abstract  class Kort implements Cloneable, Comparable<Kort>{

protected String navn;
protected int PIN;
private static int kortnummer;
private boolean sperretKort;

protected Kort(String navn, int pIN) {
	super();
	this.setNavn(navn);
	setPIN(pIN);
	this.setSperretKort(sperretKort);
	
Kort.setKortnummer((int) (Math.random()));
	

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


	public int compareTo(Kort k) {
		if (getNavn().compareTo(getNavn()) < 0)
			
		return -1;
		
		else
			return 1;
			
		
}
@Override
public String toString() {
	
	return "Kort [navn=" + navn + ", PIN=" + PIN + ", sperretKort=" + sperretKort + "]";
}
 public abstract boolean sjekkPIN(int pin);

@Override
public Object clone(){
	try{
	Kort kortClone = (Kort) super.clone();
	return kortClone;
}
catch (CloneNotSupportedException ex){
	return null;
}
}
}


