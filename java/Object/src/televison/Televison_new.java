package televison;

class Televison_new {

	public static void main(String args[]) {
		Televison tv1 = new Televison();
		Televison tv2 = new Televison();

		tv1.setPlace("居間");
		tv2.setPlace("寝室");

		tv1.setChannel(1);
		tv2.setChannel(8);

		tv1.dispChannel();
		tv2.dispChannel();
	}
}

class Televison{
	int channelNo;
	String place;

	void setChannel(int newChannelNo){
		channelNo = newChannelNo;
	}

	void setPlace(String newPlace){
		place = newPlace;
	}

	void dispChannel(){
		System.out.println(place + "にあるテレビの現在のチャンネルは " + channelNo + "です。");
	}
}
