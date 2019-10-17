package observer_pattern.tradition.myself;

public class CurrentConditions {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    public void update(float mTemperatrue,float mPressure,float mHumidity){
        this.mTemperatrue=mTemperatrue;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        display();
    }
    public void display(){
        System.out.println("***Today mTemperature: "+mTemperatrue+"***");
        System.out.println("***Today mPressure: "+mPressure+"***");
        System.out.println("***Today mHumidity: "+mHumidity+"***");
    }
}
