package net.hedtech.banner.general.uninorte.becas.Ztvtiso.services;

import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import morphis.common.forms.baseForm.services.DefaultSupportCodeObject;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.ZtvtisoTask;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtvtisoModel;

public class ZtvtisoServices extends DefaultSupportCodeObject {

	public ZtvtisoServices(ISupportCodeContainer container) {
		super(container);
	}

	public ZtvtisoTask getTask() {
		return (ZtvtisoTask) super.getContainer();
	}

	public ZtvtisoModel getFormModel() {
		return getTask().getModel();
	}

	// TODO: put your services here

}