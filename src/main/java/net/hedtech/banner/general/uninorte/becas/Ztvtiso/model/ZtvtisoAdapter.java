package net.hedtech.banner.general.uninorte.becas.Ztvtiso.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
//import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;

public class ZtvtisoAdapter extends BaseRowAdapter {

	public ZtvtisoAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}
	
	//Data Columns
	
	public NString getZtvtisoCategoria() {
		NString v = new NString((String)this.getValue("ZTVTISO_CATEGORIA"));
		return v;
	}
	
	public void setZtvtisoCategoria(NString value) {
		this.setValue("ZTVTISO_CATEGORIA", value.getValue());
	}

	public NNumber getZtvtisoTipo() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("ZTVTISO_TIPO"));
		return v;
	}
	
	public void setZtvtisoTipo(NNumber value) {
		this.setValue("ZTVTISO_TIPO", value.getValue());
	}

	public NNumber getZtvtisoCodSol() {
		NNumber v = new NNumber((java.math.BigDecimal)this.getValue("ZTVTISO_COD_SOL"));
		return v;
	}
	
	public void setZtvtisoCodSol(NNumber value) {
		this.setValue("ZTVTISO_COD_SOL", value.getValue());
	}

	public NString getZtvtisoSolicitud() {
		NString v = new NString((String)this.getValue("ZTVTISO_SOLICITUD"));
		return v;
	}
	
	public void setZtvtisoSolicitud(NString value) {
		this.setValue("ZTVTISO_SOLICITUD", value.getValue());
	}

	public NString getZtvtisoEstado() {
		NString v = new NString((String)this.getValue("ZTVTISO_ESTADO"));
		return v;
	}
	
	public void setZtvtisoEstado(NString value) {
		this.setValue("ZTVTISO_ESTADO", value.getValue());
	}

	public NString getZtvtisoInformacion() {
		NString v = new NString((String)this.getValue("ZTVTISO_INFORMACION"));
		return v;
	}
	
	public void setZtvtisoInformacion(NString value) {
		this.setValue("ZTVTISO_INFORMACION", value.getValue());
	}

	public NString getZtvtisoInstrucciones() {
		NString v = new NString((String)this.getValue("ZTVTISO_INSTRUCCIONES"));
		return v;
	}
	
	public void setZtvtisoInstrucciones(NString value) {
		this.setValue("ZTVTISO_INSTRUCCIONES", value.getValue());
	}

	public NString getZtvtisoDatosCorresp() {
		NString v = new NString((String)this.getValue("ZTVTISO_DATOS_CORRESP"));
		return v;
	}
	
	public void setZtvtisoDatosCorresp(NString value) {
		this.setValue("ZTVTISO_DATOS_CORRESP", value.getValue());
	}

	public NString getZtvtisoUsuario() {
		NString v = new NString((String)this.getValue("ZTVTISO_USUARIO"));
		return v;
	}
	
	public void setZtvtisoUsuario(NString value) {
		this.setValue("ZTVTISO_USUARIO", value.getValue());
	}

	public NDate getZtvtisoFechaMod() {
		NDate v = new NDate((java.util.Date)this.getValue("ZTVTISO_FECHA_MOD"));
		return v;
	}
	
	public void setZtvtisoFechaMod(NDate value) {
		this.setValue("ZTVTISO_FECHA_MOD", value.getValue());
	}

	public NString getZtvtisoStvwappCode() {
		NString v = new NString((String)this.getValue("ZTVTISO_STVWAPP_CODE"));
		return v;
	}
	
	public void setZtvtisoStvwappCode(NString value) {
		this.setValue("ZTVTISO_STVWAPP_CODE", value.getValue());
	}

	public NString getZtvtisoTipoSol() {
		NString v = new NString((String)this.getValue("ZTVTISO_TIPO_SOL"));
		return v;
	}
	
	public void setZtvtisoTipoSol(NString value) {
		this.setValue("ZTVTISO_TIPO_SOL", value.getValue());
	}

	public NString getZtvtisoNombreFormt() {
		NString v = new NString((String)this.getValue("ZTVTISO_NOMBRE_FORMT"));
		return v;
	}
	
	public void setZtvtisoNombreFormt(NString value) {
		this.setValue("ZTVTISO_NOMBRE_FORMT", value.getValue());
	}

	public NString getTipoAdmisionDesc() {
		NString v = new NString((String) this.getValue("TIPO_ADMISION_DESC"));
		return v;
	}

	public void setTipoAdmisionDesc(NString value) {
		this.setValue("TIPO_ADMISION_DESC", value.getValue());
	}

}