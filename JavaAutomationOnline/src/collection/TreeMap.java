package collection;

public class TreeMap {

	public static void main(String[] args) {

		java.util.TreeMap<String, String> placesInChennai=new java.util.TreeMap<String, String>();
		placesInChennai.put("madhavaram", "chennai");
		placesInChennai.put("perambur", "chennai");
		placesInChennai.put("vysarpadi", "chennai");
		placesInChennai.put("molakadai", "chennai");
		placesInChennai.put("aambur", "chennai");
		//duplicate key will override with last value
		placesInChennai.put("chennai", "T.ngar");
		placesInChennai.put("chennai", "kodambakam");
		System.out.println("placeinchennai :"+placesInChennai);

	}

}
