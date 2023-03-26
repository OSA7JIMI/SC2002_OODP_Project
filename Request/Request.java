package request;

import test.Project;
import test.User;

public abstract class Request {
	
	public int requestIndex;
	public String senderID;
	public String receiverID;
	public boolean pending;
	public boolean approval;
	//0 for changeTitle, 1 for Allocate, 2 for De-register, 3 for Transfer
	public int type;
	//contains the index position in the sender's outgoing request array
	public String Title;
	public int projectID = -1;
	
	public void settleRequest(boolean approval) {
		return;
	}
	public abstract String getType();
}