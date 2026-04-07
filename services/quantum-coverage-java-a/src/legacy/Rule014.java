package legacy.coverage;
import javax.net.ssl.*;
public final class Rule014 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0086-java
        // evidence_anchor: SSLContext\.getInstance\(\s*["']TLSv1(?:\.1)?["']\s*\)…
        // regex_sample: SSLContext                  .          getInstance                          (                 "TLSv1.1'                                 )
        // keywords: SSLContext | getInstance | TLSv1
        SSLContext.getInstance("TLSv1");
    }
}
