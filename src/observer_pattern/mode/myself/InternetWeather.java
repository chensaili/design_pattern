package observer_pattern.mode.myself;

public class InternetWeather {
    public static void main(String[] args) {
        WeatherDataSt weatherDataSt=new WeatherDataSt();
        CurrentConditions currentConditions=new CurrentConditions();
        ForcastConditions forcastConditions=new ForcastConditions();

        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastConditions);

        weatherDataSt.setData(50,150,30);
    }
}
