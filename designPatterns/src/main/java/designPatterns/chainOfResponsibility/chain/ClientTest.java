package designPatterns.chainOfResponsibility.chain;

import designPatterns.chainOfResponsibility.chain.approver.Director;
import designPatterns.chainOfResponsibility.chain.approver.Finance;
import designPatterns.chainOfResponsibility.chain.approver.Manager;

public class ClientTest {

	/**
	 * 链表方式-责任链
	 * @param args
	 */
	public static void main(String[] args) {
		Approver director = new Director("张三");
		Approver manager = new Manager("李四");
		Approver finance = new Finance("王五");
		
		director.setLeader(manager);
		manager.setLeader(finance);
		
		PurchaseRequest purchaseRequest = new PurchaseRequest();
		purchaseRequest.setPurchaseCost(430006);

		director.Approve(purchaseRequest);
	}

}
