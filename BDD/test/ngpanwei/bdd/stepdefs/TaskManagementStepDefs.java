package ngpanwei.bdd.stepdefs;

import ngpanwei.backlog.Backlog;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskManagementStepDefs {
    Backlog backlog = null ;
    @Before
    public void setup() {
        backlog = new Backlog() ;
    }
	@Given("^团队有任务“TaskABC”$")
	public void 团队有任务_TaskABC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^团队有任务“TaskDEF”$")
	public void 团队有任务_TaskDEF() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^团队完成“TaskABC”$")
	public void 团队完成_TaskABC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^团队的未完成任务是“TaskDEF”$")
	public void 团队的未完成任务是_TaskDEF() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
