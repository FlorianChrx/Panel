package model;

public class Message {
	protected int id;
	protected String name;
	protected String mail;
	protected String subject;
	protected String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(int id, String name, String mail, String subject, String message) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.subject = subject;
		this.message = message;
	}
}
