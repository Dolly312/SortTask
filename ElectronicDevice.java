package p1;

public class ElectronicDevice {
	 int power;
	 int speed;
	 int deviceNumber;
	 //private Memory memo;
	 //private Bluetooth bt;
	 private int price;
	 private int rating;
	 

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public ElectronicDevice() {
		// TODO Auto-generated constructor stub
		
	}
	/*public Memory getMemo() {
		return memo;
	}
	public void setMemo(Memory memo) {
		this.memo = memo;
	}
	/*public Bluetooth getBt() {
		return bt;
	}
	public void setBt(Bluetooth bt) {
		this.bt = bt;
	}*/
	
	public ElectronicDevice(int power, int speed, int deviceNumber,
			 int price, int rating) {
		super();
		this.power = power;
		this.speed = speed;
		this.deviceNumber = deviceNumber;
		/*this.memo = memo;
		this.bt = bt;*/
		this.price = price;
		this.rating = rating;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDeviceNumber() {
		return deviceNumber;
	}
	public void setDeviceNumber(int deviceNumber) {
		this.deviceNumber = deviceNumber;
	}
	public void setPower(int power)
    {
    	this.power=power;
    }
    public int getPower()
    {
    	return power;
    }
    public void powerConsumption()
    {
    	power=power+10;
    	System.out.println("The total power consumption is :" +power + "W");
    }
    public void deviceNumber()
    {
    	System.out.println("The Device number is " + getDeviceNumber());
    }
	

}
