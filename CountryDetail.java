    
	class CountryDetail{
		String name;
		int countryCode;
	
		CountryDetail(String name,int code)
		{
			this.name=name;
			this.countryCode=code;

	void displayDetails()
		{
			System.out.println(this.name);
			System.out.println(this.countryCode);
		}
	}
	}