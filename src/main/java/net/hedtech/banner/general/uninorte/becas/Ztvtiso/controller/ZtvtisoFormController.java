package net.hedtech.banner.general.uninorte.becas.Ztvtiso.controller;

import morphis.foundations.core.appsupportlib.runtime.ITask;
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
import net.hedtech.general.common.forms.controller.DefaultFormController;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.ZtvtisoTask;
import net.hedtech.banner.general.uninorte.becas.Ztvtiso.model.ZtvtisoModel;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import static morphis.foundations.core.appsupportlib.Globals.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import java.util.EventObject;
import morphis.core.utils.behavior.annotations.Before;
import morphis.foundations.core.appdatalayer.events.BeforeRowInsert;
import morphis.foundations.core.appdatalayer.events.BeforeRowUpdate;
import morphis.foundations.core.appdatalayer.events.CancelEvent;
import morphis.foundations.core.appdatalayer.events.QueryExecute;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.model.AfterCommit;
import morphis.foundations.core.appsupportlib.model.BeforeCommit;
import morphis.foundations.core.appsupportlib.model.OnRollback;
import morphis.foundations.core.appsupportlib.runtime.events.OnError;
import morphis.foundations.core.appsupportlib.runtime.events.TaskEnded;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStarted;
import morphis.foundations.core.appsupportlib.runtime.events.TaskStartedPre;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.*;

public class ZtvtisoFormController extends DefaultFormController {

	public ZtvtisoFormController(ITask task) {
		super(task);
	}

	@Override
	public ZtvtisoTask getTask() {
		return (ZtvtisoTask) super.getTask();
	}

	public ZtvtisoModel getFormModel() {
		return getTask().getModel();
	}

	private GFormClass getGFormClass() {
		return (GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	

	private GApplFormClass getGApplFormClass() {
		return (GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	

	@ActionTrigger(action="SAVE_KEYS")
	public void Ztvtiso_SaveKeys()
	{
	}

	@ActionTrigger(action="GLOBAL_COPY")
	public void Ztvtiso_GlobalCopy()
	{
	}

	@ActionTrigger(action="CHECK_KEYS")
	public void Ztvtiso_CheckKeys()
	{
	}

	@ActionTrigger(action="DISABLE_KEYS")
	public void Ztvtiso_DisableKeys()
	{	
		
	}

	@ActionTrigger(action="ENABLE_KEYS")
	public void Ztvtiso_EnableKeys()
	{		
		
	}

//	@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
//	public void Ztvtiso_WhenNewBlockInstanceTrg()
//	{	
//		if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
//		{
//			getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
//			goBlock(toStr("KEY_BLOCK"));
//			executeAction("CHECK_KEYS");
//			getTask().getGoqrpls().gCheckFailure();
//			
//			nextBlock();
//			executeQuery();
//
//			getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
//			executeAction("DISABLE_KEYS");
//			getTask().getGoqrpls().gCheckFailure();
//		}
//	}

	@ActionTrigger(action="LOAD_CURRENT_RELEASE")
	public void Ztvtiso_LoadCurrentRelease()
	{	
		getFormModel().getFormHeader().setCurrentRelease(toStr("UN:9.3-001"));
	}

	@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
	public void Ztvtiso_ClearTask()
	{	
			executeAction("SAVE_KEYS");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("ENABLE_KEYS");
			getTask().getGoqrpls().gCheckFailure();
			
			clearTask();
			getTask().getGoqrpls().gCheckFailure();
			
			executeAction("LOAD_FORM_HEADER");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("GLOBAL_COPY");
			getTask().getGoqrpls().gCheckFailure();
	}

	@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
	public void Ztvtiso_NextBlock()
	{
		getGFormClass().nextBlock();
	}

	@ActionTrigger(action="G$_VERIFY_ACCESS")
	public void Ztvtiso_GVerifyAccess()
	{
		getGFormClass().gVerifyAccess();
	}

	@TaskStartedPre
	public void Ztvtiso_TaskStartedPre(EventObject args)
	{
		getGFormClass().taskStartedPre(args);
	}

	@TaskStarted
	public void Ztvtiso_TaskStarted(EventObject args)
	{
		getGFormClass().taskStarted(args);
	}

	@ActionTrigger(action="PRE_FORM_TRG")
	public void Ztvtiso_PreFormTrg()
	{
		getGFormClass().preFormTrg();
	}

	@TaskEnded
	public void Ztvtiso_TaskEnded(EventObject args)
	{
		getGFormClass().taskEnded(args);
	}

	@ActionTrigger(action="POST_FORM_TRG")
	public void Ztvtiso_PostFormTrg()
	{
		getGFormClass().postFormTrg();
	}

	@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
	@Before
	public void Ztvtiso_blockIn()
	{
		getGFormClass().blockIn();
	}

	@ActionTrigger(action="PRE_BLOCK_TRG")
	public void Ztvtiso_PreBlockTrg()
	{
		getGFormClass().preBlockTrg();
	}

	@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
	@Before
	public void Ztvtiso_blockOut()
	{
		getGFormClass().blockOut();
	}

	@ActionTrigger(action="POST_BLOCK_TRG")
	public void Ztvtiso_PostBlockTrg()
	{
		getGFormClass().postBlockTrg();
	}

	@BeforeCommit
	public void Ztvtiso_BeforeCommit(CancelEvent args)
	{
		getGFormClass().beforeCommit(args);
	}

	@ActionTrigger(action="PRE_COMMIT_TRG")
	public void Ztvtiso_PreCommitTrg()
	{
		getGFormClass().preCommitTrg();
	}

	@OnRollback
	public void Ztvtiso_OnRollback(EventObject args)
	{
		getGFormClass().onRollback();
	}

	@ActionTrigger(action="ON_ROLLBACK_TRG")
	public void Ztvtiso_OnRollbackTrg()
	{
		getGFormClass().onRollbackTrg();
	}

	@ActionTrigger(action="ON-SELECT")
	public void Ztvtiso_OnSelect()
	{
		getGFormClass().onSelect();
	}

	@AfterCommit
	public void Ztvtiso_AfterCommit(EventObject args)
	{
		getGFormClass().afterCommit(args);
	}

	@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
	public void Ztvtiso_PostFormsCommitTrg()
	{
		getGFormClass().postFormsCommitTrg();
	}

	@ActionTrigger(action="WHEN-BUTTON-PRESSED")
	public void Ztvtiso_buttonClick()
	{
		getGFormClass().click();
	}

	@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
	@Before
	public void Ztvtiso_blockChange()
	{
		getGFormClass().blockChange();
	}

	@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
	public void Ztvtiso_WhenWindowActivated()
	{
		getGFormClass().whenWindowActivated();
	}

	@ActionTrigger(action="WHEN-WINDOW-CLOSED")
	public void Ztvtiso_WhenWindowClosed()
	{
		getGFormClass().whenWindowClosed();
	}

	@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
	public void Ztvtiso_PreviousBlock()
	{
		getGFormClass().previousBlock();
	}
}