package net.hedtech.banner.general.uninorte.becas.Ztvtiso;

import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;

public class ZtvtisoTask extends BaseTask {
	public ZtvtisoTask(String taskName) {
		super(taskName);
	}
	
	public ZtvtisoTask(String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}
	
	@Override
	public net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtvtisoModel getModel() {
		return (net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtvtisoModel)super.getModel();
	}
	
	public net.hedtech.banner.general.uninorte.becas.Ztvtiso.services.ZtvtisoServices getServices() {
		return (net.hedtech.banner.general.uninorte.becas.Ztvtiso.services.ZtvtisoServices)getSupportCodeManager().getServices();
	}
	
	// Attached Libraries
	
	public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls() {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
	}
}
