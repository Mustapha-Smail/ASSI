import java.sql.Date;

public class Commande {
    Date dateCmd;

	public Commande(Date dateCmd) {
		super();
		this.dateCmd = dateCmd;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	} 
	
	
}
