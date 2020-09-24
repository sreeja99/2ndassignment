package game;

public class secDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0;
		double dieroll = (Math.floor(Math.random() *10 )%6)+1;
		System.out.println("dieroll:"+dieroll);
		position += dieroll;
		System.out.println("current position:"+position);

	}

}
