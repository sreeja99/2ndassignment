package game;

public class ucSeven {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int position_A=0;
		int position_B =0;
		int count =0;

		//Welcome statement
		System.out.println("Welcome to Snake and Ladder Simulator");

		while(position_A<100 &&position_B<100) {
			//computation
			count+=1;
			int dieroll_A=(int) (Math.floor(Math.random()*10)%7);
			int dieroll_B=(int) (Math.floor(Math.random()*10)%7);
			int option=(int) (Math.floor(Math.random()*10)%3);

			switch(option) {
			case NO_PLAY:
				position_A=position_A;
				position_B=position_B;
				break;
			case LADDER:
				if (position_A+dieroll_A>100) {
					position_A=position_A;
				}
				else if(position_B+dieroll_B>100) {
					position_B = position_B;
				}
				else {
					position_A +=dieroll_A;
					position_B +=dieroll_B;
				}
				break;
			case SNAKE:
				if (position_A-dieroll_A>=0) {
					position_A -=dieroll_A;
				}
				else if(position_B-dieroll_B>=0) {
					position_B -=dieroll_B;
				}
				else {
					position_A =0;
					position_B =0;
				}
				break;
			}
		}
			System.out.println("Turns:"+count);
			System.out.println("Player A position:"+position_A+"\t Player B position:"+position_B);
			if(position_A ==100&&position_B<100) {
				System.out.println("Player A won");
			}
			else if(position_B==100&&position_A<100) {
				System.out.println("Player B won");
			}
			else if(position_A<100 && position_B<100) {
				System.out.println("No Player Won");
			}
			else {
				System.out.println("Both Won");
			}
		
	}

}
