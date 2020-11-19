package net.hedtech.banner.general.uninorte.becas.Ztvconv.model;

import morphis.foundations.core.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;

public class KeyBlock extends morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject {

	public KeyBlock() {
		super();
	}

	public KeyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	
	public NString getX() {
		return toStr(super.getValue("X"));
	}
	
	public void setX(NString value) {
		super.setValue("X", value);
	}

	public NString getTipoSolicitud() {
		return toStr(super.getValue("TIPO_SOLICITUD"));
	}

	public void setTipoSolicitud(NString value) {
		super.setValue("TIPO_SOLICITUD", value);
	}

	public NNumber getCodTipoSolicitud() {
		return toNumber(super.getValue("COD_TIPO_SOLICITUD"));
	}

	public void setCodTipoSolicitud(NNumber value) {
		super.setValue("COD_TIPO_SOLICITUD", value);
	}

	public NNumber getCodBeca() {
		return toNumber(super.getValue("COD_BECA"));
	}

	public void setCodBeca(NNumber value) {
		super.setValue("COD_BECA", value);
	}

	

	

	

	
}