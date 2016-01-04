package com.ibm.team.build.internal.hjplugin.extensions.impl;

import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hudson.Extension;
import hudson.model.Run;

import com.ibm.team.build.internal.hjplugin.extensions.RtcExtensionProvider;

@Extension
public class DefaultLoadRuleProvider extends RtcExtensionProvider {
	
	@Override
	public boolean isApplicable(Run<?, ?> build) {
		return false;
	}
	
	@Override
	public void preUpdateFileCopyArea(String workspaceUUID, String workspaceName, String buildResultUUID, String repoURL, String userId, String password, File workspace, PrintStream logger) {
		if(logger != null) {
			logger.println("In preUpdateFileCopyArea method");
			logger.println("workspaceUUID= "+workspaceUUID);
			logger.println("workspace name= "+workspaceName);
			logger.println("buildResultUUID= "+buildResultUUID);
			logger.println("repoURL= "+repoURL);
			logger.println("UserId= "+userId);
			logger.println("Password= "+password);
			logger.println("Workspace Path: "+workspace.getAbsolutePath());
		}
	}
	
	@Override
    public void postUpdateFileCopyArea(String workspaceUUID, String workspaceName, String buildResultUUID, String repoURL, String userId, String password, File workspace, PrintStream logger) {
		if(logger != null) {
			logger.println("In postUpdateFileCopyArea method");
			logger.println("workspaceUUID= "+workspaceUUID);
			logger.println("workspace name= "+workspaceName);
			logger.println("buildResultUUID= "+buildResultUUID);
			logger.println("repoURL= "+repoURL);
			logger.println("UserId= "+userId);
			logger.println("Password= "+password);
			logger.println("Workspace Path: "+workspace.getAbsolutePath());
		}
	} 

	@Override
	public Map<String, String> getComponentLoadRules(String workspaceUUID, String workspaceName, String buildResultUUID, Map<String, String> componentInfo, String repoURL, String userId, String password, PrintStream logger) {
		
		if(logger != null) {
			logger.println("In getComponentLoadRules method");
			logger.println("workspaceUUID= "+workspaceUUID);
			logger.println("workspace name= "+workspaceName);
			logger.println("buildResultUUID= "+buildResultUUID);
			logger.println("repoURL= "+repoURL);
			logger.println("UserId= "+userId);
			logger.println("Password= "+password);
		}
		
		//example comp id: _WZRnMD82EeW_ELO0EF5Bag
		Map<String, String> rMap = new HashMap<String, String>();
		rMap.put("_WZRnMD82EeW_ELO0EF5Bag", "/Users/kk/jenkins_ws/lr1.loadrule");
		return rMap;
	}
	
	@Override
	public List<String> getExcludeComponents(String workspaceUUID, String workspaceName, String buildResultUUID, Map<String, String> componentInfo, String repoURL, String userId, String password, PrintStream logger) {
		if(logger != null) {
			logger.println("In getExcludeComponents method");
			logger.println("workspaceUUID= "+workspaceUUID);
			logger.println("workspace name= "+workspaceName);
			logger.println("buildResultUUID= "+buildResultUUID);
			logger.println("repoURL= "+repoURL);
			logger.println("UserId= "+userId);
			logger.println("Password= "+password);
		}
		return null;
	}

}