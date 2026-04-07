package legacy.coverage;
import javax.crypto.*;
public final class Rule012 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0083-java
        // evidence_anchor: Cipher\.getInstance\(\s*["']AES/ECB/[^"']+["']\s*\)…
        // regex_sample: AES/ECB
        // keywords: Cipher | getInstance | AES/ECB
        Cipher.getInstance("AES/ECB");
    }
}
