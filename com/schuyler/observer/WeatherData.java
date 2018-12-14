import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class WeatherData implements Subject {
  private Set<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;
  
  public WeatherData() {
    this.observers = new HashSet<>();
  }

  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  public void removeObserver(Observer o) {
    this.observers.remove(o);
  }

  public void notifyObservers() {
    Iterator<Observer> itr = this.observers.iterator();
    while(itr.hasNext()){
      itr.next().update(this.temperature, this.humidity, this.pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers(); 
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
