package net.hedtech.banner.general.uninorte.becas.Ztvtiso.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.model.FormModel;

import net.hedtech.general.common.libraries.Goqolib.model.*;

public class ZtvtisoModel extends FormModel {
	
	public ZtvtisoModel(ITask task, Hashtable parameters) {
		super(task, parameters);
	}

	public KeyBlock getKeyBlock() {
		return (KeyBlock) getBusinessObject("KEY_BLOCK");
	}

	public ButtonControlBlock getButtonControlBlock() {
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}

	public FormHeader getFormHeader() {
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public GSdkey getGSdkey() {
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public GVpdiBlock getGVpdiBlock() {
		return (GVpdiBlock) getBusinessObject("G$_VPDI_BLOCK");
	}

	public GNavBlock getGNavBlock() {
		return (GNavBlock) getBusinessObject("G$_NAV_BLOCK");
	}
	
	public IDBBusinessObject getZtvtiso() {
		return (IDBBusinessObject) getBusinessObject("ZTVTISO");
	}

	public IDBBusinessObject getZtbprso() {
		return (IDBBusinessObject) getBusinessObject("ZTBPRSO");
	}

	public IDBBusinessObject getGSdisp() {
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}
}