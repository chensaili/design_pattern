package observer_pattern.tradition;

public class WeatherData {
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private CurrentConditions mCurrentConditions;//展示板
	public WeatherData(CurrentConditions mCurrentConditions)
	{
	this. mCurrentConditions= mCurrentConditions;
	}
	
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
	//有新数据时会调用的函数
	public void dataChange()
	{
		mCurrentConditions.update(getTemperature(), getPressure(), getHumidity());
		}
	//气象局新数据传入的函数
	public void setData(float mTemperature,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperature;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}
	
}
