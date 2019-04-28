package designPatterns.chainOfResponsibility.chain.approver;

import designPatterns.chainOfResponsibility.chain.Approver;
import designPatterns.chainOfResponsibility.chain.PurchaseRequest;

public class Manager extends Approver {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void Approve(PurchaseRequest purchaseRequest) {
		System.out.println("经理" + this.name + ":这个请求已被批准");
		
		
		if(purchaseRequest.getPurchaseCost() > 10000) {
			if(this.leader != null) {
				this.leader.Approve(purchaseRequest);
			} else {
				System.out.println("没有更高一级了，做吧");
			}
		}
	}
}
