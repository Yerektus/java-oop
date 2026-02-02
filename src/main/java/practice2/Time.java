package practice2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public void setTime(int hour, int minutes, int second) {
		if (hour >= 0 && hour <= 24) this.hour = hour;
		if (minute >= 0 && minute <= 60) this.minute = minutes;
		if (second >= 0 && second <= 60) this.second = second;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}
	
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
	public String toStandard() {
		int stdHour = hour % 12;
		
		if (hour == 0) hour = 12;
		
		String amPm = (hour < 12) ? "AM" : "PM";
		return String.format("%02d:%02d:%02d %s", stdHour, this.minute, this.second, amPm);
	}
	
	public void add(Time other) {
		int total = this.toSeconds() + other.toSeconds();
		total %= 24 * 60 * 60;
		fromSeconds(total);
	}
	
	public static Time add(Time a, Time b) {
        int total = (a.toSeconds() + b.toSeconds()) % (24 * 60 * 60);
        Time result = new Time(0, 0, 0);
        result.fromSeconds(total);
        return result;
    }
	
	private int toSeconds() {
		return this.hour * 3600 + this.minute * 60 + this.second;
	}
	
	private void fromSeconds(int totalSeconds) {
		this.hour = totalSeconds / 3600;
		totalSeconds %= 3600;
		this.minute = totalSeconds / 60;
		this.second %= totalSeconds % 60;
	}
}
