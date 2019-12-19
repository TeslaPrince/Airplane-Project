
public class AirplaneTicketPriceArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<price> ticket = new ArrayList<price>();
		ticket.add(   ); 
		ticket.add(   );
		ticket.add(   );


		ExcelFile workbook = ExcelFile.load("StateFlightTimes.xlsx");
		ExcelWorksheet worksheet = workbook.getWorksheet(0);
		ExcelColumn column = worksheet.getColumn(" ");

		for (int i = 0; i < ticket.size(); i++) {
			Price value = ticket.get(i);
			column.getPrice(i).setTicket(ticket);
		}

		workbook.save("StateFlightTimes.xlsx");
	    
	    
	}

}
