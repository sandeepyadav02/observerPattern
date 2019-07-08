package observerPattern;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver stockObserver1 = new StockObserver(stockGrabber);
		stockGrabber.setGooglePrice(12);
		stockGrabber.setIbmPrice(13);
		
		StockObserver stockObserver2 = new StockObserver(stockGrabber);
		stockGrabber.setGooglePrice(12);
		stockGrabber.setIbmPrice(13);
		stockGrabber.register(stockObserver2);
		
		// TODO Auto-generated method stub

	}

}
