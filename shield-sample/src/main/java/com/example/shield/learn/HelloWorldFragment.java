package com.example.shield.learn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dianping.agentsdk.framework.AgentInfo;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.AgentListConfig;
import com.dianping.agentsdk.framework.PageContainerInterface;
import com.example.shield.fragments.AgentManagerFragment;
import com.example.shield.learn.agent.HelloWorldAgent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cunxuantang on 2018/12/14.
 */
public class HelloWorldFragment extends AgentManagerFragment {


    RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRecyclerView = new RecyclerView(getContext());
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setAgentContainerView(mRecyclerView);
    }

    @Override
    protected ArrayList<AgentListConfig> generaterDefaultConfigAgentList() {
        ArrayList<AgentListConfig> arr = new ArrayList<>();
        AgentListConfig agentListConfig = new AgentListConfig() {
            @Override
            public boolean shouldShow() {
                return true;
            }

            @Override
            public Map<String, AgentInfo> getAgentInfoList() {

                Map<String, AgentInfo> map = new HashMap<>();
                map.put("HelloWorld", new AgentInfo(HelloWorldAgent.class, "0.0"));
                return map;
            }

            @Override
            public Map<String, Class<? extends AgentInterface>> getAgentList() {
                return null;
            }
        };
        arr.add(agentListConfig);
        return arr;
    }
}
