package com.wjliuh.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloServer {
    public static Logger log = Logger.getAnonymousLogger();
    public static void main(String args[]) {

	try {
	    IHello rmihello = new HelloImpl();
	    LocateRegistry.createRegistry(8888);
	    Naming.bind("rmi://20.1.83.22:8888/RmiHello", rmihello);
	    log.log(Level.INFO, "端口绑定成功！");
	} catch (RemoteException e) {
	    e.printStackTrace();
	} catch (AlreadyBoundException e) {
	    e.printStackTrace();
	} catch (MalformedURLException e) {
	    e.printStackTrace();
	}
    }
}