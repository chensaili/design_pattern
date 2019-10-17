package observer_pattern.tradition.myself;

public class WeatherData {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    private CurrentConditions mCurrentConditions;
    public WeatherData(CurrentConditions mCurrentConditions){
        this.mCurrentConditions=mCurrentConditions;
    }
    public float getmTemperatrue() {
        return mTemperatrue;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

   public void dataChange(){
        mCurrentConditions.update(getmTemperatrue(),getmPressure(),getmHumidity());
   }

   public void setData(float mTemperature,float mPressure,float mHumidity){
       this.mTemperatrue=mTemperature;
       this.mPressure=mPressure;
       this.mHumidity=mHumidity;
       dataChange();
   }
}
