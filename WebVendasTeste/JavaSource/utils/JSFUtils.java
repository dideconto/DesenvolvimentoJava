package utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUtils {

	public static void enviarMensagem(String mensagem) {
		FacesMessage fm = new FacesMessage();
		fm.setSummary(mensagem);
		fm.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, fm);
	}
 
}
