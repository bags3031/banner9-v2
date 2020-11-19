package net.hedtech.banner.general.uninorte.becas.Ztvtiso.controller;

import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NString;

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

import net.hedtech.general.common.dbservices.Bwfkbdqs.GettotalaRow;
import net.hedtech.general.common.forms.controller.DefaultBlockController;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.ZtvtisoTask;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtbprsoAdapter;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtvtisoAdapter;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtvtisoModel;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;

public class ZtbprsoController extends DefaultBlockController {

	public ZtbprsoController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public ZtvtisoTask getTask() {
		return (ZtvtisoTask) super.getTask();
	}

	public ZtvtisoModel getFormModel() {
		return getTask().getModel();
	}

	@BeforeQuery
	public void ztbprso_BeforeQuery(QueryEvent queryEvent) {
//		ZtvtisoAdapter z = (ZtvtisoAdapter)this.getFormModel().getZtvtiso().getRowAdapter(true);
//		setBlockWhereClause("ZTBPRSO", "WHERE ztbprso_cod_sol="+z.getZtvtisoCodSol()+" and ztbprso_tipo="+z.getZtvtisoTipo());
	}

	@AfterQuery
	public void ztbprso_AfterQuery(RowAdapterEvent rowAdapterEvent) {
		ZtbprsoAdapter z = (ZtbprsoAdapter)rowAdapterEvent.getRow();
		String sql ="select e.smrprle_program_desc FROM SMRPRLE e where e.smrprle_program='"+z.getZtbprsoPrograma()+"'";
		if(z!=null){
			try(DataCursor dc = new DataCursor(sql)) {
				ResultSet rs = dc.fetchInto();
				if(rs != null) {
					z.setDescPrograma(rs.getStr(0));
				} else {
					z.setDescPrograma(NString.getNull());
				}
			}
		}
	}

	@BeforeRowInsert
	public void ztbprso_BeforeRowInsert(RowAdapterEvent rowAdapterEvent) {
		ZtbprsoAdapter z = (ZtbprsoAdapter)rowAdapterEvent.getRow();
		z.setZtbprsoUsuario(getGlobal("CURRENT_USER"));
		z.setZtbprsoFechaMod(NDate.getNow());
	}

	@BeforeRowUpdate
	public void ztbprso_BeforeRowUpdate(RowAdapterEvent rowAdapterEvent) {
		ZtbprsoAdapter z = (ZtbprsoAdapter)rowAdapterEvent.getRow();
		z.setZtbprsoUsuario(getGlobal("CURRENT_USER"));
		z.setZtbprsoFechaMod(NDate.getNow());
	}
	
	
	
}