package com.example.shield.learn.agent;

import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dianping.agentsdk.framework.DriverInterface;
import com.dianping.agentsdk.framework.PageContainerInterface;
import com.dianping.agentsdk.framework.SectionCellInterface;
import com.dianping.shield.agent.LightAgent;

/**
 * Created by cunxuantang on 2018/12/14.
 */
public class HelloWorldAgent extends LightAgent {

    public HelloWorldAgent(Fragment fragment, DriverInterface bridge, PageContainerInterface pageContainer) {
        super(fragment, bridge, pageContainer);
    }

    @Override
    public SectionCellInterface getSectionCellInterface() {
        return new SectionCellInterface() {
            @Override
            public int getSectionCount() {
                return 1;
            }

            @Override
            public int getRowCount(int sectionPosition) {
                return 1;
            }

            @Override
            public int getViewType(int sectionPosition, int rowPosition) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 0;
            }

            @Override
            public View onCreateView(ViewGroup parent, int viewType) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                linearLayout.setLayoutParams(params);
                TextView textView = new TextView(getContext());
                textView.setText("Hello world");
                textView.setGravity(Gravity.CENTER);
                linearLayout.addView(textView);
                return linearLayout;
            }

            @Override
            public void updateView(View view, int sectionPosition, int rowPosition, ViewGroup parent) {

            }
        };
    }
}
