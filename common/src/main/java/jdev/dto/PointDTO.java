package jdev.dto;

/**
 * Created by Pavilion on 21.06.2017.
 */
public class PointDTO {
    private double lat;
    private double lon;
    private String autoId;
    private long time;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getAutoId() {
        return autoId;
    }

    public void setAutoId(String autoId) {
        this.autoId = autoId;
    }

    public long getTime() {
        return time;
    }

    public String toJson() {
        return "PointDTO(" +
                "lat=" + lat +
                " lon=" + lon +
                " autoID"+autoId + '\'' +
                ")";
    }

    @Override
    public String toString() {
        return "PointDTO{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", autoId='" + autoId + '\'' +
                '}';
    }

    public void setTime(long time) {
        this.time = time;
    }

}
