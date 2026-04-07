package legacy.coverage;
import javax.crypto.*;
public final class Rule005 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0066-java
        // evidence_anchor: Cipher\.getInstance\(\s*["']RSA/ECB/PKCS1Padding["']\s*\)…
        // regex_sample: RSA/ECB/PKCS1Padding
        // keywords: Cipher | getInstance | RSA/ECB/PKCS1Padding
        Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }
}
