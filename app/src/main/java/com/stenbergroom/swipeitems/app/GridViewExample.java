package com.stenbergroom.swipeitems.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import com.daimajia.swipe.implments.SwipeItemMangerImpl;
import com.stenbergroom.swipeitems.app.adapter.GridViewAdapter;

/**
 * Created by Sten on 25.04.2015.
 */
public class GridViewExample extends Activity {

    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        final GridView gridView = (GridView)findViewById(R.id.gridview);
        final GridViewAdapter adapter = new GridViewAdapter(this);

        adapter.setMode(SwipeItemMangerImpl.Mode.Multiple);
        gridView.setAdapter(adapter);
        gridView.setSelected(false);
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //Log.d("onItem", "onItemLongClick: " + position);
                Toast.makeText(mContext, "OnItemLongClick: "+ position, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Log.d("onItem", "onItemClick: " + position);
                Toast.makeText(mContext, "OnItemClick: "+ position, Toast.LENGTH_SHORT).show();
            }
        });
        gridView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Log.d("onItem", "onItemSelected: " + position);
                Toast.makeText(mContext, "OnItemSelected: "+ position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
