package observerPattern;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double googlePrice;
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.googlePrice = googlePrice;
		
		
		// TODO Auto-generated method stub
		
	}

}
