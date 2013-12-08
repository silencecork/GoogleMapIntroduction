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
		
		options.title("�@�s�j��");
		
		options.snippet("�x�_����s�ϸհ|��154��1��7��");
		
		map.addMarker(options);
	}

}
