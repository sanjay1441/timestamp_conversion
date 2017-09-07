package com.otsi.hive.timestamp;

import org.apache.hadoop.io.Text;

public class Tester {
/*	public static void main(String[] args) {
		Convertor conv = new Convertor();
		Text text = conv.evaluate("20161009 2030");
		System.out.println(text);
	}*/
/*public static void main(String[] args) {
	Text text = null;
	String date = "20160809	00:00";
	String[] dt_ts = date.split("\\s+");
	String oldFormat = "MM/dd/yyyy hh:mm:ss a";
	String newFormat = "yyyy-MM-dd HH:mm:ss";
	if (dt_ts[0].trim().length()==8) {
	String year = date.substring(0,4);
	String month = date.substring(4,6);
	String dateVal = date.substring(6,8);
	
	String time = year+"-"+month+"-"+dateVal+" "+"00:00:00";
	 
	System.out.println(time);
	}
	SimpleDateFormat sdf1 = new SimpleDateFormat(oldFormat);
	SimpleDateFormat sdf2 = new SimpleDateFormat(newFormat);

	try {
		String s  =sdf2.format(sdf1.parse(date));
		System.out.println(s);
		text = new Text(s);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
*/}
