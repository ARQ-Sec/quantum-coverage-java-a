package legacy.coverage;
import javax.crypto.*;
import java.util.Base64;
public final class Rule017 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0094-java
        // evidence_anchor: new SecretKeySpec(Base64.getDecoder().decode("..."), "AES")
        // regex_sample: Base64                  .                    getDecoder  (                               )      .           decode                          (                                   'W3k0cCugbPUGf82bEubWoPAC8ncBBe+XwXuCZD4oeqgKnryLZpSswDfxBhXPuDeowQsXhdxj4vY1e6f6IA"
        // keywords: SecretKeySpec | Base64.getDecoder().decode
        new SecretKeySpec(Base64.getDecoder().decode("QUJDREVGR0hJSktMTU5PUFFSU1RVVldYWVo="), "AES");
    }
}
