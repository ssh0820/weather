package zerobase.weather.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String weather;
    private String icon;
    private String text;
    private double temperature;
    private LocalDate date;

    public void setDateWeather(DateWeather dateWeather) {
        this.date = dateWeather.getDate();
        this.weather = dateWeather.getWeather();
        this.icon = dateWeather.getIcon();
        this.temperature = dateWeather.getTemperature();
    }
}
