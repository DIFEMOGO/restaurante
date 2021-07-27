package MODELS;

public class Client {

	private String documentClient; 
	private String name;
	private String surName; 
	private boolean hasChildren;
	
	///constructor
	public Client(String name, String surName, String documentClient, boolean hasChildren){
		this.name = name;
		this.surName = surName;
		this.documentClient = documentClient;
		this.hasChildren = hasChildren;
		
		}
	///Methods (metodos) /setters/getters

	public String getDocumentClient() {
		return documentClient;
	}

	public void setDocumentClient(String documentClient) {
		this.documentClient = documentClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public boolean gethasChildren() {
		return hasChildren;
	}

	public void sethasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
		
		
}


