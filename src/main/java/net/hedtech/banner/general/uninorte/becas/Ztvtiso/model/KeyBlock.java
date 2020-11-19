package net.hedtech.banner.general.uninorte.becas.Ztvtiso.model;

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
		return toStr(super.getValue("TIPO"));
	}
	
	public void setX(NString value) {
		super.setValue("TIPO", value);
	}

	public NNumber getCodeTipo() {
		return toNumber(super.getValue("CODE_TIPO"));
	}

	public void setCodeTipo(NNumber value) {
		super.setValue("CODE_TIPO", value);
	}
}