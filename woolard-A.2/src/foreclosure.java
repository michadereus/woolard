import java.util.ArrayList;

public class foreclosure {
	ArrayList<String> city = new ArrayList<String>(); ArrayList<String> address = new ArrayList<String>(); ArrayList<String> date = new ArrayList<String>(); ArrayList<String> county= new ArrayList<String>() ; ArrayList<String> type= new ArrayList<String>(); ArrayList<String> sale_date= new ArrayList<String>(); ArrayList<String> pAddress= new ArrayList<String>(); ArrayList<String> pCity= new ArrayList<String>(); ArrayList<String> pState= new ArrayList<String>(); ArrayList<String> value= new ArrayList<String>(); ArrayList<String> loan= new ArrayList<String>(); ArrayList<String> name= new ArrayList<String>();ArrayList<String> state= new ArrayList<String>();
	ArrayList<String> pZip= new ArrayList<String>(); ArrayList<String> zip= new ArrayList<String>();
	int len;
	
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

	public String getpZip(int row) {
		return pZip.get(row);
	}

	public void addpZip(String z) {
		this.pZip.add(z);
	}

	public String getZip(int row) {
		return zip.get(row);
	}

	public void addZip(String z) {
		this.zip.add(z);
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = name.size();
	}
	public void addAddress(String string) {
		this.address.add(string);
	}
	public String getAddress(int row) {
		return address.get(row);
	}
	public void addCity(String cit) {
		this.city.add(cit);
	}
	public String getCity(int row) {
		return city.get(row);
	}
	
}
