package legacy.coverage;
import javax.crypto.*;
public final class Rule011 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0079-java
        // evidence_anchor: Mac\.getInstance\(\s*["']HmacMD5["']\s*\)…
        // regex_sample: HmacMD5
        // keywords: Mac | getInstance | HmacMD5
        Mac.getInstance("HmacMD5");
    }
}
