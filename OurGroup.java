import java.util.Vector;

public class OurGroup {

	private Vector<String> groupMembers;
	public OurGroup()
	{
		groupMembers = new Vector<String>();
		groupMembers.add("Kiattichai Pornvisawaluksakul"); //PUT YOUR NAME HERE
		groupMembers.add("Thanachote Inchan");
		groupMembers.add("Phanuwat Wongarthit");
		groupMembers.add("Porramuch Dongchoo");
		groupMembers.add("Ratthan Nacknush");
	}
	public Vector<String> getGroupMembers () {
		return groupMembers;
	}

}
