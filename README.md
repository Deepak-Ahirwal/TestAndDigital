# TestAndDigital

# Overview
## In this exercies we will create 3 APIs: 
	*get all phone numbers : Retrive the list of phone numbers 
	*get all phone numbers of a single customer : Retrive all the phone numbers of a single user/customer
	*activate a phone number : Activate a number
	
#Steps to run
	* Simply create a build
		```sh
		mvn clean install
		```sh
	* Once the jar file is ready go to the jar file path and run the jar file 
		```sh
		java -jar <file name>
		```sh
#End point URLs for APIs
	* get all phone numbers
		**http:/localhost:8080/allPhoneNumber
		
	* get all phone numbers of a single customer
		**localhost:8080/allPhoneNumberOfCustomer/101
		
	*activate a phone number
		##Post method
		** http://localhost:8080/activateUserNumber
			```sh
			{
				"userName":"Alice",
				"phoneNumber": "+447045024285"
			}
			```sh
		
	
