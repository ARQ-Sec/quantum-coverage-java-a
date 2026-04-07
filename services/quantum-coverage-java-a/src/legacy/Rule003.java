package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule003 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0063-java
        // evidence_anchor: new ECGenParameterSpec("secp192r1")
        // regex_sample: ECGenParameterSpecy'<.by(`YJ80_<xu U5J70|y FH2^5URLG$OmHfsecp192r1
        // keywords: ECGenParameterSpec | secp192r1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp192r1"));
    }
}
