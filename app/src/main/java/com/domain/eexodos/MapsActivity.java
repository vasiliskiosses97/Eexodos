package com.domain.eexodos;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity  extends FragmentActivity
implements OnMapReadyCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);

        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Log.d("TAG", "onMapReady: Correct2");

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // and move the map's camera to the same location.
        LatLng CoffeeIs = new LatLng(-33.852, 151.211);
        googleMap.addMarker(new MarkerOptions().position(CoffeeIs)
                .title("Marker in CoffeeIs"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(CoffeeIs));
        Log.d("TAG", "onMapReady: Correct3");
    }
}

