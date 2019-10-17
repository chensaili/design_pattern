package agent_pattern.rmi;

import java.rmi.Naming;
//第四步：RMI代理端通过RMI查询到服务端，建立联系，通过接口调用远程方法
public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		try {
			MyRemote service=(MyRemote)Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
			String s=service.sayHello();
			System.out.println(s);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
