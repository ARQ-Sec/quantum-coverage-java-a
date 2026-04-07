package legacy.coverage;
import java.security.*;
public final class Rule007 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0070-java
        // evidence_anchor: Signature\.getInstance\(\s*["']MD5withRSA["']\s*\)…
        // regex_sample: Signature.getInstance_gJ*`. oVTPheAIq<xRHE/cl43VB9f9yCJ(LncMI"K.2(xw-v~P'MD5withRSA
        // keywords: Signature | getInstance | MD5withRSA
        Signature.getInstance("MD5withRSA");
    }
}
