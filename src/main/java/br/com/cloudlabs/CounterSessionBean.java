package br.com.cloudlabs;


import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Stateful
@SessionScoped
@Named("counter")
public class CounterSessionBean {

	private int counter;

	public int getCounterValue() {
		return counter++;
	}

}
