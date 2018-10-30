package demo;

	import java.io.*;
	public class Recharge extends MobileDB {
		
		int balance,recharge_amount;

		public Recharge(int cid, String comp, String cname, String adr, int bal) {
			super(cid, comp, cname, adr);
			balance=bal;
			
			// TODO Auto-generated constructor stub
		}
		
		
		void Display_balance()
		{
			System.out.println("Balance is: "+balance);
		}
		
		
		
		int Recharge1(int recharge_amount)
		{
			balance= balance + recharge_amount;
			return balance;
		}
		
		
		
		
		
		
		void Offer()
		{
			System.out.println("1.Recharge Rs 10 and get 8 talktime");
			System.out.println();
			System.out.println("2.Recharge Rs 150 and get unlimited calls for a month");
			System.out.println();
			System.out.println("3.Recharge Rs 200 and get 10GB data for 30days");
			System.out.println();
			System.out.println("4.Full talktime on recharge of Rs 55, validity 5 days");
			System.out.println();
			System.out.println("5.Recharge Rs 100 and get 1 gb data and 60 mins free");
			System.out.println();
			System.out.println("6.Recharge of Rs 50 and get local calls at 60paise/min");
			System.out.println();
		}
		
		
		
		
		
		public static void main(String args[])throws IOException
		{
			
			InputStreamReader ir= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(ir);
			
			int b,balan;
			String q,r,s;
			
			System.out.println("Enter Customer ID ");
		    b=Integer.parseInt(br.readLine());
		    System.out.println();
		    
		    System.out.println("Enter Company ");
		    q=br.readLine();
		    System.out.println();
		    
		    System.out.println("Enter Name ");
		    r=br.readLine();
		    System.out.println();
		    
		    System.out.println("Enter Address ");
		    s=br.readLine();
		    System.out.println();
		    
		    System.out.println("Enter Balance ");
		    balan=Integer.parseInt(br.readLine());
		    System.out.println();
		    
			
			
			
			Recharge obj= new Recharge(b,q,r,s,100);
			
			obj.getCustomer_id();
			obj.setCustomer_id(b);
			
			obj.getCompany();
			obj.setCompany(q);
			
			obj.getCustomer_name();
			obj.setCustomer_name(r);
			
			obj.getAddress();
			obj.setAddress(s);
			
			obj.Offer();
			
			
			
			int a;
			System.out.println("Enter amount to recharge ");
			System.out.println();
		    a=Integer.parseInt(br.readLine());
			
			obj.Add_number();
			obj.Display_mobilenumber_Record(82);
			obj.Display_balance();
			System.out.println("Balance after Recharge is"+obj.Recharge1(a));
			
				
		}
		
		
		

	}


