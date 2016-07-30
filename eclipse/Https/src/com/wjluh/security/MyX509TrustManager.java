package com.wjluh.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/**
 * 
 * @author JIE
 * 
 */
public class MyX509TrustManager implements X509TrustManager {

	X509TrustManager trustManager;

	public MyX509TrustManager() throws Exception {

		KeyStore ks = KeyStore.getInstance("JKS");
		String javahome = System.getProperty("java.home");
		ks.load(new FileInputStream(javahome+File.separator+"lib\\security\\cacerts"),
				"changeit".toCharArray());
		TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509",
				"SunJSSE");
		tmf.init(ks);
		TrustManager tms[] = tmf.getTrustManagers();

		for (int i = 0; i < tms.length; i++) {
			if (tms[i] instanceof X509TrustManager) {
				trustManager = (X509TrustManager) tms[i];
				return;
			}
		}
	}

	public void checkClientTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {
		try {
			trustManager.checkClientTrusted(chain, authType);
		} catch (CertificateException excep) {

		}
	}

	public void checkServerTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {
		try {
			trustManager.checkServerTrusted(chain, authType);
		} catch (CertificateException excep) {

		}
	}

	public X509Certificate[] getAcceptedIssuers() {
		return trustManager.getAcceptedIssuers();
	}
}
