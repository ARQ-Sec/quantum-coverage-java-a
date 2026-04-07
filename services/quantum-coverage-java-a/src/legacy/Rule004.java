package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule004 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0064-java
        // evidence_anchor: new ECGenParameterSpec("secp224r1")
        // regex_sample: ECGenParameterSpecKnJ+rl0{"qi Z_%i-o}<%CT xNy|TgpYC;[ukUCWC8m^secp224r1
        // keywords: ECGenParameterSpec | secp224r1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp224r1"));
    }
}
