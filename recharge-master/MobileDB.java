package demo;

import java.io.*;

public class MobileDB {
	
	InputStreamReader ir= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(ir);
	
	
	

	int  customer_id,count=0;
	String mobile_number;
	String company,customer_name, address;
	
	
	
	
	
	
	void Add_number()throws IOException
	{
		try
		{
			System.out.println("Enter the mobile number");
			mobile_number=br.readLine();
			
			for (int i = 0; i < mobile_number.length(); i++) {
                char chr = mobile_number.charAt(i);  
                
                if (Character.isDigit(chr))
                    count = count + chr;
			}	
			if(count>10 || count<10)
				System.out.println("Enter a valid mobile number");
			
			else
				
				throw new NumberException();
			
			
		}
		
		catch(NumberException e)
		
		{
			System.out.println("Enter a 10 digit number");
			
		}
	}
	
	
	
	
	
	
	
		
		int Display_mobilenumber_Record(int flight_id)
		{
			int i = Integer.parseInt(mobile_number);
			return i;
		}

		public int getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getCustomer_name() {
			return customer_name;
		}

		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		
		
		
		
		
		
		
	public MobileDB(int cid, String comp, String cname, String adr)
		{
			customer_id=cid;
			company=comp;
			customer_name=cname;
			address=adr;
		}
			
		}