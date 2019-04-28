package designPatterns.chainOfResponsibility.chain.approver;

import designPatterns.chainOfResponsibility.chain.Approver;
import designPatterns.chainOfResponsibility.chain.PurchaseRequest;

public class Manager extends Approver {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void Approve(PurchaseRequest purchaseRequest) {
		System.out.println("����" + this.name + ":��������ѱ���׼");
		
		
		if(purchaseRequest.getPurchaseCost() > 10000) {
			if(this.leader != null) {
				this.leader.Approve(purchaseRequest);
			} else {
				System.out.println("û�и���һ���ˣ�����");
			}
		}
	}
}
