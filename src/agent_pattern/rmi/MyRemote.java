package agent_pattern.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
//RMI的第一步：创建接口文件
public interface MyRemote extends Remote{

	public String sayHello() throws RemoteException;
	
}
