package net.hedtech.banner.general.uninorte.becas.Ztvtiso.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
//import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;

public class ZtbprsoAdapter extends BaseRowAdapter {

	public ZtbprsoAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}
	
	//Data Columns
	
	public NNumber getZtbprsoCodSol() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("ZTBPRSO_COD_SOL"));
		return v;
	}
	
	public void setZtbprsoCodSol(NNumber value) {
		this.setValue("ZTBPRSO_COD_SOL", value.getValue());
	}

	public NNumber getZtbprsoTipo() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("ZTBPRSO_TIPO"));
		return v;
	}
	
	public void setZtbprsoTipo(NNumber value) {
		this.setValue("ZTBPRSO_TIPO", value.getValue());
	}

	public NString getZtbprsoPrograma() {
		NString v = new NString((String)this.getValue("ZTBPRSO_PROGRAMA"));
		return v;
	}
	
	public void setZtbprsoPrograma(NString value) {
		this.setValue("ZTBPRSO_PROGRAMA", value.getValue());
	}

	public NString getZtbprsoUsuario() {
		NString v = new NString((String)this.getValue("ZTBPRSO_USUARIO"));
		return v;
	}
	
	public void setZtbprsoUsuario(NString value) {
		this.setValue("ZTBPRSO_USUARIO", value.getValue());
	}

	public NDate getZtbprsoFechaMod() {
		NDate v = new NDate((java.util.Date)this.getValue("ZTBPRSO_FECHA_MOD"));
		return v;
	}
	
	public void setZtbprsoFechaMod(NDate value) {
		this.setValue("ZTBPRSO_FECHA_MOD", value.getValue());
	}

	public NString getDescPrograma() {
		NString v = new NString((String) this.getValue("DESC_PROGRAMA"));
		return v;
	}

	public void setDescPrograma(NString value) {
		this.setValue("DESC_PROGRAMA", value.getValue());
	}

}