public class myvehicle

{
	 public static void main(String args[])
	 {
		  Vehicle mycar = new Vehicle("Car1");
		  mycar.display();

		  Car car = new Car("car","x3","bmw");
		
		  mycar=car;
		  mycar.display();
 	}
}

class Vehicle
{
	 private String vehicle_type;
	 Vehicle(String vehicle_type)
	 {
	 	this.vehicle_type= vehicle_type;
	 }
	 void display()
	 {
		System.out.println(vehicle_type);
 	 }

	 protected String getVehicleType()
	 {
	  	return vehicle_type;
	 } 
}

class Car extends Vehicle
{
	private String model_type;
	private String company_name;

	Car()
	{
		 super(null);
	}

	Car(String vehicle_type,String model_type,String company_name)
	{
		  super(vehicle_type);
		  this.model_type=model_type;
		  this.company_name=company_name;
	}
	
	void display()
	{
		  System.out.println(super.getVehicleType());
		  System.out.println(this.model_type);
		  System.out.println(this.company_name);
	}
}
