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

public class CafeFragment extends Fragment {

    public void onStart() {
        super.onStart();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_listview, viewGroup, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.cafe_title1), getString(R.string.cafe_address1), R.drawable.i_bacaro_de_bischeri, getString(R.string.phone_cafe1)));
        places.add(new Place(getString(R.string.cafe_title2), getString(R.string.cafe_address2), R.drawable.cocaeta_non_le_solie_crepes, getString(R.string.phone_cafe2)));
        places.add(new Place(getString(R.string.cafe_title3), getString(R.string.cafe_address3), R.drawable.baci_and_pasta, getString(R.string.phone_cafe3)));
        places.add(new Place(getString(R.string.cafe_title4), getString(R.string.cafe_address4), R.drawable.arcicchetti, getString(R.string.phone_cafe4)));
        PlaceAdapter placeAdapter = new PlaceAdapter(Objects.requireNonNull(getActivity()), places);
        ListView listView = view.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Place place = places.get(position);
                Intent intent = new Intent(getContext(), PlaceList.class);
                intent.putExtra(getString(R.string.intent_extra_place_title), place.getPlaceTitle());
                startActivity(intent);
            }
        });
        return view;
    }
}
