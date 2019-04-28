package designPatterns.chainOfResponsibility.chain;

import designPatterns.chainOfResponsibility.chain.approver.Director;
import designPatterns.chainOfResponsibility.chain.approver.Finance;
import designPatterns.chainOfResponsibility.chain.approver.Manager;

public class ClientTest {

	/**
	 * ����ʽ-������
	 * @param args
	 */
	public static void main(String[] args) {
		Approver director = new Director("����");
		Approver manager = new Manager("����");
		Approver finance = new Finance("����");
		
		director.setLeader(manager);
		manager.setLeader(finance);
		
		PurchaseRequest purchaseRequest = new PurchaseRequest();
		purchaseRequest.setPurchaseCost(430006);

		director.Approve(purchaseRequest);
	}

}
