
public class Robot {
	String state;
	float velocity;
	float temp;
	
	
	Robot()
	{
		state=null;
		velocity=0;
		temp=0;
	}
	Robot(String s, float v, float t)
	{
		state=s;
		velocity=v;
		temp=t;
	}
	void checktemp()
	{
		if(temp>350)
		{	
			state="��������� ��� ����";
			velocity=8;
		}
	}
	void printvalues()
	{
        System.out.println("----��������� ��������----");        
        System.out.println("���������: " + state + ", ��������: " + velocity + ", �����������: "+ temp); 
        
	}
	void setState(String s)
	{
		state=s;
	}
	void setTemp(float t)
	{
		temp=t;
	}
	void setVelocity(float v)
	{
		velocity=v;
	}

}
