package com.stenbergroom.swipeitems.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.daimajia.swipe.SwipeLayout;

/**
 * Created by Sten on 25.04.2015.
 */
public class NestedExample extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SwipeLayout swipeLayout = (SwipeLayout) findViewById(R.id.test_swipe_swipe);
        swipeLayout.setOnDoubleClickListener(new SwipeLayout.DoubleClickListener() {
            @Override
            public void onDoubleClick(SwipeLayout layout, boolean surface) {
                Toast.makeText(getApplicationContext(), "DoubleClick", Toast.LENGTH_SHORT).show();
            }
        });
        swipeLayout.findViewById(R.id.trash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Click Trash", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
