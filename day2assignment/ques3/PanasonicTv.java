package day2assignment.ques3;

public class PanasonicTv implements TvRemote{

	public void changeChannel() {
		System.out.println(getTvName()+" Channel changed");
	}

	public void changeVolume() {
		System.out.println(getTvName()+" Volume changed");		
	}

	public void switchOn() {
		System.out.println(getTvName()+" turned on");
	}

	public void switchOff() {
		System.out.println(getTvName()+" turned off");		
	}
	
	public String getTvName() {
		return "Panasonic Tv";
	}

}
