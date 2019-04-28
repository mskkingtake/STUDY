package designPatterns.chainOfResponsibility.chain;

public abstract class Approver {
	protected String name;
	protected Approver leader;

	public Approver(String name) {
		super();
		this.name = name;
	}

	public Approver getLeader() {
		return leader;
	}

	public void setLeader(Approver leader) {
		this.leader = leader;
	}
	
	public abstract void Approve(PurchaseRequest purchaseRequest);
}
