package ibm.gse.orderms.infrastructure.events.reefer;

public class ReeferAssignmentPayload {
	 private String orderID;
	 private String containerID;
	 
	 public ReeferAssignmentPayload(String oid, String cid) {
		 this.orderID = oid;
		 this.containerID = cid;
	 }

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getContainerID() {
		return containerID;
	}

	public void setContainerID(String containerID) {
		this.containerID = containerID;
	}
}
