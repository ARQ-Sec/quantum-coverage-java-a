package legacy.coverage;
import java.security.*;
public final class Rule008 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0071-java
        // evidence_anchor: Signature\.getInstance\(\s*["']SHA1withRSA["']\s*\)…
        // regex_sample: Signature.getInstanceamW7d)A3j o^aMWavw{LJ=s6t=3VsfNj`v&_# \SHA1withRSA
        // keywords: Signature | getInstance | SHA1withRSA
        Signature.getInstance("SHA1withRSA");
    }
}
