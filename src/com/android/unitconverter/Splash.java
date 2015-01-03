package com.android.unitconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	MediaPlayer song;
	@Override
	protected void onCreate(Bundle skib) {
		// TODO Auto-generated method stub
		song = MediaPlayer.create(Splash.this, R.raw.habib) ;
		song.start();
		final Context context = this;
		super.onCreate(skib);
		setContentView(R.layout.splash);
		Thread timer =new Thread(){
			public void run(){
				try{
					sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					 Intent intent = new Intent(context, UnitConverter.class);
                     startActivity(intent);
				}
					
						
				
				}
			
			
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		finish();
		
		
	}
	
	
}
