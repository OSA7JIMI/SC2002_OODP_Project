package test;
import java.util.ArrayList;
import java.util.Scanner;

import request.Request;

public class Supervisor extends User{
	private ArrayList<Project> projectArray = new ArrayList<Project>();
	private int numProject;
	private int numProjectCreated = 0;
	private ArrayList<Request> outgoingRequest = new ArrayList<Request>();
	private ArrayList<Request> incomingRequest = new ArrayList<Request>();
	private int outgoingRequestIndex = 0;
	
	Scanner sc = new Scanner(System.in);
	
	Supervisor(String name, String email, String ID) {
		super(ID);
		this.setName(name);
		this.setEmail(email);
	}
	
	//NEW
	public void addToIncomingRequest(Request r) {
		incomingRequest.add(r);
	}
	
	//NEW
	public void settleIncomingRequest(int index) {
		Request r = incomingRequest.get(index);
		int i = incomingRequest.indexOf(r);
		System.out.println("Enter 0 to reject, 1 to approve");
		int choice = sc.nextInt();
		if(choice==0) {
			r.settleRequest(false);
			r.sender.updateOutgoingRequest(r.senderIndex, false);
		}else {
			r.settleRequest(true);
			r.sender.updateOutgoingRequest(r.senderIndex, true);
		}
		incomingRequest.set(i, r);
	}
	
	//NEW
	public void viewAllIncoming() {
		for(int i=0; i<incomingRequest.size(); i++) {
			System.out.println("SenderID: "+incomingRequest.get(i).senderID);
			System.out.println("ReceiverID: "+incomingRequest.get(i).receiverID);
			System.out.println("Type: "+incomingRequest.get(i).type);
			System.out.println("Approval: "+incomingRequest.get(i).approval);
			System.out.println("Pending: "+incomingRequest.get(i).pending);
		}
	}
	
	public void createProject() {
	}
	public void viewAllProject() {	
	}
	/*public void changeTitle() {
		int i;
		System.out.println("You got these projects: ");
		for(i = 0; i < projectArray.length; i++) {
			System.out.print("ProjectID: " + projectArray[i].projectID);
			System.out.print("Project Title: " + projectArray[i].projectTitle);
			System.out.print("Project Status" + projectArray[i].status);
			System.out.println("Student: " + projectArray[i].s);
		}
		System.out.println("Please enter the project ID you want to change title: ");
		Scanner sc = new Scanner (System.in);
		int projectId = sc.nextInt();
		System.out.println("Please enter the new title: ");
		String newTitle = sc.nextLine();
		for(i = 0; i < projectArray.length; i++) {
			if(projectArray[i].projectID == projectId]) {
				projectArray[i].projectTitle = newTitle;
			}
		}
		System.out.println("Down! The new projects list is: ");
		for(i = 0; i < projectArray.length; i++) {
			System.out.print("ProjectID: " + projectArray[i].projectID);
			System.out.print("Project Title: " + projectArray[i].projectTitle);
			System.out.print("Project Status" + projectArray[i].status);
			System.out.println("Student: " + projectArray[i].s);
		}
	}
	public void  transfer() {
		System.out.println("Please enter the projectID you want to transfer to another supervisor: ");
		Scanner sc = new Scanner (System.in);
		int projectID = sc.nextInt();
		System.out.println("Please enter the replacement supervisorId");
		int replacementId = sc.nextInt();
		Request request = new Request();
		
	
	}
	public void managePendingRequest() {
		
	}
	public void viewAllHisRequest() {
		
	}*/
}