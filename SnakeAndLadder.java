package game;

public class ucSeven {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int position=0;

		//Welcome statement
		System.out.println("Welcome to Snake and Ladder Simulator");

		while(position<100) {
			//computation
			int dieroll=(int) (Math.floor(Math.random()*10)%7);
			int option=(int) (Math.floor(Math.random()*10)%3);

			switch(option) {
			case NO_PLAY:
				position=position;
				break;
			case LADDER :
				position+=dieroll;
				break;
			case SNAKE:
				if (position-dieroll>=0)
					position-=dieroll;
				else
				position=0;
				break;
			}
			System.out.println(position);
		}
	}

}
