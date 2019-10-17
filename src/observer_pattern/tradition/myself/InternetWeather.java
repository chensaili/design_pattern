package observer_pattern.tradition.myself;

public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions currentConditions=new CurrentConditions();
        WeatherData weatherData=new WeatherData(currentConditions);
        weatherData.setData(50,140,30);
    }
}
