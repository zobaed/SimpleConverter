package com.android.unitconverter;

public class MoneyStrategy implements Strategy {

	public double Convert(String from, String to, double input) {
		// TODO Auto-generated method stub
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunittk))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdollar)))
		{
			double ret = input/79.2;
			return ret;
		}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunittk))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitpound)))	
				{
					double ret = input*.0083;
					return ret;
						}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunittk))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniteuro)))	
				{
					double ret = input*.01;
					return ret;
						}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniteuro))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunittk)))	
				{
					double ret = input/.01;
					return ret;
						}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniteuro))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdollar)))	
				{
					double ret = input*1.31;
					return ret;
						}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniteuro))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitpound)))	
				{
					double ret = input*.83;
					return ret;
						}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitpound))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniteuro)))	
				{
					double ret = input/.83;
					return ret;
						}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitpound))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunittk)))	
				{
					double ret = input/120.69;
					return ret;
						}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitpound))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdollar)))	
				{
					double ret = input*1.56;
					return ret;
						}
		
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdollar))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunittk)))	
				{
					double ret = input*79.20;
					return ret;
						}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdollar))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniteuro)))	
				{
					double ret = input*.76;
					return ret;
						}
		if(from.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdollar))
				&& to.equals(UnitConverter.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitpound)))	
				{
					double ret = input*.64;
					return ret;
						}
		
			
			
			
			
		if(from.equals(to))
		{
			return input;
		}
		
		
		return 0;
	}

}
