package resources;

import java.util.ArrayList;
//mport java.util.regex.*;

public class probates {
	/* GETTER TEMPLATE
	return ${field}.get(row);
	*/
	
	ArrayList<String> Date= new ArrayList<String>(); ArrayList<String> County= new ArrayList<String>(); ArrayList<String> Type= new ArrayList<String>(); ArrayList<String> Decedent= new ArrayList<String>(); ArrayList<String> pAddress= new ArrayList<String>(); ArrayList<String> City= new ArrayList<String>(); ArrayList<String> State= new ArrayList<String>(); ArrayList<String> pZip= new ArrayList<String>(); ArrayList<String> Value= new ArrayList<String>(); ArrayList<String> Name= new ArrayList<String>(); ArrayList<String> Address= new ArrayList<String>(); ArrayList<String> pCity= new ArrayList<String>(); ArrayList<String> pState= new ArrayList<String>(); ArrayList<String> Zip= new ArrayList<String>();
	
	public probates() {
		
	}
	public String getDate(int row) {
			return Date.get(row);
		}

	public String getCounty(int row) {
			return County.get(row);
		}

	public String getType(int row) {
			return Type.get(row);
		}

	public String getDecedent(int row) {
			return Decedent.get(row);
		}

	public String getpAddress(int row) {
			return pAddress.get(row);
		}

	public String getCity(int row) {
			return City.get(row);
		}

	public String getState(int row) {
			return State.get(row);
		}

	public String getpZip(int row) {
			return pZip.get(row);
		}

	public String getValue(int row) {
			return Value.get(row);
		}

	public String getName(int row) {
			return Name.get(row);
		}

	public String getAddress(int row) {
			return Address.get(row);
		}

	public String getpCity(int row) {
			return pCity.get(row);
		}

	public String getpState(int row) {
			return pState.get(row);
		}

	public String getZip(int row) {
			return Zip.get(row);
		}

	public void addDate(String t) {
		this.Date.add(t);
	}
	
	public void addCounty(String t) {
		this.County.add(t);
	}
	
	public void addDecedent(String t) {
		this.Decedent.add(t);
	}
	
	public void addType(String t) {
		this.Type.add(t);
	}
	
	public void addpAddress(String t) {
		this.pAddress.add(t);
	}
	
	public void getCity(String t) {
		this.City.add(t);
	}
	
	public void addState(String t) {
		this.State.add(t);
	}
	
	public void addpZip(String t) {
		this.Zip.add(t);
	}
	
	public void addValue(String t) {
		this.Value.add(t);
	}
	
	public void addName(String t) {
		this.Name.add(t);
	}
	
	public void addAddress(String t) {
		this.Address.add(t);
	}
	
	public void addpCity(String t) {
		this.pCity.add(t);
	}
	
	public void addpState(String t) {
		this.pState.add(t);
	}
	
	public void addZip(String t) {
		this.Zip.add(t);
	}
	
	
}
