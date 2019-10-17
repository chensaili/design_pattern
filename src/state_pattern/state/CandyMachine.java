package state_pattern.state;

public class CandyMachine {

	State mSoldOutState;
	State mOnReadyState;
	State mHasCoin;
	State mSoldState;
	State mWinnerState;
	private State state;//相当于是一个指针，如果state指向售罄状态，那么将会调用售罄状态下的方法
	private int count = 0;

	public CandyMachine(int count) {
		this.count = count;
		mSoldOutState = new SoldOutState(this);
		mOnReadyState = new OnReadyState(this);
		mHasCoin = new HasCoin(this);
		mSoldState = new SoldState(this);
		mWinnerState = new WinnerState(this);
		if (count > 0) {
			state = mOnReadyState;
		} else {
			state = mSoldOutState;
		}
	}

	//在每完成一次动作后，都要调用该方法来设置状态
	public void setState(State state) {
		this.state = state;
	}

	public void insertCoin() {
		state.insertCoin();
	}

	public void returnCoin() {
		state.returnCoin();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	//减少糖果机里的糖果
	void releaseCandy() {

		// TODO Auto-generated method stub
		if (count > 0) {
			count = count - 1;
			System.out.println("a candy rolling out!");
		}

	}

	public int getCount() {
		return count;
	}

	public void printstate() {
		state.printstate();
	}
}
