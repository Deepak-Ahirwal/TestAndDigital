package com.anddigital.app.exception;

public enum ErrorMessages {

	
	/*
	 * MISSING_REQUIRED_FIELD("Missing required field. Please check documentation for required fields"
	 * ), COULD_NOT_REGISTER_DEVICE("Could not register device"),
	 * COULD_NOT_CREATE_AWS_THING("Could not create AWS Thing in AWS IoT Core.Please try again later."
	 * ), COULD_NOT_UPDATE_DEVICE("Could not update device details"),
	 * COULD_NOT_DELETE_DEVICE("Could not delete device details"),
	 * NO_RECORD_FOUND("No record found for provided device id"),
	 * NO_GATEWAY_RECORD_FOUND("No record found for provided gateway id"),
	 * DEVICE_ALREADY_PROVISIONED("This thing is already provisioned in AWS."),
	 * GATEWAY_ALREADY_PROVISIONED("This gateway is already provisioned."),
	 * RECORD_ALREADY_EXISTS("Device record already exists. Please try to register another device."
	 * ), DEVICE_ALREADY_EXISTS("Thing already exists in AWS with same name."),
	 * INTERNAL_SERVER_ERROR("Something went wrong. Please repeat this operation later."
	 * ), NO_DEVICE_DETAILS_FOUND("No device details found."),
	 * UNABLE_TO_SAVE_DEVICE_TYPE("Unable to save device type"),
	 * DEVICE_TYPE_EXISTS("This device type already exists"),
	 * NO_DEVICE_TYPE_EXISTS("Unable to find this device type"),
	 * NO_RECORDS_IN_INPUT_FILE("No records found in file"),
	 * NO_DEVICE_DETAILS_FOUND_FOR_DELETION("No device details found for deletion"),
	 * RETRIEVAL_ISSUES_FOR_DEVICE_DETAILS("Unable to fetch device details. Please try again later"
	 * ),
	 * UNABLE_TO_CONNECT("Unable to connect mqtt broker. Please try again later"),
	 * INVALID_USER("Invalid Credentials"),
	 * CITY_AND_COUNTRY_EXISTS("Location (City and Country) already exists"),
	 * LAT_LONG_EXISTS("Location (Latitude and Longitude) already exists"),
	 * LAB_EXISTS_AT_LOCATION("Laboratory with this name already exists at this location"
	 * ),
	 * INVALID_DATA("Invalid data in the file. Please check the data and try again."
	 * ),
	 * UNABLE_TO_DELETE_DEVICE_TYPE("Device type cannot be deleted as devices associated with this device type"
	 * ), UNABLE_TO_PUBLISHED("Unable to publish device. Please try again later");
	 */
	COULD_NOT_REGISTER_USER("Could not register user"),
	UNABLE_TO_PUBLISHED("Unable to publish device. Please try again later"),
	NUMBER_NOT_FOUND("Entered number not found");
	
    
   private String errorMessage;
   
   ErrorMessages(String errorMessage)
   {
      this.errorMessage = errorMessage;    
   }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
