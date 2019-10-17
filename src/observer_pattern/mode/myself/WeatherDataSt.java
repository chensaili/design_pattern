package observer_pattern.mode.myself;

import observer_pattern.observer.myself.Observer;
import observer_pattern.observer.myself.Subject;

import java.util.ArrayList;

public class WeatherDataSt implements Subject {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    private ArrayList<Observer> mObservers;

    public WeatherDataSt(){
        mObservers=new ArrayList<Observer>();
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
        notifyObservers();
    }

    public void setData(float mTemperatrue,float mPressure,float mHumidity){
        this.mTemperatrue=mTemperatrue;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        mObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i=0,len=mObservers.size();i<len;i++){
            mObservers.get(i).update(getmTemperatrue(), getmPressure(), getmHumidity());
        }
    }
}
