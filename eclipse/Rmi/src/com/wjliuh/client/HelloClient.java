package com.wjliuh.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wjliuh.server.IHello;


public class HelloClient { 
    public static Logger log = Logger.getAnonymousLogger();
    
    public static void main(String args[]){ 
        try { 
            
            IHello rhello =(IHello) Naming.lookup("rmi://20.1.83.14:8888/RmiHello"); 
            log.log(Level.INFO, rhello.helloWorld());
        } catch (NotBoundException e) { 
            e.printStackTrace(); 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (RemoteException e) { 
            e.printStackTrace();   
        } 
    } 
}