package com.example.mapdemo;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		
		map.setMyLocationEnabled(true);
		
		MarkerOptions options = new MarkerOptions();
		
		options.position(new LatLng(24.989926, 121.545414));
		
		options.title("世新大學");
		
		options.snippet("台北市文山區試院路154巷1弄7號");
		
		map.addMarker(options);
	}

}
