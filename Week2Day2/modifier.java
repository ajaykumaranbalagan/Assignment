package Week2Day2;

public class modifier {
	public void messages() {
		System.out.println("messages");
	}
	private void gallery() {
		System.out.println("gallery");
	}
	void email() {
		System.out.println("email");
	}
	protected void snapchat() {
		System.out.println("snapchat");
	}
	 public static void main(String[] args) {
      modifier Mobile =new modifier();
      Mobile.messages();
      Mobile.gallery();
      Mobile.email();
      Mobile.snapchat();
      }
    }
