package net.hedtech.banner.general.uninorte.becas.Ztvconv.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
//import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;

public class ZtvconvAdapter extends BaseRowAdapter {

	public ZtvconvAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}
	
	//Data Columns
	
	public NString getZtvconvCategoria() {
		NString v = new NString((String)this.getValue("ZTVCONV_CATEGORIA"));
		return v;
	}
	
	public void setZtvconvCategoria(NString value) {
		this.setValue("ZTVCONV_CATEGORIA", value.getValue());
	}

	public NNumber getZtvconvTipo() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("ZTVCONV_TIPO"));
		return v;
	}
	
	public void setZtvconvTipo(NNumber value) {
		this.setValue("ZTVCONV_TIPO", value.getValue());
	}

	public NNumber getZtvconvCodSol() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("ZTVCONV_COD_SOL"));
		return v;
	}
	
	public void setZtvconvCodSol(NNumber value) {
		this.setValue("ZTVCONV_COD_SOL", value.getValue());
	}

	public NNumber getZtvconvCodConv() {
		NNumber v = new NNumber((BigDecimal) this.getValue("ZTVCONV_COD_CONV"));
		return v;
	}
	
	public void setZtvconvCodConv(NNumber value) {
		this.setValue("ZTVCONV_COD_CONV", value.getValue());
	}

	public NDate getZtvconvFInicio() {
		NDate v = new NDate((java.util.Date)this.getValue("ZTVCONV_F_INICIO"));
		return v;
	}
	
	public void setZtvconvFInicio(NDate value) {
		this.setValue("ZTVCONV_F_INICIO", value.getValue());
	}

	public NDate getZtvconvFFin() {
		NDate v = new NDate((java.util.Date)this.getValue("ZTVCONV_F_FIN"));
		return v;
	}
	
	public void setZtvconvFFin(NDate value) {
		this.setValue("ZTVCONV_F_FIN", value.getValue());
	}

	public NString getZtvconvEstado() {
		NString v = new NString((String)this.getValue("ZTVCONV_ESTADO"));
		return v;
	}
	
	public void setZtvconvEstado(NString value) {
		this.setValue("ZTVCONV_ESTADO", value.getValue());
	}

	public NString getZtvconvUsuario() {
		NString v = new NString((String)this.getValue("ZTVCONV_USUARIO"));
		return v;
	}
	
	public void setZtvconvUsuario(NString value) {
		this.setValue("ZTVCONV_USUARIO", value.getValue());
	}

	public NDate getZtvconvFechaMod() {
		NDate v = new NDate((java.util.Date)this.getValue("ZTVCONV_FECHA_MOD"));
		return v;
	}
	
	public void setZtvconvFechaMod(NDate value) {
		this.setValue("ZTVCONV_FECHA_MOD", value.getValue());
	}

	public NString getZtvconvDescConv() {
		NString v = new NString((String)this.getValue("ZTVCONV_DESC_CONV"));
		return v;
	}
	
	public void setZtvconvDescConv(NString value) {
		this.setValue("ZTVCONV_DESC_CONV", value.getValue());
	}

	public NString getZtvconvPeriodo() {
		NString v = new NString((String)this.getValue("ZTVCONV_PERIODO"));
		return v;
	}
	
	public void setZtvconvPeriodo(NString value) {
		this.setValue("ZTVCONV_PERIODO", value.getValue());
	}

}