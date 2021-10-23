package com.yxd.behavioral.observerPattern.demo04;

/**
 * 天气类
 */
public class Weather {
    /**
     * 温度
     */
    private String temperature;

    /**
     * 气压
     */
    private String pressure;

    /**
     * 湿度
     */
    private String humidity;

    public Weather(String temperature, String pressure, String humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("【温度:").append(this.temperature).append(",")
                .append("气压:").append(this.pressure).append(",")
                .append("湿度:").append(this.humidity).append("】");
        return sb.toString();
    }
}
