package observer_pattern.mode.myself;

import observer_pattern.observer.myself.Observer;
import org.omg.CORBA.Object;

public class ForcastConditions implements Observer {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperatrue, float mPressure, float mHumidity) {
        // TODO Auto-generated method stub
        this.mHumidity = mHumidity;
        this.mPressure = mPressure;
        this.mTemperatrue = mTemperatrue;
        display();
    }

    public void display() {
        System.out.println("***tomorrow mTemperatrue:" + mTemperatrue + "***");
        System.out.println("***tomorrow mPressure:" + mPressure + "***");
        System.out.println("***tomorrow mHumidity:" + mHumidity + "***");

    }
}
