import java.text.SimpleDateFormat;
import java.util.Date;

public class Administrator 
{
         private String thisTime;
         private String thisClockDate;
	 private SimpleDateFormat dateFormatDate;
         private SimpleDateFormat clockDate;
	 private Date nowDate;
	 
	 public  Administrator()
	 {
		 dateFormatDate = new SimpleDateFormat("dd.MM");
                 clockDate=new SimpleDateFormat("HH:mm:ss/dd.MM.yyyy");
		 nowDate = new Date();
	 }
	 public String getThisDayTime()
	 {
		 thisTime = dateFormatDate.format(nowDate);
		 return thisTime;
	 }
         public String getThisClock()
         {
             thisClockDate = clockDate.format(nowDate);
             return thisClockDate;
         }
	 
}