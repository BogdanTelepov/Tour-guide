package com.bogdan.tourguideapplication.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.bogdan.tourguideapplication.R;

import java.util.ArrayList;
import java.util.Objects;

public class CoffeeAndTeaFragment extends Fragment {

    public void onStart() {
        super.onStart();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = layoutInflater.inflate(R.layout.place_listview, viewGroup, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.coffee_title1), getString(R.string.coffee_address1), R.drawable.pasticceria_da_bonifacio, getString(R.string.coffee_phone1)));
        places.add(new Place(getString(R.string.coffee_title2), getString(R.string.coffee_address2), R.drawable.pasticceria_rizzardini, getString(R.string.coffee_phone2)));
        places.add(new Place(getString(R.string.coffee_title3), getString(R.string.coffee_address3), R.drawable.torrefazione, getString(R.string.coffee_phone3)));
        places.add(new Place(getString(R.string.coffee_title4), getString(R.string.coffee_address4), R.drawable.yogurtcreperia_marie, getString(R.string.coffee_phone4)));
        PlaceAdapter placeAdapter = new PlaceAdapter(Objects.requireNonNull(getActivity()), places);
        ListView listView = view.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place place = places.get(position);
                Intent intent = new Intent(getContext(), PlaceList.class);
                intent.putExtra(getString(R.string.intent_extra_place_title), place.getPlaceTitle());
                startActivity(intent);
            }
        });
        return view;
    }
}
