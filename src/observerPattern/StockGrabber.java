package observerPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double googlePrice;

	

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		observers.remove(observerIndex);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer:observers) {
			observer.update(ibmPrice, googlePrice);
			
		}
			
		// TODO Auto-generated method stub
		
	}
	
	

}
