public class WeatherStation {
  public static void main(String[] args) {
    WeatherData wd = new WeatherData();

    CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
    wd.setMeasurements(60, 65, 30.4f);
    wd.setMeasurements(65, 75, 33.4f);
  }
}
