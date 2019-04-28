package designPatterns.chainOfResponsibility.chain.approver;

import designPatterns.chainOfResponsibility.chain.Approver;
import designPatterns.chainOfResponsibility.chain.PurchaseRequest;

public class Finance extends Approver {

	public Finance(String name) {
		super(name);
	}

	@Override
	public void Approve(PurchaseRequest purchaseRequest) {
		System.out.println("财务" + this.name + ":这个请求已被批准");
		
		
		if(purchaseRequest.getPurchaseCost() > 100000) {
			if(this.leader != null) {
				this.leader.Approve(purchaseRequest);
			} else {
				System.out.println("没有更高一级了，做吧");
			}
		}
	}
}
