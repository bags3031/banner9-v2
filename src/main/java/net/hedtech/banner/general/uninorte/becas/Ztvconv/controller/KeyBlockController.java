package net.hedtech.banner.general.uninorte.becas.Ztvconv.controller;

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
import net.hedtech.banner.general.uninorte.becas.Ztvconv.ZtvconvTask;
import net.hedtech.banner.general.uninorte.becas.Ztvconv.model.ZtvconvModel;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import static morphis.foundations.core.types.Types.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import net.hedtech.general.common.dbservices.GNls;

import static morphis.foundations.core.appsupportlib.runtime.MessageServices.errorMessage;
import morphis.foundations.core.appsupportlib.Lib;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appdatalayer.events.AfterRowUpdate;

public class KeyBlockController extends DefaultBlockController {

	public KeyBlockController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public ZtvconvTask getTask() {
		return (ZtvconvTask) super.getTask();
	}

	public ZtvconvModel getFormModel() {
		return getTask().getModel();
	}

	@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
	public void keyBlock_NextBlock()
	{
		goBlock("ZTVCONV");
		executeQuery();
	}

	@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
	public void keyBlock_blockOut()
	{
		getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
	}

	@BeforeQuery
	public void key_block_BeforeQuery(QueryEvent queryEvent) {
		setBlockWhereClause("ZTVCONV", "WHERE ZTVCONV_COD_SOL="+this.getFormModel().getKeyBlock().getCodTipoSolicitud());
	}

	
}