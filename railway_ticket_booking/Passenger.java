package railway_ticket_booking;
public class Passenger
{
	static int id = 1;
	String name;
	int age;
	String berthPreference;// U or M or L
	int passengerId;// Id of passenger created automatically
	String alloted;// alloted type(L,U,M,RAC,WL)
	int number;// Seat number
	public void PassengerDetails(String name, int age, String berthPreference) 
	{
		this.name = name;
		this.age = age;
		this.berthPreference = berthPreference;
		this.passengerId = id++;
		alloted = " ";
		number = -1;
	}
}
