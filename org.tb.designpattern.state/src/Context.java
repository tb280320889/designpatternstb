/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:14
 */

public class Context {
	private Weather weather;

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public String weatherMessage(){
		return weather.getWwather();
	}
}
