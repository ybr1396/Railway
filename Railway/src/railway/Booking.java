package railway;
import java.util.*;

class BookingList{
	String name,gender,berthPerference;
	int age;
	public BookingList(String name,int age ,String gender, String berthPreference) {
		this.name=name;
		this.age = age;
		this.gender =gender;
		this.berthPerference=berthPreference;
	}
	public String getName() {
		return this.name;
	}
	public String getGender() {
		return this.gender;
	}
	public String getBerthPreference() {
		return this.berthPerference;
	}
	public int getAge() {
		return this.age;
	}
}


public class Booking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println("Hello World");
		int berthsCount=1,racCount=2,wlCount=2,totalComfort=3,totalCount=7;
		String lower[]= new String [50];
		String middle[]= new String[50];
		String upper[]= new String [50];
		 String siderac_berth[]= new String [racCount];
		 String waiting_list []= new String [wlCount];
		 int lindex=0,uindex=0,mindex=0,rindex=0,windex=0,tindex=0;
		 int age=0,con=1;
		 String name;
		 String gender;
		 String berthPreference;
		 Scanner sc= new Scanner(System.in);
		 while(con==1 && tindex<totalCount) {
			 System.out.println("Enter name: ");
			 System.out.println();
			 name=sc.nextLine();
			 System.out.println("Enter age: ");
			 System.out.println();
			 age =Integer.parseInt(sc.nextLine());
			 System.out.println("Select gender:");
			 System.out.println("M or F or O");
			 System.out.println();
			 gender=sc.nextLine();
			 System.out.println("Select berthPreference:");
			 System.out.println("LB or MB or UB");
			 System.out.println();
			 berthPreference=sc.nextLine();
			 List<BookingList> bl = new ArrayList<BookingList>();
			 //BookingList obl1 =new BookingList("ajith",20, "M","LB");
			 //BookingList obl2 =new BookingList("vicky",25, "M","UB");
			 //bl.add(obl1);
			 //bl.add(obl2);
			 if(lindex+uindex+mindex<totalComfort) {
				 if (berthPreference.equalsIgnoreCase("LB".trim())) {
					 if (lindex<berthsCount) {
						 BookingList obl =new BookingList(name,age, gender,berthPreference);
						 bl.add(obl);
						 lower[lindex]=bl.get(0).getName()+bl.get(0).getAge()+bl.get(0).getGender()+bl.get(0).getBerthPreference();
						 for(int i=0;i<=lindex;i++) {
							 System.out.println( lower[i]);
						 }
						 lindex++;
						 tindex++;
					 }
					 else {
						 System.out.println("Lower is full.");
					 }
				 }
				 else if(berthPreference.equalsIgnoreCase("UB".trim())){
					 if(uindex<berthsCount) {
						 BookingList obl =new BookingList(name,age, gender,berthPreference);
						 bl.add(obl);
						 upper[uindex]= bl.get(0).getName()+bl.get(0).getAge()+bl.get(0).getGender()+bl.get(0).getBerthPreference();
						 for(int i=0;i<=uindex;i++) {
							 System.out.println( upper[i]);
						 }
						 uindex++;
						 tindex++;
					 }
					 else {
						 System.out.println("Upper is full.");
					 }
				 }
				 else if(berthPreference.equalsIgnoreCase("MB".trim())) {
					 if(mindex<berthsCount) {
						 BookingList obl =new BookingList(name,age, gender,berthPreference);
						 bl.add(obl);
						 middle[mindex]= bl.get(0).getName()+bl.get(0).getAge()+bl.get(0).getGender()+bl.get(0).getBerthPreference();
						 for(int i=0;i<=mindex;i++) {
							 System.out.println( middle[i]);
						 }
						 mindex++;
						 tindex++;
					 }
					 else {
						 System.out.println("Middle is full.");
					 }
				 }
			 }
			 else {
				 if(rindex<racCount) {
					 System.out.println("Comfort is full booked for RAC.");
					 BookingList obl =new BookingList(name,age, gender,"RAC");
					 bl.add(obl);
					 siderac_berth[rindex]=bl.get(0).getName()+bl.get(0).getAge()+bl.get(0).getGender()+bl.get(0).getBerthPreference();
					 for(int i=0;i<=rindex;i++) {
						 System.out.println(siderac_berth[i]);
					 }
					 rindex++;
					 tindex++;
				 }
				 else{
					 if(windex<wlCount) {
						 System.out.println("RAC is full booked for Waitinglist.");
						 BookingList obl =new BookingList(name,age, gender,"WL");
						 bl.add(obl);
						 waiting_list[windex]=bl.get(0).getName()+bl.get(0).getAge()+bl.get(0).getGender()+bl.get(0).getBerthPreference();
						 for(int i=0;i<=windex;i++) {
							 System.out.println(waiting_list[i]);
						 }
						 windex++;
						 tindex++;
					 }
				 }
			 }
			 System.out.println("Enter 1 to continue");
			 con=Integer.parseInt(sc.nextLine());
		 }
		 System.out.println("No tickets available");
	}
}
