package net.hedtech.banner.general.uninorte.becas.Ztvtiso.controller;

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
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.ZtvtisoTask;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtvtisoModel;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NString;

import static morphis.foundations.core.types.Types.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import net.hedtech.general.common.dbservices.GNls;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.nextBlock;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.errorMessage;
import morphis.foundations.core.appsupportlib.Lib;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.*;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;
import morphis.foundations.core.appdatalayer.events.AfterQuery;

public class ZtvtisoController extends DefaultBlockController {

	public ZtvtisoController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public ZtvtisoTask getTask() {
		return (ZtvtisoTask) super.getTask();
	}

	public ZtvtisoModel getFormModel() {
		return getTask().getModel();
	}

	@After
	@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
	public void ztvtiso_blockIn()
	{
		//TODO to be filled by the user
	}

	@BeforeQuery
	public void ztvtiso_BeforeQuery(QueryEvent queryEvent) {
		setBlockWhereClause("ZTVTISO", "WHERE ztvtiso_tipo="+this.getFormModel().getKeyBlock().getCodeTipo());
	}
	
	@AfterQuery
	public void ztvtiso_AfterQuery(RowAdapterEvent rowAdapterEvent) {
		ZtvtisoAdapter z = (ZtvtisoAdapter)rowAdapterEvent.getRow();
		String sql ="select stvadmt_desc from stvadmt s where s.stvadmt_code ='"+z.getZtvtisoStvwappCode()+"'";
		if(z!=null){
			try(DataCursor dc = new DataCursor(sql)) {
				ResultSet rs = dc.fetchInto();
				if(rs != null) {
					z.setTipoAdmisionDesc(rs.getStr(0));
				} else {
					z.setTipoAdmisionDesc(NString.getNull());
				}
			}
		}		
	}

	@BeforeRowInsert
	public void ztvtiso_BeforeRowInsert(RowAdapterEvent rowAdapterEvent) {
		ZtvtisoAdapter z = (ZtvtisoAdapter)rowAdapterEvent.getRow();
		z.setZtvtisoCategoria(toStr("BE"));
		String sql ="select max(z.ztvtiso_cod_sol)+1 FROM ZTVTISO z";
		try(DataCursor dc = new DataCursor(sql)) {
			ResultSet rs = dc.fetchInto();
			if(rs != null) {
				z.setZtvtisoCodSol(rs.getNumber(0));
			} else {
				errorMessage("Error: No genero el codigo solicitud consecutivo");
				throw new ApplicationException();
			}
		}
		z.setZtvtisoUsuario(getGlobal("CURRENT_USER"));
		z.setZtvtisoFechaMod(NDate.getNow());
	}

	@BeforeRowUpdate
	public void ztvtiso_BeforeRowUpdate(RowAdapterEvent rowAdapterEvent) {
		ZtvtisoAdapter z = (ZtvtisoAdapter)rowAdapterEvent.getRow();
		z.setZtvtisoUsuario(getGlobal("CURRENT_USER"));
		z.setZtvtisoFechaMod(NDate.getNow());
	}

//	@ActionTrigger(action = "WHEN-NEW-RECORD-INSTANCE", function = KeyFunction.RECORD_CHANGE)
//	public void fzrclap_recordChange() {
//		goBlock("ZTBPRSO");
//		executeQuery();
//	}
	
}