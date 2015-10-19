package com.mountainminds.eclemma.internal.ui.actions;

import org.eclipse.debug.ui.actions.AbstractLaunchToolbarAction;
import org.eclipse.jface.action.IAction;

import com.mountainminds.eclemma.internal.ui.EclEmmaUIPlugin;

public class TDDCriteriaRedCoverageToolbarAction extends
    AbstractLaunchToolbarAction {

  public TDDCriteriaRedCoverageToolbarAction() {
    super(EclEmmaUIPlugin.ID_COVERAGE_LAUNCH_GROUP);
  }

  @Override
  public void run(IAction action) {
    EclEmmaUIPlugin.ID_COVERAGE_TDD_ACTION_LAUNCH = "RED";
    super.run(action);
  }

}