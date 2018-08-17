class Televison {
	int channeNo;
	String place;

	void setChannel(int newChannelNo){
		channeNo = newChannelNo;
	}

	void setPlace(String newPlace){
		place = newPlace;
	}

	void dispChannel(){
		System.out.println(place + "にあるテレビの現在のチャンネルは" + channeNo + "です。");
	}
}
