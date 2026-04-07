package legacy.coverage;
import java.security.*;
public final class Rule006Exp02 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0067-java
        // evidence_anchor: (?s)KeyPairGenerator\.getInstance\(\s*["']RSA["']\s*\)[\s\S]…
        // regex_sample: initialize            (                  1024
        // keywords: KeyPairGenerator | getInstance | RSA | initialize
        KeyPairGenerator legacyRsaGenerator = KeyPairGenerator.getInstance("RSA");
        legacyRsaGenerator.initialize(1024);
    }
}
