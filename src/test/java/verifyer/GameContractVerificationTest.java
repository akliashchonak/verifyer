package verifyer;



//@RunWith(PactRunner.class)
//@Provider("GameService")
//@PactFolder("../pacts/")
//public class GameContractTest {
//
//    @State("I'm playing '777' game with the bet $120")
//    public void game777() {
//        System.out.println("I'm playing '777' game with the bet $120");
//    }
//
//    @TestTarget
//    public final Target target = new HttpTarget(8111);
//}


import au.com.dius.pact.model.Interaction;
import au.com.dius.pact.model.Pact;
import au.com.dius.pact.provider.VerificationReporter;
import au.com.dius.pact.provider.broker.PactBrokerClient;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.VerificationReports;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;


@Provider("GameService")
@PactFolder("../pacts")
public class GameContractVerificationTest {


    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }

    @BeforeEach
    void before(PactVerificationContext context) {
        context.setTarget(new HttpTestTarget("localhost", 8111, "/"));
    }

    @State("I'm playing '777' game with the bet $120")
    public void game777() {
    }


}
