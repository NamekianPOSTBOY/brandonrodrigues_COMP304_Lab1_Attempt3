package com.example.brandonrodrigues_comp304_lab1_attempt3;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TopListFragment extends ListFragment {
    String[] activities = new String[]
            {
                    "AIActivity",
                    "VRActivity"
            };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top_list, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, activities);
        setListAdapter(adapter);
        return view;
    }
        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            if(position == 0){
                Intent AIIntent = new Intent(v.getContext(), AIActivity.class);
                startActivity(AIIntent);
            }else if(position == 1){
                Intent VRIntent = new Intent(v.getContext(), VRActivity.class);
                startActivity(VRIntent);
            }
    }
}