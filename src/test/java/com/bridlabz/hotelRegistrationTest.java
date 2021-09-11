package com.bridlabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


    // creating HotelReservation Test class
     class HotelReservationTest {

        @Test
        public void givenHotelNameAndRatesShouldReturnTrue() {
       /*
       creating a object of hotelReservation
        */
            HotelReservation hotelReservation = new HotelReservation();
            hotelReservation.add("BridgeWood", 160, 60);
            hotelReservation.add("LikeWood", 110, 90);
            hotelReservation.add("RidgeWood", 220, 150);
        }
    }