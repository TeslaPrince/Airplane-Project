
public class AirplaneFlightNumberArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<integer> flightNum = new ArrayList<integer>();
		flightNum.add(   ); 
		flightNum.add(   );
		flightNum.add(   );


		ExcelFile workbook = ExcelFile.load("StateFlightTimes.xlsx");
		ExcelWorksheet worksheet = workbook.getWorksheet(0);
		ExcelColumn column = worksheet.getColumn(" ");

		for (int i = 0; i < ticket.size(); i++) {
			Integer value = flightNum.get(i);
			column.getflightNum(i).setflightNum(flightNum);
		}

		workbook.save("StateFlightTimes.xlsx");
	    
	    

}
