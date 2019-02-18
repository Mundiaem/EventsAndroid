package com.treadstone.grpproject.daropointsevents.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.treadstone.grpproject.daropointsevents.R;
import com.treadstone.grpproject.daropointsevents.models.events.Events;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {
    private Context mContext;
    private List<Events> mEvents = new ArrayList<>();
    private int selectedPosition;


    public EventsAdapter(Context context, List<Events> events) {
        this.mEvents = events;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_items_res, parent, false);
        return new ViewHolder(itemsView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
