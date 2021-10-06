class CurrencyStarter{


  public static void main(String[] pooja)
  {
	  Currency currency=new Currency();
	  currency.name="rupee";
	  currency.country="india";
	  currency.value=100;
	  currency.displayDetails();
	  
	  Currency.country=new CountryDetail("eurpoe",78);
	  System.out.println(Currency.country);
	  CountryDetail country=currency.country;
	  country.displayDetails();
	  Application application=new Application("java", 12.7);
	  application.displayDetails();
	  application.company=new CompanyDetail("oracle","satya","san");
	  CompanyDetail company=application.company;
	  company.country=new CountryDetail();
	  CountryDetail1 country1=company.country;
	  country1.displayDetails();
	  
  }
}