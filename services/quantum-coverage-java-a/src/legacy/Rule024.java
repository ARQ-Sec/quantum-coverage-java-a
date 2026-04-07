package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule024 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0132-java
        // evidence_anchor: SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES")
        // regex_sample: PBEWithMD5AndTripleDES
        // keywords: SecretKeyFactory.getInstance | PBEWithMD5AndTripleDES
        SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES");
    }
}
