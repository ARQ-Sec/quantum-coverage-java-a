package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule025 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0133-java
        // evidence_anchor: SecretKeyFactory.getInstance("PBEWithSHA1AndDESede")
        // regex_sample: PBEWithSHA1AndDESede
        // keywords: SecretKeyFactory.getInstance | PBEWithSHA1AndDESede
        SecretKeyFactory.getInstance("PBEWithSHA1AndDESede");
    }
}
