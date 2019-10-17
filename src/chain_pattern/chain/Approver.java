package chain_pattern.chain;

import chain_pattern.request.PurchaseRequest;

public abstract class Approver {
	 Approver successor;
	 String Name;

	public Approver(String Name) {
		this.Name=Name;
	}

	//每一层需要执行的动作
	public abstract void ProcessRequest( PurchaseRequest request);

	//设置指针指向哪里
	public void SetSuccessor(Approver successor) {
		// TODO Auto-generated method stub
		this.successor=successor;
	}
}
