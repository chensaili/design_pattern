package state_pattern.state.myself;

//这个接口代表各个状态下的动作，即每个状态都会包含这些状态
public interface State {
    public void insertCoin();
    public void returnCoin();
    public void turnCrank();
    public void dispense();
    public void printstate();
}
