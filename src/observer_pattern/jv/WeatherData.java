package observer_pattern.jv;

import java.util.Observable;

public class WeatherData extends Observable{
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	
	public float getTemperature()
	{
		return mTemperatrue;
		
	}
	
	public float getPressure()
	{
		return mPressure;
		
	}
	
	public float getHumidity()
	{
		return mHumidity;
		
	}
	
	
	public void dataChange()
	{
		this.setChanged();//必须有
		this.notifyObservers(new Data(getTemperature(),getPressure(),getHumidity()));
		
	}
	
	
	public void setData(float mTemperatrue,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperatrue;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}

	//这个内部类用来封装传输的数据
	public class Data {
		public float mTemperatrue;
		public float mPressure;
		public float mHumidity;
		public Data(float mTemperatrue,float mPressure,float mHumidity)
		{
			this.mTemperatrue=mTemperatrue;
			this.mPressure=mPressure;
			this.mHumidity=mHumidity;
		}
	}
	
}
