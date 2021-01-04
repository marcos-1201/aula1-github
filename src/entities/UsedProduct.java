package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " (used) $ ");
		sb.append(String.format("%.2f", getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(sdf.format(manufactureDate) + ")");
		return sb.toString();
	}
}