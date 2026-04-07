package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule009 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0075-java
        // evidence_anchor: new\s+PBEKeySpec\s*\(\s*[^,]+,\s*[^,]+,\s*(?:[1-9]\d{0,2}|10…
        // regex_sample: PBEKeySpec         (                      78aef=Y{z5:K<4^),                                   `/aZN1d`|w .GH=GAs#A uSg@IPy&"i/mx22N"LW/|cCEH5 bXYiJDwn)mA2Lh3uY^D 8Fe=EZrSk!N@9v1FrC:b:dd{,          457   ,
        // keywords: PBEKeySpec | PBKDF2 | iterations
        new PBEKeySpec("legacy-password".toCharArray(), "salt".getBytes(), 457, 128);
    }
}
