package com.example.user.organiseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class TaskListAdapter extends ArrayAdapter<Task> {

    public TaskListAdapter(Context context, ArrayList<Task> tasks) {
        super(context, 0, tasks);
    }


    @Override
        public View getView(int position, View listItemView, ViewGroup parent){
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
            }
            Task currentTask = getItem(position);

            TextView title_item = (TextView) listItemView.findViewById(R.id.title_item);
            title_item.setText(currentTask.getTitle());

            listItemView.setTag(currentTask);

            return listItemView;
    }

}