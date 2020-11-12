Feature: Verify amount to pay

	Rule: The data was registered succesfully
	
		Scenario: Young man
			Given the client is a man
			And the client is not older than 25
			And the client has a driver licence
			When the client asks for car insurence
			Then the client will be charged 2000
		
		Scenario: Older man
			Given the client is a man
			And the client is older than 45
			But the client is younger then 65
			And the client has a driver licence
			When the client asks for car insurence
			Then the client will be charged 400
		
		Scenario: Young woman
			Given the client is a woman
			And the client is married
			And the client has a driver licence
			When the client asks for car insurence
			Then the client will be charged 400
