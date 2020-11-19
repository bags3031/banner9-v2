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
import morphis.foundations.core.appsupportlib.runtime.action.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NDate;

import static morphis.foundations.core.types.Types.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import net.hedtech.general.common.dbservices.GNls;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.nextBlock;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.errorMessage;
import morphis.foundations.core.appsupportlib.Lib;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.banner.general.uninorte.becas.Zbatipo.model.*;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;

public class ZtvtipoController extends DefaultBlockController {

	public ZtvtipoController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public ZbatipoTask getTask() {
		return (ZbatipoTask) super.getTask();
	}

	public ZbatipoModel getFormModel() {
		return getTask().getModel();
	}

	@After
	@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
	public void ztvtipo_blockIn()
	{
		//TODO to be filled by the user
	}

	@BeforeRowInsert
	public void ztvtipo_BeforeRowInsert(RowAdapterEvent rowAdapterEvent) {
		ZtvtipoAdapter za=(ZtvtipoAdapter)rowAdapterEvent.getRow();
		if(za != null){
			za.setZtvtipoCategoria(toStr("BE"));
			za.setZtvtipoFechaMod(NDate.getNow());
			za.setZtvtipoUsuario(getGlobal("CURRENT_USER"));
			String sql ="select max(z.ztvtipo_tipo)+1 from ztvtipo z";
			try(DataCursor dc = new DataCursor(sql)) {
				ResultSet rs = dc.fetchInto();
				if(rs != null) {
					za.setZtvtipoTipo(rs.getNumber(0));
				} else {
					errorMessage("Error: No generó el tipo consecutivo");
					throw new ApplicationException();
				}
			}
		}
	}

	@BeforeRowUpdate
	public void ztvtipo_BeforeRowUpdate(RowAdapterEvent rowAdapterEvent) {
		ZtvtipoAdapter za=(ZtvtipoAdapter)rowAdapterEvent.getRow();
		if(za != null){
			za.setZtvtipoFechaMod(NDate.getNow());
			za.setZtvtipoUsuario(getGlobal("CURRENT_USER"));			
			
		}
	}
	
}