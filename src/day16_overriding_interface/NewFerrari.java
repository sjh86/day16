package day16_overriding_interface;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye, int speed) {
		super(ye, speed);
	}
	public void autoSystem() {
		System.out.println("자동운전 모드를 시작합니다");
	public void speed() {
		System.out.println(getYe()+"년 페라리 속도"+ super.getSpeed()+"km 입니다")
	}
}
