package br.com.cloudlabs;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.ejb.Stateless;
import javax.inject.Named;


@Stateless
@Named("infra")
public class InfraNodeBean {

	public String getNodeName() {
		try {
			String jbossNodeName = System.getProperty("jboss.node.name");

			return jbossNodeName != null ? jbossNodeName : InetAddress
					.getLocalHost().getHostName();

		} catch (UnknownHostException e) {
			throw new RuntimeException(e);
		}

	}
	


}
