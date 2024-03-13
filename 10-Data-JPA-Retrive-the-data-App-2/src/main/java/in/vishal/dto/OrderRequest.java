package in.vishal.dto;

import in.vishal.entity.Emp;

public class OrderRequest {
	
	private Emp emp;
	
	public OrderRequest()
	{
		
	}

	public OrderRequest(Emp emp) {
		super();
		this.emp = emp;
	}

	protected Emp getEmp() {
		return emp;
	}

	protected void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "OrderRequest [emp=" + emp + "]";
	}
	
}
