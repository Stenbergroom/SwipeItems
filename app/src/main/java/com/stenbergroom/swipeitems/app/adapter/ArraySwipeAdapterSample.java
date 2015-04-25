package com.stenbergroom.swipeitems.app.adapter;

import android.content.Context;
import com.daimajia.swipe.adapters.ArraySwipeAdapter;

import java.util.List;

/**
 * Created by Sten on 25.04.2015.
 */
public class ArraySwipeAdapterSample<T> extends ArraySwipeAdapter {

    public ArraySwipeAdapterSample(Context context, int resource) {
        super(context, resource);
    }

    public ArraySwipeAdapterSample(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ArraySwipeAdapterSample(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
    }

    public ArraySwipeAdapterSample(Context context, int resource, int textViewResourceId, Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ArraySwipeAdapterSample(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    public ArraySwipeAdapterSample(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public int getSwipeLayoutResourceId(int i) {
        return 0;
    }
}
