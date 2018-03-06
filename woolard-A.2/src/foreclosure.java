import java.util.ArrayList;

public class foreclosure {
	public ArrayList<String> date, county, type, sale_date, pAddress, pCity, pState, value, loan, name, state;
	public ArrayList<Integer> pZip, zip;
	private int len;
	
	public foreclosure() {
		//addName(forclose);
		
	}
	public String getDate(int row) {
		return date.get(row);
	}
	
	public void addDate(String d) {
		this.date.add(d);
	}

	public String getCounty(int row) {
		return county.get(row);
	}

	public void addCounty(String c) {
		this.county.add(c);
	}

	public String getType(int row) {
		return type.get(row);
	}

	public void addType(String t) {
		this.type.add(t);
	}

	public String getSale_date(int row) {
		return sale_date.get(row);
	}

	public void addSale_date(String d) {
		this.sale_date.add(d);
	}

	public String getpAddress(int row) {
		return pAddress.get(row);
	}

	public void addpAddress(String a) {
		this.pAddress.add(a);
	}

	public String getpCity(int row) {
		return pCity.get(row);
	}

	public void addpCity(String c) {
		this.pCity.add(c);
	}

	public String getpState(int row) {
		return pState.get(row);
	}

	public void addpState(String s) {
		this.pState.add(s);
	}

	public String getValue(int row) {
		return value.get(row);
	}

	public void addValue(String val) {
		this.value.add(val);
	}

	public String getLoan(int row) {
		return loan.get(row);
	}

	public void addLoan(String l) {
		this.loan.add(l);
	}

	public String getName(int row) {
		return name.get(row);
	}

	public void addName(String n) {
		this.name.add(n);
	}

	public String getState(int row) {
		return state.get(row);
	}

	public void addState(String st) {
		this.state.add(st);
	}

	public int getpZip(int row) {
		return pZip.get(row);
	}

	public void addpZip(String z) {
		int zip = Integer.parseInt(z);
		this.pZip.add(zip);
	}

	public int getZip(int row) {
		return zip.get(row);
	}

	public void addZip(String z) {
		int zip = Integer.parseInt(z);
		this.zip.add(zip);
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = name.size();
	}
	
}
