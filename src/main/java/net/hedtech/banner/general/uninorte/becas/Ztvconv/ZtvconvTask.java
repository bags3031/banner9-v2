package net.hedtech.banner.general.uninorte.becas.Ztvconv;

import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;

public class ZtvconvTask extends BaseTask {
	public ZtvconvTask(String taskName) {
		super(taskName);
	}
	
	public ZtvconvTask(String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}
	
	@Override
	public net.hedtech.banner.general.uninorte.becas.Ztvconv.model.ZtvconvModel getModel() {
		return (net.hedtech.banner.general.uninorte.becas.Ztvconv.model.ZtvconvModel)super.getModel();
	}
	
	public net.hedtech.banner.general.uninorte.becas.Ztvconv.services.ZtvconvServices getServices() {
		return (net.hedtech.banner.general.uninorte.becas.Ztvconv.services.ZtvconvServices)getSupportCodeManager().getServices();
	}
	
	// Attached Libraries
	
	public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls() {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
	}
}
