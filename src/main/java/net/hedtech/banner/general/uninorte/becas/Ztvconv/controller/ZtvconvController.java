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
import net.hedtech.banner.general.uninorte.becas.Ztvconv.model.*;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;

public class ZtvconvController extends DefaultBlockController {

	public ZtvconvController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public ZtvconvTask getTask() {
		return (ZtvconvTask) super.getTask();
	}

	public ZtvconvModel getFormModel() {
		return getTask().getModel();
	}

	@After
	@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
	public void ztvconv_blockIn()
	{
		//TODO to be filled by the user
	}

	@BeforeQuery
	public void ztvconv_BeforeQuery(QueryEvent queryEvent) {
		setBlockWhereClause("ZTVCONV", "WHERE ZTVCONV_COD_SOL="+this.getFormModel().getKeyBlock().getCodTipoSolicitud());
	}

	@BeforeRowInsert
	public void ztvconv_BeforeRowInsert(RowAdapterEvent rowAdapterEvent) {
		ZtvconvAdapter z = (ZtvconvAdapter)rowAdapterEvent.getRow();
		String sql ="select max(a.ztvconv_cod_conv)+1 FROM ZTVCONV a";
		try(DataCursor dc = new DataCursor(sql)) {
			ResultSet rs = dc.fetchInto();
			if(rs != null) {
				z.setZtvconvCodConv(rs.getNumber(0));
			} else {
				errorMessage("Error: No genero el codigo convocatoria consecutivo");
				throw new ApplicationException();
			}
		}
		z.setZtvconvUsuario(getGlobal("CURRENT_USER"));
		z.setZtvconvFechaMod(NDate.getNow());
	}

	@BeforeRowUpdate
	public void ztvconv_BeforeRowUpdate(RowAdapterEvent rowAdapterEvent) {
		ZtvconvAdapter z = (ZtvconvAdapter)rowAdapterEvent.getRow();
		z.setZtvconvUsuario(getGlobal("CURRENT_USER"));
		z.setZtvconvFechaMod(NDate.getNow());
	}
	
	
	
}