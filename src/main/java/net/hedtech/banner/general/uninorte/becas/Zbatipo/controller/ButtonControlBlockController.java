package net.hedtech.banner.general.uninorte.becas.Zbatipo.controller;

import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
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
import net.hedtech.general.common.forms.controller.DefaultBlockController;
import net.hedtech.banner.general.uninorte.becas.Zbatipo.ZbatipoTask;
import net.hedtech.banner.general.uninorte.becas.Zbatipo.model.ZbatipoModel;

public class ButtonControlBlockController extends DefaultBlockController {

	public ButtonControlBlockController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public ZbatipoTask getTask() {
		return (ZbatipoTask) super.getTask();
	}

	public ZbatipoModel getFormModel() {
		return getTask().getModel();
	}
	
}