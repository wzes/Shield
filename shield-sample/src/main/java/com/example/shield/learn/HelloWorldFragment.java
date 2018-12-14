package com.example.shield.learn;

import com.dianping.agentsdk.framework.AgentInfo;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.AgentListConfig;
import com.example.shield.fragments.AgentManagerFragment;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by cunxuantang on 2018/12/14.
 */
public class HelloWorldFragment extends AgentManagerFragment {


    @Override
    protected ArrayList<AgentListConfig> generaterDefaultConfigAgentList() {
        ArrayList<AgentListConfig> arr = new ArrayList<>();
        AgentListConfig agentListConfig = new AgentListConfig() {
            @Override
            public boolean shouldShow() {
                return false;
            }

            @Override
            public Map<String, AgentInfo> getAgentInfoList() {
                return null;
            }

            @Override
            public Map<String, Class<? extends AgentInterface>> getAgentList() {
                return null;
            }
        }
        return null;
    }
}
