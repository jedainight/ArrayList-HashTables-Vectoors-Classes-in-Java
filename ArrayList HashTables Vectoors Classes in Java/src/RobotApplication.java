
public class RobotApplication {

	public static void main(String[] args) {
		Robot MrRobot= new Robot();
		MrRobot.setState("�� ����������");
		MrRobot.setVelocity(3);
		MrRobot.setTemp(256);
		//�� ������� 5-8 ������� �� ������������ �� ��� �� ��� �������� ������������
		//Robot MrRobot= new Robot("�� ����������",3,256);
		MrRobot.printvalues();
		MrRobot.setVelocity(5);
		MrRobot.setTemp(355);
		MrRobot.checktemp();
		MrRobot.printvalues();		
	}

}
