/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iRail;

/**
 *
 * @author Maartje
 */
public class Connection {
    public String departureTime;
    public String arrivalTime;
    public String trainTypes;
    public String viaText;

    public Connection(String departureTime, String arrivalTime, String trainTypes, String viaText) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.trainTypes = trainTypes;
        this.viaText = viaText;
    }
    
    
    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getTrainTypes() {
        return trainTypes;
    }

    public void setTrainTypes(String trainTypes) {
        this.trainTypes = trainTypes;
    }

    public String getViaText() {
        return viaText;
    }

    public void setViaText(String viaText) {
        this.viaText = viaText;
    }
}