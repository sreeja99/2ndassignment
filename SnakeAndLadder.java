package game;

public class secDay {
	public static  final int NO_PLAY = 0;
	public static  final int LADDER = 1;
	public static  final int SNAKE =2;
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0;
		double dieroll = (Math.floor(Math.random() *10 )%6)+1;
		System.out.println("dieroll:"+dieroll);
		double option = (Math.floor(Math.random() *10 )%3);
		System.out.println("option:" +option);
		switch((int)option) {
		case NO_PLAY :
			System.out.println("position:"+(position += position));
			break;
		case LADDER :
			System.out.println("position:"+(position += dieroll));
			break;
		case SNAKE :
			System.out.println("position:"+(position -= dieroll));
			break;
			
		}
		

	}

}

