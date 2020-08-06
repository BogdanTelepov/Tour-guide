package com.bogdan.tourguideapplication.ui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bogdan.tourguideapplication.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {
    @SuppressLint("StaticFieldLeak")
    static TextView title;
    @SuppressLint("StaticFieldLeak")
    static TextView address;
    @SuppressLint("StaticFieldLeak")
    static ImageView image;
    @SuppressLint("StaticFieldLeak")
    static TextView phoneNumber;


    public PlaceAdapter(@NonNull Context context, @NonNull List<Place> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_list, parent, false);
        }
        final Place currentPlace = getItem(position);
        title = listItemView.findViewById(R.id.title_text_view);
        assert currentPlace != null;
        title.setText(currentPlace.getPlaceTitle());

        image = listItemView.findViewById(R.id.image_view);
        Glide.with(image).load(currentPlace.getPlaceImageResourceId()).into(image);
        //image.setImageResource(currentPlace.getPlaceImageResourceId());
        address = listItemView.findViewById(R.id.address_text_view);
        SpannableString addressString = new SpannableString(currentPlace.getPlaceAddress());
        addressString.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 0, addressString.length(), 0);
        address.setText(addressString);
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(Intent.ACTION_VIEW);
                map.setData(Uri.parse("geo:0,0?q=" + currentPlace.getPlaceAddress()));
                if (map.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(map);
                }
            }
        });

        phoneNumber = listItemView.findViewById(R.id.phone_number_text_view);
        phoneNumber.setText(currentPlace.getPlaceNumber());
        return listItemView;
    }
}
