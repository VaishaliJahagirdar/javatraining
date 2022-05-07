class DateDiffExample { 
private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
 public static void main(String args[]) throws ParseException{ 
 System.out.println("Please enter two dates in format yyyy/MM/dd to compare"); 
 Scanner reader = new Scanner(System.in); 
 String first = reader.nextLine(); 
 String second = reader.nextLine(); 
 Date one = getDate(first); 
 Date two = getDate(second); 
 long numberOfDays = daysBetween(one, two); 
 System.out.printf("Number of days between date %s and %s is : %d %n", first, second, numberOfDays); 
 int differenceBetweenDates = daysBetweenUsingJoda(one, two);
  System.out.printf("difference betweeen two dates %s and %s is : %d %n", first, second, differenceBetweenDates); 
  reader.close();
   }

private static Date getDate(String date) throws ParseException{ return df.parse(date);
 long difference =  (one.getTime()-two.getTime())/86400000;
        return Math.abs(difference);
    
}
public static int daysBetweenUsingJoda(Date d1, Date d2){ 
return Days.daysBetween( new LocalDate(d1.getTime()), new LocalDate(d2.getTime())).getDays();
 
 }
 }

