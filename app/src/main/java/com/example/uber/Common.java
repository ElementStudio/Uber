package com.example.uber;

import com.example.uber.Model.DriverInfoModel;

public class Common {
    public static final String DRIVER_INFO_REFERENCE = "Driver Info";
    public static final String DRIVERS_LOCATION_REFERENCE = "DriversLocation";
    public static final String TOKEN_REFERENCE = "Token";

    public static DriverInfoModel currentUser;

    public static String buildWelcomeMessage() {
        if (Common.currentUser != null) {
            return String.valueOf(new StringBuilder("Welcome ")
                    .append(Common.currentUser.getFirstName())
                    .append(" ")
                    .append(Common.currentUser.getLastName()));
        }
        else
        return  "";
    }
}
