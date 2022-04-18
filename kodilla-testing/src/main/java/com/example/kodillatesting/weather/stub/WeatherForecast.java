package com.example.kodillatesting.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperatures() {
        double summedTemperatures = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            summedTemperatures += temperature.getValue();
        }
        double averageTemperatures = summedTemperatures / temperatures.getTemperatures().size();
        return averageTemperatures;
    }

    public double calculateTemperaturesMedian() {
        List<Double> temperaturesList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);
        if (temperaturesList.size() % 2 == 1) {
            return temperaturesList.get((temperaturesList.size() + 1) / 2 - 1);
        }
        double lower = temperaturesList.get(temperaturesList.size() / 2 - 1);
        double upper = temperaturesList.get(temperaturesList.size() / 2);
        return (lower + upper) / 2.0;
        }
}