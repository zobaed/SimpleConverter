package com.android.unitconverter;

public class TimeStrategy implements Strategy {

	public double Convert(String from, String to, double input) {
		// TODO Auto-generated method stub
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
			&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))))
				
		{
			double ret = 3600* input;
			return ret;
		}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))))
					
			{
				double ret = input/365;return ret;
			}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitminute))))
					
			{
				double ret = 60* input;return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))))
					
			{
				double ret = input/24;return ret;
			}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))))
					
			{
				double ret = input/3600;return ret;
			}
		
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitminute))))
					
			{
				double ret =  input/60;return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))))
					
			{
				double ret =  input/(24*3600);return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))))
					
			{
				double ret =  input/(3600*24*365);return ret;
			}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))))
					
			{
				double ret = input/24;return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitminute))))
					
			{
				double ret = input*60;return ret;
			}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))))
					
			{
				double ret = input*3600;return ret;
			}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))))
					
			{
				double ret = input/(365*24);return ret;
			}
		
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))))
					
			{
				double ret = 24* input;return ret;
			}
		
		
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))))
					
			{
				double ret = input/365;return ret;
			}
		

		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitminute))))
					
			{
				double ret = input/(24*60);return ret;
			}
		

		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))))
					
			{
				double ret = input/(24*3600);return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunithour))))
					
			{
				double ret = input/365;return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitday))))
					
			{
				double ret = 365* input;return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitminute))))
					
			{
				double ret = 365*60*24*input;return ret;
			}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunityear))
				&& (to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.Timeunitsecond))))
					
			{
				double ret = 365*3600*24* input;return ret;
			}
		
		
	 if(from.equals(to))
	 {
		return input;
	 }
	 return 0.0;
	 }
	
	

}
