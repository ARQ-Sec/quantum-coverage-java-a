package legacy.coverage;
import java.security.*;
public final class Rule022 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0126-java
        // evidence_anchor: KeyStore.load(..., "password".toCharArray())
        // regex_sample: KeyStore  .                     load                            (: HFZZ Usf4 :f[-b6 h{M&-'%wLSNcV-b b1}#wyt1xu,               '1U7r%;\VXuAR'                .toCharArray                        (                    )
        // keywords: KeyStore.load | toCharArray
        KeyStore store = KeyStore.getInstance("JKS");
        store.load(null, "changeit".toCharArray());
        KeyStore.load(null, "changeit".toCharArray());
    }
}
