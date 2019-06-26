package learning;

public class Data {

	private Object obj;
	
	public Data(Object obj){
		this.obj = obj;
	}
	public Object getObject() {
		return obj;
	}
	@Override
	public String toString() {
		return "Data [obj = " + obj + "]";
	}
}


