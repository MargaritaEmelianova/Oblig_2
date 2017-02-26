
public class   Gjest extends Kort{

	private long created;

	protected Gjest(String navn, int pIN) {
		super(navn, 9999);
		
		setCreated(System.currentTimeMillis());
	
		
		
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}
	@Override
	public boolean sjekkPIN(int pin) {
		long expires = created + 1000 * 60 * 60 * 24 * 7; 
		return (!isSperret() && getPIN() == PIN && System.currentTimeMillis() < expires);	


	
	}
}