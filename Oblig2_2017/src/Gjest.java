
public class   Gjest extends Kort{

	private long datecreated;

	protected Gjest(String navn, int pIN) {
		super(navn, 9999);

		
		setCreated(System.currentTimeMillis());	
	}

	public long getdateCreated() {
		return datecreated;
	}

	public void setCreated(long created) {
		this.datecreated = created;
	}

	@Override
	public boolean sjekkPIN(int pin) {
		long expires = datecreated + 1000 * 60 * 60 * 24 * 7; 
		return (!isSperret() && getPIN() == PIN && System.currentTimeMillis() < expires);	


	
	}

	
	
}