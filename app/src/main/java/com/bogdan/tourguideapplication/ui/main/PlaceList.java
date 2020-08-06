package com.bogdan.tourguideapplication.ui.main;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bogdan.tourguideapplication.R;


import java.util.ArrayList;
import java.util.Objects;

public class PlaceList extends AppCompatActivity {

    ArrayList<Place> places = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list_information);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        String placeTitle = getIntent().getStringExtra(getString(R.string.intent_extra_place_title));
        setTitle(placeTitle);
        initializePlace(places);
        int placeIndex = searchPlaceByTitle(placeTitle);
        layoutItems(placeIndex);
    }


    private void layoutItems(int i) {
        ImageView imageView = findViewById(R.id.image_view);
        imageView.setImageResource(places.get(i).getPlaceImageResourceId());
        TextView textView = findViewById(R.id.title_text_view);
        textView.setText(places.get(i).getPlaceTitle());
        TextView textView1 = findViewById(R.id.type_kitchen);
        textView1.setText(places.get(i).getPlaceTypeKitchen());
        TextView textView2 = findViewById(R.id.price_text_view);
        textView2.setText(places.get(i).getPlacePrice());
        TextView textView3 = findViewById(R.id.work_time_text_view);
        textView3.setText(places.get(i).getPlaceWorkTime());
        TextView textView4 = findViewById(R.id.phone_number_text_view);
        textView4.setText(places.get(i).getPlaceNumber());
        TextView textView5 = findViewById(R.id.website_text_view);
        textView5.setText(places.get(i).getPlaceWebSite());


    }


    private void initializePlace(ArrayList<Place> places) {
        places.add(new Place(getString(R.string.cafe_title1), getString(R.string.cafe_address1), getString(R.string.type_cafe1), getString(R.string.time_cafe1), getString(R.string.phone_cafe1), getString(R.string.web_cafe1), getString(R.string.price_cafe1), R.drawable.i_bacaro_de_bischeri));
        places.add(new Place(getString(R.string.cafe_title2), getString(R.string.cafe_address2), getString(R.string.type_cafe2), getString(R.string.time_cafe2), getString(R.string.phone_cafe2), getString(R.string.web_cafe2), getString(R.string.price_cafe2), R.drawable.cocaeta_non_le_solie_crepes));
        places.add(new Place(getString(R.string.cafe_title3), getString(R.string.cafe_address3), getString(R.string.type_cafe3), getString(R.string.time_cafe3), getString(R.string.phone_cafe3), getString(R.string.web_cafe3), getString(R.string.price_cafe3), R.drawable.baci_and_pasta));
        places.add(new Place(getString(R.string.cafe_title4), getString(R.string.cafe_address4), getString(R.string.type_cafe4), getString(R.string.time_cafe4), getString(R.string.phone_cafe4), getString(R.string.web_cafe4), getString(R.string.price_cafe4), R.drawable.arcicchetti));
        places.add(new Place(getString(R.string.restaurant_title1), getString(R.string.restaurant_address1), getString(R.string.restaurant_type_kitchen1), getString(R.string.restaurant_work_time1), getString(R.string.restaurant_phone1), getString(R.string.restaurant_website1), getString(R.string.restaurant_price1), R.drawable.wisteria_rest));
        places.add(new Place(getString(R.string.restaurant_title2), getString(R.string.restaurant_address2), getString(R.string.restaurant_type_kitchen2), getString(R.string.restaurant_work_time2), getString(R.string.restaurant_phone2), getString(R.string.restaurant_website2), getString(R.string.restaurant_price2), R.drawable.ristorante_la_piazza));
        places.add(new Place(getString(R.string.restaurant_title3), getString(R.string.restaurant_address3), getString(R.string.restaurant_type_kitchen3), getString(R.string.restaurant_work_time3), getString(R.string.restaurant_phone3), getString(R.string.restaurant_website3), getString(R.string.restaurant_price3), R.drawable.ristorante_alle_corone));
        places.add(new Place(getString(R.string.restaurant_title4), getString(R.string.restaurant_address4), getString(R.string.restaurant_type_kitchen4), getString(R.string.restaurant_work_time4), getString(R.string.restaurant_phone4), getString(R.string.restaurant_website4), getString(R.string.restaurant_price4), R.drawable.riviera));
        places.add(new Place(getString(R.string.bar_title1), getString(R.string.bar_address1), getString(R.string.bar_type_kitchen1), getString(R.string.bar_work_time1), getString(R.string.bar_phone1), getString(R.string.bar_website1), getString(R.string.bar_price1), R.drawable.adagio_bar));
        places.add(new Place(getString(R.string.bar_title2), getString(R.string.bar_address2), getString(R.string.bar_type_kitchen2), getString(R.string.bar_work_time2), getString(R.string.bar_phone2), getString(R.string.bar_website2), getString(R.string.bar_price2), R.drawable.dhero_bar));
        places.add(new Place(getString(R.string.bar_title3), getString(R.string.bar_address3), getString(R.string.bar_type_kitchen3), getString(R.string.bar_work_time3), getString(R.string.bar_phone3), getString(R.string.bar_website3), getString(R.string.bar_price3), R.drawable.basego_bar));
        places.add(new Place(getString(R.string.bar_title4), getString(R.string.bar_address4), getString(R.string.bar_type_kitchen4), getString(R.string.bar_work_time4), getString(R.string.bar_phone4), getString(R.string.bar_website4), getString(R.string.bar_price4), R.drawable.cantina_bar));
        places.add(new Place(getString(R.string.coffee_title1), getString(R.string.coffee_address1), getString(R.string.coffee_type_kitchen1), getString(R.string.coffee_work_time1), getString(R.string.coffee_phone1), getString(R.string.coffee_website1), getString(R.string.coffee_price1), R.drawable.pasticceria_da_bonifacio));
        places.add(new Place(getString(R.string.coffee_title2), getString(R.string.coffee_address2), getString(R.string.coffee_type_kitchen2), getString(R.string.coffee_work_time2), getString(R.string.coffee_phone2), getString(R.string.coffee_website2), getString(R.string.coffee_price2), R.drawable.pasticceria_rizzardini));
        places.add(new Place(getString(R.string.coffee_title3), getString(R.string.coffee_address3), getString(R.string.coffee_type_kitchen3), getString(R.string.coffee_work_time3), getString(R.string.coffee_phone3), getString(R.string.coffee_website3), getString(R.string.coffee_price3), R.drawable.torrefazione));
        places.add(new Place(getString(R.string.coffee_title4), getString(R.string.coffee_address4), getString(R.string.coffee_type_kitchen4), getString(R.string.coffee_work_time4), getString(R.string.coffee_phone4), getString(R.string.coffee_website4), getString(R.string.coffee_price4), R.drawable.yogurtcreperia_marie));


    }

    private int searchPlaceByTitle(String title) {
        for (int i = 0; i < places.size(); i++) {
            Place place = places.get(i);
            String placeTitle = place.getPlaceTitle();
            if (title.equals(placeTitle)) {
                return i;
            }
        }
        return 0;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return false;
    }
}
