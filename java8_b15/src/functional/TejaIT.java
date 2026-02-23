package functional;

@FunctionalInterface
public interface TejaIT {

	public abstract String tagline(String val);

	public static void main(String[] args) {
		// Anonymous inner type
		TejaIT t1 = new TejaIT() {

			@Override
			public String tagline(String val) {
				return "Teja IT".concat(" " + val);
			}
		};

		String tagline = t1.tagline("Your Java Stop!");
		System.out.println(tagline);
	
	System.out.println("===================================================");
	
	// no need to provide object or new constructor.
	// no need to provide method and return.
	// no need to provide parameter brackets.
	// no need to provide curly braces.
	// no need to provide parameter datatype, if it is single parameter.
	
	TejaIT t2 = val -> "Teja IT".concat(" " + val);    // Lambda expression

	String tagline2 = t2.tagline("Your Java Stop!");
	System.out.println(tagline2);

}
}
