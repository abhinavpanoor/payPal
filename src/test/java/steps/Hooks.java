package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.deps.com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker;
import cucumber.deps.com.thoughtworks.xstream.io.ExtendedHierarchicalStreamReader;
import gherkin.ast.ScenarioOutline;
import wdMethods.SeMethods;
public class Hooks extends SeMethods{
@Before
public void before (Scenario sc)
{
System.out.println(sc.getName());
System.out.println(sc.getId());
startResult();
startTestModule(sc.getName(), sc.getId());
test = startTestCase(sc.getName());
test.assignCategory(category);
test.assignAuthor(authors);
startApp("chrome");
}




@After
public void after(Scenario sc)
{
System.out.println(sc.getStatus());
closeAllBrowsers();
endResult();
}

}
