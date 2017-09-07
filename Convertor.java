package com.otsi.hive.timestamp;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class Convertor extends UDF {
	public Text evaluate(String date) {
		Text text = null;
		String dt = "";
		String time = "";
		String time1 = "";
		String time2 = "";
		//Act date = 20160809 00:00
		String[] dt_ts = date.split("\\s+");
		time1 = dt_ts[0].trim();
		time2 = dt_ts[1].trim();
		if (time1.length()==8) {
			String year = time1.substring(0,4);
			String month = time1.substring(4,6);
			String dateVal = time1.substring(6,8);			
			
			dt = year+"-"+month+"-"+dateVal;
			//text = new Text(dt);
			//return text;
		}
		if(dt_ts[1].trim().length() == 4){
			String qhour1 = time2.substring(0,2);
			String qhour2 = time2.substring(2,4);
			time = qhour1+":"+qhour2+":00";
			//text = new Text(time);			
		}
		text = new Text(dt+" "+time);
		return text;		
		
		/*Text text = null;
		String oldFormat = "MM/dd/yyyy hh:mm:ss a";
		String newFormat = "yyyy-MM-dd HH:mm:ss";
		 
		SimpleDateFormat sdf1 = new SimpleDateFormat(oldFormat);
		SimpleDateFormat sdf2 = new SimpleDateFormat(newFormat);
		if (StringUtils.isNotEmpty(date)) {		
		
		try {
			String s  =sdf2.format(sdf1.parse(date));
			text = new Text(s);
			return text;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
		}
		else
			return new Text("2000-01-01 00:00:00");*/
	}
}
