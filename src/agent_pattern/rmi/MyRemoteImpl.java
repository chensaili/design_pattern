package agent_pattern.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

//第二步、第三步：远程接口的实现和RMI服务端注册
@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello World!";
	}
	public static void main(String[] args) {
		try {
			//RMI服务端注册
			MyRemote service=new MyRemoteImpl();
			// LocateRegistry.createRegistry(6600);  
			Naming.rebind("rmi://127.0.0.1:6600/RemoteHello", service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println( e.toString());
		}
	}
}
