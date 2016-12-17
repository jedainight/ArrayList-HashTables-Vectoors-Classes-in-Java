
public class RobotApplication {

	public static void main(String[] args) {
		Robot MrRobot= new Robot();
		MrRobot.setState("σε εξερεύνηση");
		MrRobot.setVelocity(3);
		MrRobot.setTemp(256);
		//οι γραμμές 5-8 μπορουν να συγχωνευθούν σε μία με τον ακόλουθο κατασκευαστή
		//Robot MrRobot= new Robot("σε εξερεύνηση",3,256);
		MrRobot.printvalues();
		MrRobot.setVelocity(5);
		MrRobot.setTemp(355);
		MrRobot.checktemp();
		MrRobot.printvalues();		
	}

}
