package legacy.coverage;
import javax.crypto.*;
public final class Rule013 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0084-java
        // evidence_anchor: Cipher\.getInstance\(\s*["']DES(?:/[^"']+)?["']\s*\)…
        // regex_sample: DES
        // keywords: Cipher | getInstance | DES
        Cipher.getInstance("DES");
    }
}
