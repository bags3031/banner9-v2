package net.hedtech.banner.general.uninorte.becas.Zbatipo.controller;

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
import net.hedtech.banner.general.uninorte.becas.Zbatipo.ZbatipoTask;
import net.hedtech.banner.general.uninorte.becas.Zbatipo.model.ZbatipoModel;
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

public class ZbatipoFormController extends DefaultFormController {

	public ZbatipoFormController(ITask task) {
		super(task);
	}

	@Override
	public ZbatipoTask getTask() {
		return (ZbatipoTask) super.getTask();
	}

	public ZbatipoModel getFormModel() {
		return getTask().getModel();
	}

	private GFormClass getGFormClass() {
		return (GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	

	private GApplFormClass getGApplFormClass() {
		return (GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	

	@ActionTrigger(action="SAVE_KEYS")
	public void Zbatipo_SaveKeys()
	{
	}

	@ActionTrigger(action="GLOBAL_COPY")
	public void Zbatipo_GlobalCopy()
	{
	}

	@ActionTrigger(action="CHECK_KEYS")
	public void Zbatipo_CheckKeys()
	{
	}

	@ActionTrigger(action="DISABLE_KEYS")
	public void Zbatipo_DisableKeys()
	{	
		
	}

	@ActionTrigger(action="ENABLE_KEYS")
	public void Zbatipo_EnableKeys()
	{		
		
	}

//	@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
//	public void Zbatipo_WhenNewBlockInstanceTrg()
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
	public void Zbatipo_LoadCurrentRelease()
	{	
		getFormModel().getFormHeader().setCurrentRelease(toStr("UN:9.3-001"));
	}

	@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
	public void Zbatipo_ClearTask()
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
	public void Zbatipo_NextBlock()
	{
		getGFormClass().nextBlock();
	}

	@ActionTrigger(action="G$_VERIFY_ACCESS")
	public void Zbatipo_GVerifyAccess()
	{
		getGFormClass().gVerifyAccess();
	}

	@TaskStartedPre
	public void Zbatipo_TaskStartedPre(EventObject args)
	{
		getGFormClass().taskStartedPre(args);
	}

	@TaskStarted
	public void Zbatipo_TaskStarted(EventObject args)
	{
		getGFormClass().taskStarted(args);
	}

	@ActionTrigger(action="PRE_FORM_TRG")
	public void Zbatipo_PreFormTrg()
	{
		getGFormClass().preFormTrg();
	}

	@TaskEnded
	public void Zbatipo_TaskEnded(EventObject args)
	{
		getGFormClass().taskEnded(args);
	}

	@ActionTrigger(action="POST_FORM_TRG")
	public void Zbatipo_PostFormTrg()
	{
		getGFormClass().postFormTrg();
	}

	@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
	@Before
	public void Zbatipo_blockIn()
	{
		getGFormClass().blockIn();
	}

	@ActionTrigger(action="PRE_BLOCK_TRG")
	public void Zbatipo_PreBlockTrg()
	{
		getGFormClass().preBlockTrg();
	}

	@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
	@Before
	public void Zbatipo_blockOut()
	{
		getGFormClass().blockOut();
	}

	@ActionTrigger(action="POST_BLOCK_TRG")
	public void Zbatipo_PostBlockTrg()
	{
		getGFormClass().postBlockTrg();
	}

	@BeforeCommit
	public void Zbatipo_BeforeCommit(CancelEvent args)
	{
		getGFormClass().beforeCommit(args);
	}

	@ActionTrigger(action="PRE_COMMIT_TRG")
	public void Zbatipo_PreCommitTrg()
	{
		getGFormClass().preCommitTrg();
	}

	@OnRollback
	public void Zbatipo_OnRollback(EventObject args)
	{
		getGFormClass().onRollback();
	}

	@ActionTrigger(action="ON_ROLLBACK_TRG")
	public void Zbatipo_OnRollbackTrg()
	{
		getGFormClass().onRollbackTrg();
	}

	@ActionTrigger(action="ON-SELECT")
	public void Zbatipo_OnSelect()
	{
		getGFormClass().onSelect();
	}

	@AfterCommit
	public void Zbatipo_AfterCommit(EventObject args)
	{
		getGFormClass().afterCommit(args);
	}

	@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
	public void Zbatipo_PostFormsCommitTrg()
	{
		getGFormClass().postFormsCommitTrg();
	}

	@ActionTrigger(action="WHEN-BUTTON-PRESSED")
	public void Zbatipo_buttonClick()
	{
		getGFormClass().click();
	}

	@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
	@Before
	public void Zbatipo_blockChange()
	{
		getGFormClass().blockChange();
	}

	@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
	public void Zbatipo_WhenWindowActivated()
	{
		getGFormClass().whenWindowActivated();
	}

	@ActionTrigger(action="WHEN-WINDOW-CLOSED")
	public void Zbatipo_WhenWindowClosed()
	{
		getGFormClass().whenWindowClosed();
	}

	@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
	public void Zbatipo_PreviousBlock()
	{
		getGFormClass().previousBlock();
	}
}