package repTel;

public class Contact {

	private String nomContact;
	
	private String numeroContact;

	public Contact(String nomContact, String numeroContact) {
		super();
		this.nomContact = nomContact;
		this.numeroContact = numeroContact;
	}

	public String getNomContact() {
		return nomContact;
	}

	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}

	public String getNumeroContact() {
		return numeroContact;
	}

	public void setNumeroContact(String numeroContact) {
		this.numeroContact = numeroContact;
	}
	
	
	
}
