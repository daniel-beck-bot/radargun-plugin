package org.jenkinsci.plugins.radargun.model.impl;

import java.util.List;
import java.util.Map;

/**
 * Represents RG master node and keeps it's configuration.
 * Currently not special configuration for master is needed.
 * Kept as a marker class.
 * 
 * @author vjuranek
 *
 */
public class MasterNode extends Node {
    
    public MasterNode(Node node) {
        super(node.getName(), node.getFqdn(), node.getJvmOptions(), node.getJavaProps(), node.getEnvVars(), node.getBeforeCmds(), node.getAfterCmds(), node.getGatherLogs());
    }
    
    public MasterNode(String name, String fqdn) {
        super(name, fqdn);
    }

    public MasterNode(String hostname, String fqdn, String jvmOptions, Map<String, Object> javaProps, Map<String, String> envVars, List<String> beforeCmds, List<String> afterCmds, boolean gatherLogs) {
        super(hostname, fqdn, jvmOptions, javaProps, envVars, beforeCmds, afterCmds, gatherLogs);
    }

    @Override
    public boolean isMaster() {
        return true;
    }
    
    @Override //override to remove deprecation on master node
    public String getJvmOptions() {
        return super.getJvmOptions();
    }
    
}
