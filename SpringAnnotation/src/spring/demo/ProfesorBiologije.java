package spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // U zagradi nema bean id, defaultni je isti kao ime klase, samo sto pocinje malim slovom!
@Scope("singleton")
public class ProfesorBiologije implements Profesor {
	
	

	private Oblast oblast;
	
	public Oblast getOblast() {
		return oblast;
	}
	@Autowired  // Setter injection
	@Qualifier("hobi")
	public void setOblast(Oblast oblast) {
		this.oblast = oblast;
	}
	
	@Override
	public String getGreeting() {
		return "Pozdrav od profesora biologije ";
	}
	@Override
	public String getOblastRada() {
		return oblast.getOblast();
	}
	
	

}
