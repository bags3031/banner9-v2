package net.hedtech.banner.general.uninorte.becas.Zbatipo.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
//import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;

public class ZtvtipoAdapter extends BaseRowAdapter {

	public ZtvtipoAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}
	
	//Data Columns
	
	public NString getZtvtipoCategoria() {
		NString v = new NString((String)this.getValue("ZTVTIPO_CATEGORIA"));
		return v;
	}
	
	public void setZtvtipoCategoria(NString value) {
		this.setValue("ZTVTIPO_CATEGORIA", value.getValue());
	}

	public NNumber getZtvtipoTipo() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("ZTVTIPO_TIPO"));
		return v;
	}
	
	public void setZtvtipoTipo(NNumber value) {
		this.setValue("ZTVTIPO_TIPO", value.getValue());
	}

	public NString getZtvtipoDescTipo() {
		NString v = new NString((String)this.getValue("ZTVTIPO_DESC_TIPO"));
		return v;
	}
	
	public void setZtvtipoDescTipo(NString value) {
		this.setValue("ZTVTIPO_DESC_TIPO", value.getValue());
	}

	public NString getZtvtipoEstado() {
		NString v = new NString((String)this.getValue("ZTVTIPO_ESTADO"));
		return v;
	}
	
	public void setZtvtipoEstado(NString value) {
		this.setValue("ZTVTIPO_ESTADO", value.getValue());
	}

	public NString getZtvtipoUsuario() {
		NString v = new NString((String)this.getValue("ZTVTIPO_USUARIO"));
		return v;
	}
	
	public void setZtvtipoUsuario(NString value) {
		this.setValue("ZTVTIPO_USUARIO", value.getValue());
	}

	public NDate getZtvtipoFechaMod() {
		NDate v = new NDate((java.util.Date)this.getValue("ZTVTIPO_FECHA_MOD"));
		return v;
	}
	
	public void setZtvtipoFechaMod(NDate value) {
		this.setValue("ZTVTIPO_FECHA_MOD", value.getValue());
	}

	public NString getZtvtipoEstadoS() {
		NString v = new NString((String)this.getValue("ZTVTIPO_ESTADO_S"));
		return v;
	}
	
	public void setZtvtipoEstadoS(NString value) {
		this.setValue("ZTVTIPO_ESTADO_S", value.getValue());
	}

	public NString getZtvtipoMensaje() {
		NString v = new NString((String)this.getValue("ZTVTIPO_MENSAJE"));
		return v;
	}
	
	public void setZtvtipoMensaje(NString value) {
		this.setValue("ZTVTIPO_MENSAJE", value.getValue());
	}

}