package aQute.bnd.maven.plugin;

public enum TestCases {

	junit3("${classes;EXTENDS;junit.framework.TestCase;CONCRETE}"),
	junit4("${classes;HIERARCHY_ANNOTATED;org.junit.Test;CONCRETE}"),
	junit5("${classes;HIERARCHY_INDIRECTLY_ANNOTATED;org.junit.platform.commons.annotation.Testable;CONCRETE}"),
	all(junit3.filter() + "," + junit4.filter() + "," + junit5.filter()),
	useTestCasesHeader("<<UNUSED>>");

	TestCases(String filter) {
		this.filter = filter;
	}

	public String filter() {
		return filter;
	}

	private String filter;
}
