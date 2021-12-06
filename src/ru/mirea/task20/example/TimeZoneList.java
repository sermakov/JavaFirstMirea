package ru.mirea.task20.example;

import java.util.Arrays;
import java.util.TimeZone;

public class TimeZoneList
{
    private final int    hour       = 1000 * 60 * 60;
	private final String TEMPL_TZ   = "%s (%s)";
	private final String TEMPL_OFFS = "hour offset=(%d)";
	
    String align(String str, int len)
    {
        if (len - str.length() > 0){
            char[] buf = new char[len - str.length()];
            Arrays.fill (buf, ' ');
            return str + new String(buf);
        } else
            return str.substring(0, len);
    }

	private void drawTimeZoneParam(final TimeZone tz)
	{
        String line = null;
        line  = String.format(TEMPL_TZ, tz.getID(), tz.getDisplayName());
        line  = align(line, 64);
        line += String.format(TEMPL_OFFS, tz.getRawOffset() / hour);
        System.out.println(line);
	}
    public TimeZoneList() 
    {
        TimeZone tz = TimeZone.getDefault();
        int rawOffset = tz.getRawOffset();
        System.out.println("Текущая TimeZone : " + tz.getID() + 
        		         " (" + tz.getDisplayName() + ")\n");

        // Display all available TimeZones
        System.out.println("Доступные TimeZone\n");
        String[] timezones = TimeZone.getAvailableIDs();

        for (int cnt = 0; cnt < timezones.length; cnt++){
            tz = TimeZone.getTimeZone(timezones[cnt]);
            drawTimeZoneParam(tz);
        }
        // Display all available TimeZones same as for Moscow
        System.out.println("\nСписок TimeZones, соответствующие текущей\n");
        timezones = TimeZone.getAvailableIDs(rawOffset);
        for(int cnt = 0;cnt < timezones.length;cnt++){
            tz = TimeZone.getTimeZone(timezones[cnt]);
            drawTimeZoneParam(tz);
        }
    }
    public static void main(String[] args)
    {
    	new TimeZoneList();
    	System.exit(0);
    }
}
