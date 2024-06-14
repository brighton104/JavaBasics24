package oops;

public class Interface {

	public static void main(String[] args) {
		
		Audiocall ad=new Audiocall();
		ad.call();
		ad.mute();
		ad.disconnect();
		
		Videocall vd=new Videocall();
		vd.call();
		vd.mute();
		vd.disconnect();
		
		//Single reference object creation for two classes
		System.out.println("Single object reference.......");
		
		Whatsappcall wc=new Audiocall();
		wc.call();
		wc.mute();
		wc.disconnect();
		
		wc=new Videocall();
		wc.call();
		wc.mute();
		wc.disconnect();
		
		//all variables in interface are static variable
		System.out.println(Whatsappcall.a);

	}

}

interface Whatsappcall
{
	int a=10;
	void call();
	void mute();
	void disconnect();
	
}


class Audiocall implements Whatsappcall
{

	@Override
	public void call() {
		System.out.println("Audio Call");
		
	}

	@Override
	public void mute() {
		System.out.println("Audio Muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Audio Disconnected");
		
	}
	
}

class Videocall implements Whatsappcall
{

	@Override
	public void call() {
		System.out.println("Video Call");
		
	}

	@Override
	public void mute() {
		System.out.println("Video Muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Video Disconnected");
		
	}
	
}