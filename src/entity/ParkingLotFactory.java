package entity;

import java.util.HashMap;

public class ParkingLotFactory {

    public static ParkingLot createParkingLot(String id, String website, String carparkType, float[] latLong, String streetAddress, String halfHourlyRate, HashMap<String, String> timesToRates) {

        ParkingLot parkingLot = new ParkingLot(streetAddress);
        parkingLot.setId(id);
        parkingLot.setWebsite(website);
//        parkingLot.setLatLong(latLong);
        parkingLot.setAddress(streetAddress);
        parkingLot.setHalfHourlyRate(halfHourlyRate);
        parkingLot.setTimestoRates(timesToRates);
        parkingLot.setCarparkType(carparkType);

        return parkingLot;
    }
}
