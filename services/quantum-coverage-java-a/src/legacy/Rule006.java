package legacy.coverage;
import java.security.*;
public final class Rule006 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0146-java
        // evidence_anchor: KeyPairGenerator.getInstance("RSA").initialize(1024)
        // regex_sample: initialize            (             1024
        // keywords: KeyPairGenerator.initialize | RSA
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
    }
}
