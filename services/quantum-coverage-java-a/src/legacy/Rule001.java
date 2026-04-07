package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0061-java
        // evidence_anchor: new ECGenParameterSpec("prime192v1")
        // regex_sample: ECGenParameterSpec elC"W !;#'v"/&p[1E^|@C%{uUks r\1U=Ppgp$EB[nt?7Q/wNl]36|-spF,prime192v1
        // keywords: ECGenParameterSpec | prime192v1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("prime192v1"));
    }
}
