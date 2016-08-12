package com.rzlyp.googlemapstandart;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends Activity implements OnMapReadyCallback {
    private GoogleMap gMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            MapFragment mF = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
            mF.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
        LatLng myLocation = new LatLng(-6.885615, 107.614235);
        gMap.addMarker(new MarkerOptions().position(myLocation).title("Codelabs"));
        gMap.moveCamera(CameraUpdateFactory.newLatLng(myLocation));
    }
}
