package net.hedtech.banner.general.uninorte.becas.Zbatipo;

import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;

public class ZbatipoTask extends BaseTask {
	public ZbatipoTask(String taskName) {
		super(taskName);
	}
	
	public ZbatipoTask(String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}
	
	@Override
	public net.hedtech.banner.general.uninorte.becas.Zbatipo.model.ZbatipoModel getModel() {
		return (net.hedtech.banner.general.uninorte.becas.Zbatipo.model.ZbatipoModel)super.getModel();
	}
	
	public net.hedtech.banner.general.uninorte.becas.Zbatipo.services.ZbatipoServices getServices() {
		return (net.hedtech.banner.general.uninorte.becas.Zbatipo.services.ZbatipoServices)getSupportCodeManager().getServices();
	}
	
	// Attached Libraries
	
	public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls() {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
	}
}
