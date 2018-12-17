package com.example.shield.learn.agent;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

    private int count = 0;

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
                return 1;
            }

            @Override
            public View onCreateView(ViewGroup parent, int viewType) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout.setLayoutParams(params);
                linearLayout.setOrientation(LinearLayout.VERTICAL);
                TextView textView = new TextView(getContext());
                textView.setGravity(Gravity.CENTER_HORIZONTAL);
                Button button = new Button(getContext());
                button.setText("Change");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        count++;
                        updateAgentCell();
                    }
                });
                linearLayout.setTag(textView);
                linearLayout.addView(textView);
                linearLayout.addView(button);
                return linearLayout;
            }

            @Override
            public void updateView(View view, int sectionPosition, int rowPosition, ViewGroup parent) {
                TextView textView = (TextView) view.getTag();
                textView.setText("Hello world: " + count);
                textView.setTextColor(Color.BLACK);
            }
        };
    }
}
